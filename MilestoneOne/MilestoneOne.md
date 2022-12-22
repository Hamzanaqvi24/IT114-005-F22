<table><tr><td> <em>Assignment: </em> It114 Milestone1</td></tr>
<tr><td> <em>Student: </em> Hamza Naqvi (han3)</td></tr>
<tr><td> <em>Generated: </em> 12/19/2022 3:00:46 PM</td></tr>
<tr><td> <em>Grading Link: </em> <a rel="noreferrer noopener" href="https://learn.ethereallab.app/homework/IT114-005-F22/it114-milestone1/grade/han3" target="_blank">Grading</a></td></tr></table>
<table><tr><td> <em>Instructions: </em> <ol><li>Create a new branch called Milestone1</li><li>At the root of your repository create a folder called Project</li><li>Create a milestone1.md file inside the project folder</li><li>Git add/commit/push it to Github</li><li>Create a pull request from Milestone1 to main (don't complete/merge it yet)</li><li>Copy in the latest Socket sample code from the most recent Socket Part example of the lessons</li><ol><li>Recommended Part 5, but Part 4 should be sufficient</li><li><a href="https://github.com/MattToegel/IT114/tree/Module5/Module5">https://github.com/MattToegel/IT114/tree/Module5/Module5</a>&nbsp;<br></li></ol><li>Git add/commit the baseline</li><li>Ensure the sample is working and fill in the below deliverables</li><li>Get the markdown content or the file and paste it into the milestone1.md file or replace the file with the downloaded version</li><li>Git add/commit/push all changes</li><li>Complete the pull request merge from step 5</li><li>Locally checkout main</li><li>git pull origin main</li></ol></td></tr></table>
<table><tr><td> <em>Deliverable 1: </em> Startup </td></tr><tr><td><em>Status: </em> <img width="100" height="20" src="http://via.placeholder.com/400x120/009955/fff?text=Complete"></td></tr>
<tr><td><table><tr><td> <em>Sub-Task 1: </em> Add screenshot showing your server being started and running</td></tr>
<tr><td><table><tr><td><img width="768px" src="https://user-images.githubusercontent.com/90913457/208500281-5199727e-5c7e-4079-8f44-5eb206ee1ee1.png"/></td></tr>
<tr><td> <em>Caption:</em> <p>Server and Client started<br></p>
</td></tr>
</table></td></tr>
<tr><td> <em>Sub-Task 2: </em> Add screenshot showing your client being started and running</td></tr>
<tr><td><table><tr><td><img width="768px" src="https://user-images.githubusercontent.com/90913457/208500281-5199727e-5c7e-4079-8f44-5eb206ee1ee1.png"/></td></tr>
<tr><td> <em>Caption:</em> <p>Server and Client started<br></p>
</td></tr>
</table></td></tr>
<tr><td> <em>Sub-Task 3: </em> Briefly explain the connection process</td></tr>
<tr><td> <em>Response:</em> <p>The server-side of the connection is through the Server class. The server class<br>runs an infinite loop in order to continue to accept the incoming requests.<br>It keeps track of the connected users and devices. The client-side of the<br>connection is through the Client class which starts the client program. The client<br>then connects to a specified server and once that connection is made it<br>creates threads.<br></p><br></td></tr>
</table></td></tr>
<table><tr><td> <em>Deliverable 2: </em> Sending/Receiving </td></tr><tr><td><em>Status: </em> <img width="100" height="20" src="http://via.placeholder.com/400x120/009955/fff?text=Complete"></td></tr>
<tr><td><table><tr><td> <em>Sub-Task 1: </em> Add screenshot(s) showing evidence related to the checklist</td></tr>
<tr><td><table><tr><td><img width="768px" src="https://user-images.githubusercontent.com/90913457/208502744-53e5caaf-3c45-4287-8977-abfc1cbaee54.png"/></td></tr>
<tr><td> <em>Caption:</em> <p>2nd Client Connected<br></p>
</td></tr>
<tr><td><img width="768px" src="https://user-images.githubusercontent.com/90913457/208502784-f9a46ceb-3f8c-48b6-8d9c-500f6bd24d99.png"/></td></tr>
<tr><td> <em>Caption:</em> <p>Messages between two clients<br></p>
</td></tr>
<tr><td><img width="768px" src="https://user-images.githubusercontent.com/90913457/208502864-65228d26-38c1-4665-963c-5ea1b1790985.png"/></td></tr>
<tr><td> <em>Caption:</em> <p>Creating Testroom<br></p>
</td></tr>
<tr><td><img width="768px" src="https://user-images.githubusercontent.com/90913457/208502930-6cd4f8be-8599-4ff3-9042-474f4b8419bb.png"/></td></tr>
<tr><td> <em>Caption:</em> <p>Joining Testroom<br></p>
</td></tr>
</table></td></tr>
<tr><td> <em>Sub-Task 2: </em> Briefly explain how the messages are sent, broadcasted, and received</td></tr>
<tr><td> <em>Response:</em> <p>When the client writes and sends a message, they send the message type<br>object to the server which then receives the message type and decodes it.<br>Messages are sent through the sendMessage() and connected through the sendConnect() method. The<br>two methods are also used in the ServerThread class as the sendMessage() method<br>is used to send messages back to the client and the sendConnectionStatus() to<br>send a connect/disconnect event back to the client. In terms of the room<br>perspective, more methods are created and implemented in order to make the code<br>more clear and organized. This way the room is informing the user on<br>what they need to know.<br></p><br></td></tr>
</table></td></tr>
<table><tr><td> <em>Deliverable 3: </em> Disconnecting / Terminating </td></tr><tr><td><em>Status: </em> <img width="100" height="20" src="http://via.placeholder.com/400x120/009955/fff?text=Complete"></td></tr>
<tr><td><table><tr><td> <em>Sub-Task 1: </em> Add screenshot(s) showing evidence related to the checklist on the right</td></tr>
<tr><td><table><tr><td><img width="768px" src="https://user-images.githubusercontent.com/90913457/208503005-868f5a9e-7dbb-4832-847b-26e3ce92e2cc.png"/></td></tr>
<tr><td> <em>Caption:</em> <p>Client 2 (Jim) Disconnect<br></p>
</td></tr>
<tr><td><img width="768px" src="https://user-images.githubusercontent.com/90913457/208503042-f2749fb6-dcf5-48a5-9e8d-0030e1dced2c.png"/></td></tr>
<tr><td> <em>Caption:</em> <p>Client 1 (Hamza) Disconnect <br></p>
</td></tr>
</table></td></tr>
<tr><td> <em>Sub-Task 2: </em> Briefly explain how the various disconnects/terminations are handled</td></tr>
<tr><td> <em>Response:</em> <p>When the socket closes, it disconnects the client. The reason why the client<br>program doesn&#39;t crash when the server disconnects is because the client can still<br>communicate with the server with the socket being open. Likewise, the server doesn&#39;t<br>crash from the client disconnecting because the server can communicate with the client<br>since the socket is still open.&nbsp;<br></p><br></td></tr>
</table></td></tr>
<table><tr><td> <em>Deliverable 4: </em> Misc </td></tr><tr><td><em>Status: </em> <img width="100" height="20" src="http://via.placeholder.com/400x120/009955/fff?text=Complete"></td></tr>
<tr><td><table><tr><td> <em>Sub-Task 1: </em> Add the pull request for this branch</td></tr>
<tr><td> <a rel="noreferrer noopener" target="_blank" href="https://github.com/Hamzanaqvi24/IT114-005-F22/pull/7">https://github.com/Hamzanaqvi24/IT114-005-F22/pull/7</a> </td></tr>
</table></td></tr>
<table><tr><td><em>Grading Link: </em><a rel="noreferrer noopener" href="https://learn.ethereallab.app/homework/IT114-005-F22/it114-milestone1/grade/han3" target="_blank">Grading</a></td></tr></table>