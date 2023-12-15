
README for word games
---------------------

A guide for developers working on this codebase on how to run tests, and build an executable.


Prerequisites
-------------


Run tests
---------

check what version of jUnit you have
- Q : will build.gradle automatically come into project?
- (from the command line) <br/>
```build.gradle.kts```
- 


Build
-----
Get an executable (or .jar in this case)


How to run the program
----------------------

from path: <br/>
/Word_Games/src/main/kotlin

run the following steps from your terminal: 

Step 1. <br/>
```kotlinc hello.kt UnscrambleGame.kt -include-runtime -d hello.jar ```

Step 2.<br/>
``` java -jar hello.jar ```

A message will pop up in the terminal.<br/>

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