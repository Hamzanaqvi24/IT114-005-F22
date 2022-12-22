<table><tr><td> <em>Assignment: </em> IT114 - Number Guesser</td></tr>
<tr><td> <em>Student: </em> Hamza Naqvi (han3)</td></tr>
<tr><td> <em>Generated: </em> 10/4/2022 10:09:00 PM</td></tr>
<tr><td> <em>Grading Link: </em> <a rel="noreferrer noopener" href="https://learn.ethereallab.app/homework/IT114-005-F22/it114-number-guesser/grade/han3" target="_blank">Grading</a></td></tr></table>
<table><tr><td> <em>Instructions: </em> <ol><li>Create the below branch name</li><li>Implement the NumberGuess4 example from the lesson/slides</li><li>Add/commit the files as-is from the lesson material (this is the base template)</li><li>Pick two (2) of the following options to implement</li><ol><li>Display higher or lower as a hint after a wrong guess</li><li>Implement anti-data tampering of the save file data (reject user direct edits)</li><li>Add a difficulty selector that adjusts the max strikes per level</li><li>Display a cold, warm, hot indicator based on how close to the correct value the guess is (example, 10 numbers away is cold, 5 numbers away is warm, 2 numbers away is hot; adjust these per your preference)</li><li>Add a hint command that can be used once per level and only after 2 strikes have been used that reduces the range around the correct number (i.e., number is 5 and range is initially 1-15, new range could be 3-8 as a hint)</li><li>Implement separate save files based on a "What's your name?" prompt at the start of the game</li></ol><li>Fill in the below deliverables</li><li>Create an m3_submission.md file and fill in the markdown from this tool when you're done</li><li>Git add/commit/push your changes to the HW branch</li><li>Create a pull request to main</li><li>Complete the pull request</li><li>Grab the link to the m3_submission.md from the main branch and submit that direct link to github</li></ol></td></tr></table>
<table><tr><td> <em>Deliverable 1: </em> Implementation 1 (one of the picked items) </td></tr><tr><td><em>Status: </em> <img width="100" height="20" src="http://via.placeholder.com/400x120/009955/fff?text=Complete"></td></tr>
<tr><td><table><tr><td> <em>Sub-Task 1: </em> Two Screenshots: Add a screenshot demonstrating the feature during runtime; Add a screenshot (or so) of the snippets of code that implement the feature</td></tr>
<tr><td><table><tr><td><img width="768px" src="https://user-images.githubusercontent.com/90913457/193962714-edb098dc-eba1-4750-9145-a1d15da84272.png"/></td></tr>
<tr><td> <em>Caption:</em> <p>Implementation #1: Display higher or lower as a hint after a wrong guess<br></p>
</td></tr>
</table></td></tr>
<tr><td> <em>Sub-Task 2: </em> Briefly explain the logic behind your implementation</td></tr>
<tr><td> <em>Response:</em> <p>Added a if statement in the processGuess method that if the guess is<br>lower or higher than the input number it will give a message to<br>the user. The if statement added was:&nbsp;<div><br></div><div><div style="color: rgb(255, 255, 255); background-color: rgb(0,<br>0, 0); font-family: Menlo, Monaco, &quot;Courier New&quot;, monospace; font-size: 12px; line-height: 18px; white-space:<br>pre;"><div><span style="color: #4ec9b0;">String</span> <span style="color: #9cdcfe;">hint</span> <span style="color: #d4d4d4;">=</span> <span style="color: #ce9178;">&quot;&quot;</span>;</div><div> <br>          <span style="color: #c586c0;">if</span><br>(<span style="color: #9cdcfe;">guess</span> <span style="color: #d4d4d4;">&gt;</span> <span style="color: #9cdcfe;">number</span>) {</div><div>   <br>            &lt;span<br>style=&quot;color: #9cdcfe;&quot;&gt;hint</span> <span style="color: #d4d4d4;">=</span> <span style="color: #ce9178;">&quot;Select lower value&quot;</span>;</div><div>   <br>        } <span style="color: #c586c0;">else</span> &lt;span<br>style=&quot;color: #c586c0;&quot;&gt;if</span> (<span style="color: #9cdcfe;">guess</span> <span style="color: #d4d4d4;">&lt;</span> <span style="color: #9cdcfe;">number</span>) {</div><div> <br>            <br> <span style="color: #9cdcfe;">hint</span> <span style="color: #d4d4d4;">=</span> <span style="color: #ce9178;">&quot;Select higher value&quot;</span>;</div><div> <br>          }</div></div><div><br></div></div><br></p><br></td></tr>
</table></td></tr>
<table><tr><td> <em>Deliverable 2: </em> Implementation 2 (one of the picked items) </td></tr><tr><td><em>Status: </em> <img width="100" height="20" src="http://via.placeholder.com/400x120/009955/fff?text=Complete"></td></tr>
<tr><td><table><tr><td> <em>Sub-Task 1: </em> Two Screenshots: Add a screenshot demonstrating the feature during runtime; Add a screenshot (or so) of the snippets of code that implement the feature</td></tr>
<tr><td><table><tr><td><img width="768px" src="https://user-images.githubusercontent.com/90913457/193962767-442e59bf-ebe9-4309-9f1d-054e9cf815f1.png"/></td></tr>
<tr><td> <em>Caption:</em> <p>Implementation #2: Add a difficulty selector that adjusts the max strikes per level<br></p>
</td></tr>
</table></td></tr>
<tr><td> <em>Sub-Task 2: </em> Briefly explain the logic behind your implementation</td></tr>
<tr><td> <em>Response:</em> <p>Created a new method named changeDifficultyLevel that if the max strikes is greater<br>than 1 it would decrease the value and if it was less than<br>5 it would increase the value. For some reason the method will not<br>work.&nbsp;<br></p><br></td></tr>
</table></td></tr>
<table><tr><td> <em>Deliverable 3: </em> Misc </td></tr><tr><td><em>Status: </em> <img width="100" height="20" src="http://via.placeholder.com/400x120/009955/fff?text=Complete"></td></tr>
<tr><td><table><tr><td> <em>Sub-Task 1: </em> Add a link to the related pull request of this hw</td></tr>
<tr><td> <a rel="noreferrer noopener" target="_blank" href="https://github.com/Hamzanaqvi24/IT114-005-F22/pull/4">https://github.com/Hamzanaqvi24/IT114-005-F22/pull/4</a> </td></tr>
<tr><td> <em>Sub-Task 2: </em> Discuss anything you learned during this lesson/hw or any struggles you had</td></tr>
<tr><td> <em>Response:</em> <p>I struggled trying to create the second implementation which was to add a<br>difficulty selector that adjusts the max strikes per level. For some reason the<br>method implementation worked on my JGRASP IDE but not on visual code studio.&nbsp;<br></p><br></td></tr>
</table></td></tr>
<table><tr><td><em>Grading Link: </em><a rel="noreferrer noopener" href="https://learn.ethereallab.app/homework/IT114-005-F22/it114-number-guesser/grade/han3" target="_blank">Grading</a></td></tr></table>