
README for word games
---------------------

A guide for developers working on this codebase on how to run tests, and build an executable.


Prerequisites
-------------
Install command line compiler following instructions [here](https://kotlinlang.org/docs/command-line.html). 



Run tests
---------

To run tests enter this command from the root of the project: 
```./gradlew test```


Build
-----
Get an executable (or .jar in this case)


How to run the program
----------------------

from the root of your Word Games project, follow this path: <br/>
./src/main/kotlin

run the following steps from your terminal: 

Step 1 <br/>
Build the executable (it will appear like nothing has happened but your program is now up and running!): <br/>
```kotlinc hello.kt games/UnscrambleGame.kt -include-runtime -d hello.jar ```

Step 2 <br/>
Run the game:<br/>
``` java -jar hello.jar ```

A message will pop up in the terminal.<br/>
Respond with your solution in the terminal and press enter<br/>

To restart the game, return to step 1.



How to pass arguments to the program
------------------------------------
Input your solution and press return.<br/>
A message will be returned to you<br/>
<br/>
To restart the game, return to step 1.


Assumptions
-----------
Create a section in the README called Usage Notes. List any assumptions you've made about the functionality or known limitations of the program. e.g. "Does not currently handle bad input to the command line args"