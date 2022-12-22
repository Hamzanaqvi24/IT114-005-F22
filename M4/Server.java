package M4;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random; //Roll a dice, and coin flip
import java.util.regex.Pattern;

public class Server {
    int port = 3001;
    // connected clients
    private List<ServerThread> clients = new ArrayList<ServerThread>();

    private void start(int port) {
        this.port = port;
        // server listening
        try (ServerSocket serverSocket = new ServerSocket(port);) {
            Socket incoming_client = null;
            System.out.println("Server is listening on port " + port);
            do {
                System.out.println("waiting for next client");
                if (incoming_client != null) {
                    System.out.println("Client connected");
                    ServerThread sClient = new ServerThread(incoming_client, this);
                    
                    clients.add(sClient);
                    sClient.start();
                    incoming_client = null;
                    
                }
            } while ((incoming_client = serverSocket.accept()) != null);
        } catch (IOException e) {
            System.err.println("Error accepting connection");
            e.printStackTrace();
        } finally {
            System.out.println("closing server socket");
        }
    }
    protected synchronized void disconnect(ServerThread client) {
		long id = client.getId();
        client.disconnect();
		broadcast("Disconnected", id);
	}
    
    protected synchronized void broadcast(String message, long id) 
    {
        if(processCommand(message, id)){

            return;
        }
        // let's temporarily use the thread id as the client identifier to
        // show in all client's chat. This isn't good practice since it's subject to
        // change as clients connect/disconnect
        message = String.format("User[%d]: %s", id, message);
        // end temp identifier
        
        // loop over clients and send out the message
        Iterator<ServerThread> it = clients.iterator();
        while (it.hasNext()) {
            ServerThread client = it.next();
            boolean wasSuccessful = client.send(message);
            if (!wasSuccessful) {
                System.out.println(String.format("Removing disconnected client[%s] from list", client.getId()));
                it.remove();
                broadcast("Disconnected", id);
            }
        }
    }

    private boolean processCommand(String message, long clientId){
        System.out.println("Checking command: " + message);
        
        //Flip a coin implementation
        if(message.equalsIgnoreCase("flip"))
        {
        	String result = flip();
        	this.broadcast(result, clientId);
        }//End if
        
        //Dice roller implementation
        if(message.contains("roll"))
        {
        	//Parsing message
        	String[] x = message.split("roll");
        	String diceRolled = x[1]; //Don't ask why
        	String rolled = roll(diceRolled);
        	this.broadcast(rolled, clientId);
        }//End if
        
        //Disconnect
        if(message.equalsIgnoreCase("disconnect")){
            Iterator<ServerThread> it = clients.iterator();
            while (it.hasNext()) {
                ServerThread client = it.next();
                if(client.getId() == clientId){
                    it.remove();
                    disconnect(client);
                    
                    break;
                }
            }
            return true;
        }
        return false;
    }
    
    private String flip()
    {
    	Random x = new Random();
    	int flip = x.nextInt(2); //Flip a coin
    	
    	switch(flip)
    	{
    		case 0:
    		{
    			return("Flipped a coin, it's heads!");
    		}//0
    		case 1:
    		{
    			return("Flipped a coin, it's tails!");
    		}//1
    		default:
    		{
    			return("Flipped a coin, an error has occured!");
    		}//default
    	}//End switch
    }//End flip
    
    private String roll(String dice)
    {
    	//Remember to turn the rolled int into a string
    	String[] step2 = dice.split("d"); //EX: 1d4, [1,4] as strings
		
		int[] nums = new int[2];
		for(int i = 0; i < step2.length; i++)
		{
			nums[i] = Integer.parseInt(step2[i]);//EX: 1d4, [1,4] as integers
		}//End for
		
		//loop where 1d4 is randomized
		Random x = new Random();
		int roll = 0;//Roll total
		int die = nums[1] + 1; //Random.nextInt(int bound). Outer bound is exclusive
		for(int i = 0; i < nums[0]; i++)
		{
			roll += x.nextInt(die);
		}
		return("Rolled " + dice + "! Rolled " + roll);
    }//End 
    
    
    
    public static void main(String[] args) 
    {
        System.out.println("Starting Server");
        Server server = new Server();
        int port = 3000;
        try {
            port = Integer.parseInt(args[0]);
        } catch (Exception e) {
            // can ignore, will either be index out of bounds or type mismatch
            // will default to the defined value prior to the try/catch
        }
        server.start(port);
        System.out.println("Server Stopped");
    }
}