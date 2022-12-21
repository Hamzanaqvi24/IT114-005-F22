<table><tr><td> <em>Assignment: </em> IT114 Chatroom Milestone 2</td></tr>
<tr><td> <em>Student: </em> Hamza Naqvi (han3)</td></tr>
<tr><td> <em>Generated: </em> 12/21/2022 12:40:54 PM</td></tr>
<tr><td> <em>Grading Link: </em> <a rel="noreferrer noopener" href="https://learn.ethereallab.app/homework/IT114-005-F22/it114-chatroom-milestone-2/grade/han3" target="_blank">Grading</a></td></tr></table>
<table><tr><td> <em>Instructions: </em> <p>Implement the features from Milestone2 from the proposal document:&nbsp; <a href="https://docs.google.com/document/d/1ONmvEvel97GTFPGfVwwQC96xSsobbSbk56145XizQG4/view">https://docs.google.com/document/d/1ONmvEvel97GTFPGfVwwQC96xSsobbSbk56145XizQG4/view</a></p>
</td></tr></table>
<table><tr><td> <em>Deliverable 1: </em> Payload </td></tr><tr><td><em>Status: </em> <img width="100" height="20" src="http://via.placeholder.com/400x120/009955/fff?text=Complete"></td></tr>
<tr><td><table><tr><td> <em>Sub-Task 1: </em> Payload Screenshots</td></tr>
<tr><td><table><tr><td><img width="768px" src="https://user-images.githubusercontent.com/90913457/208962700-74b9a73f-5b01-4491-b935-ac92223b1b6e.png"/></td></tr>
<tr><td> <em>Caption:</em> <p>Payload Code<br></p>
</td></tr>
<tr><td><img width="768px" src="https://user-images.githubusercontent.com/90913457/208962720-a216878b-b25b-4ac2-8d87-d402b432cb40.png"/></td></tr>
<tr><td> <em>Caption:</em> <p>Payload Code<br></p>
</td></tr>
<tr><td><img width="768px" src="https://user-images.githubusercontent.com/90913457/208964256-dd21f5ff-341e-42f3-8557-da2ad2190890.png"/></td></tr>
<tr><td> <em>Caption:</em> <p>Terminal Screenshot<br></p>
</td></tr>
</table></td></tr>
</table></td></tr>
<table><tr><td> <em>Deliverable 2: </em> Server-side commands </td></tr><tr><td><em>Status: </em> <img width="100" height="20" src="http://via.placeholder.com/400x120/009955/fff?text=Complete"></td></tr>
<tr><td><table><tr><td> <em>Sub-Task 1: </em> Show the code for the mentioned commands</td></tr>
<tr><td><table><tr><td><img width="768px" src="https://user-images.githubusercontent.com/90913457/208962751-b45d2ddd-190e-423b-803b-7b101520d474.png"/></td></tr>
<tr><td> <em>Caption:</em> <p>Roll/Flip code<br></p>
</td></tr>
<tr><td><img width="768px" src="https://user-images.githubusercontent.com/90913457/208962806-26dddfc4-e2e1-48c6-ab70-48da34bf9ffa.png"/></td></tr>
<tr><td> <em>Caption:</em> <p>Roll/Flip code<br></p>
</td></tr>
<tr><td><img width="768px" src="https://user-images.githubusercontent.com/90913457/208962829-919ca6a2-0631-43d5-ad64-e769cce06199.png"/></td></tr>
<tr><td> <em>Caption:</em> <p>Roll/Flip code<br></p>
</td></tr>
</table></td></tr>
<tr><td> <em>Sub-Task 2: </em> Explain the logic/implementation of each commands</td></tr>
<tr><td> <em>Response:</em> <p>The roll method that was implemented in my chatroom application uses a simple<br>random number generator that has produces integer values from 1-6. The random number<br>generator then displays the number to the user in special characters bold which<br>has been set as default. The flip method applies similar logic as far<br>as using the random number generator, however can only generate two values either<br>0 or 1. If the value that is generated is 1, then the<br>code will finish executing and will display the user with heads in bold.<br>If the value generated is not 1, then the user is displayed tails.<br>The user just needs to user input /roll or /flip into the chatroom<br>message box.<br></p><br></td></tr>
</table></td></tr>
<table><tr><td> <em>Deliverable 3: </em> Text Display </td></tr><tr><td><em>Status: </em> <img width="100" height="20" src="http://via.placeholder.com/400x120/009955/fff?text=Complete"></td></tr>
<tr><td><table><tr><td> <em>Sub-Task 1: </em> Show the code for the various style handling</td></tr>
<tr><td><table><tr><td><img width="768px" src="https://user-images.githubusercontent.com/90913457/208962903-88a9f763-0dde-43fd-b605-6de9a4d57389.png"/></td></tr>
<tr><td> <em>Caption:</em> <p>Special characters Code<br></p>
</td></tr>
<tr><td><img width="768px" src="https://user-images.githubusercontent.com/90913457/208962931-f3e10b8c-c911-40ff-9ed5-d0bf6d67511e.png"/></td></tr>
<tr><td> <em>Caption:</em> <p>Special characters Code<br></p>
</td></tr>
</table></td></tr>
<tr><td> <em>Sub-Task 2: </em> Show source message and the result output in the terminal (note, you won't actually see the styles until Milestone3)</td></tr>
<tr><td><table><tr><td><img width="768px" src="https://user-images.githubusercontent.com/90913457/208962983-e68d2505-c4c2-45f4-aeab-ab802b5e0d36.png"/></td></tr>
<tr><td> <em>Caption:</em> <p>Roll/Flip and special characters demo<br></p>
</td></tr>
</table></td></tr>
<tr><td> <em>Sub-Task 3: </em> Explain how you got each style applied</td></tr>
<tr><td> <em>Response:</em> <p>Each style was applied by first switching the JEditorPane in the UserListPanel.java file<br>to &quot;text/html&quot;. Then in the Room.java file, I implemented the formatMessage() method which<br>converted the html tags to different tags in order to use them in<br>the chatroom. All of the needed utilities provided by java were imported like<br>the HashMap and the Map.entry. As well as the commands needed for the<br>HashMap converter. The bold, italic, underline, and color features are conducted by using<br>the special converted character designated for them. For bold, the user would input<br>two ateriks (*) wrapped in the text, like <strong>hi</strong>. The same applies for<br>all special characters like italics (ex. --hi--) and underline (ex. <strong>hi</strong>). For color,<br>the #r#, #b#, and #g# characters wrap the text. Similarly to the special<br>characters, the colors would be applied by the user by inputting (#r#hi#r#) for<br>hi in red, (#b#hello#b#) for hello in blue, and (#g#no#g#) for no in<br>green.&nbsp;<br></p><br></td></tr>
</table></td></tr>
<table><tr><td> <em>Deliverable 4: </em> Misc </td></tr><tr><td><em>Status: </em> <img width="100" height="20" src="http://via.placeholder.com/400x120/009955/fff?text=Complete"></td></tr>
<tr><td><table><tr><td> <em>Sub-Task 1: </em> Include the pull request for Milestone2 to main</td></tr>
<tr><td> <a rel="noreferrer noopener" target="_blank" href="https://github.com/Hamzanaqvi24/IT114-005-F22/pull/8">https://github.com/Hamzanaqvi24/IT114-005-F22/pull/8</a> </td></tr>
</table></td></tr>
<table><tr><td><em>Grading Link: </em><a rel="noreferrer noopener" href="https://learn.ethereallab.app/homework/IT114-005-F22/it114-chatroom-milestone-2/grade/han3" target="_blank">Grading</a></td></tr></table>