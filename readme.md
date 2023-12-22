
README for word games
---------------------

A guide for developers working on this codebase on how to run tests, and build an executable.

How The Game Works
----------------------
The user is presented with a randomly generated 5 letter word that has been scrambled. <br/>
The user must guess what the unscrambled version of the word is. <br/>
If the user's guess is correct, they are congratulated. <br/>
If the user's guess is incorrect, they are commiserated. <br/>
The games runs twice. The second word to guess will never be the same as the first.<br/>
After running twice, the game ends.<br/>


Prerequisites
-------------
Install Java TODO <br/>
Install command line compiler following instructions [here](https://kotlinlang.org/docs/command-line.html). 


Run tests
---------

To run tests enter this command from the root of the project: 
```./gradlew test```


Build
-----
Get an executable (or .jar in this case): <br/>

From the root of your Word Games project, follow this path: <br/>
./src/main/kotlin

run the following steps from your terminal:
```kotlinc Main.kt games/*.kt wordSource/*.kt -include-runtime -d main.jar```


How to run the program
----------------------

Run the the following command from the terminal:<br/>
``` java -jar hello.jar ```

A message will pop up in the terminal.<br/>
Respond with your solution in the terminal and press enter<br/>

To play the game again, re-enter this command.

To restart the game from scratch, return to Build instructions.



How to pass arguments to the program
------------------------------------
Input your solution and press return.<br/>
A message will be returned to you.<br/>
<br/>
To restart the game, return to build command.


Assumptions
-----------
Create a section in the README called Usage Notes. List any assumptions you've made about the functionality or known limitations of the program. e.g. "Does not currently handle bad input to the command line args"