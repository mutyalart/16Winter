# Clean code

## Why softwares fail ? - C.martin

Fast first code deployment.  
Features and bug fixes takes time away from those pending clean up.
Exponential decrease of productivity as the time goes on.
When Modularity is ruined. Non Opaque code. Lack of clear data/control flow documentation.
Api changes, or wrong scope of apis.
Pushing managers. 

### Why big data projects fail ?

Lack of good software testing habits.
Test driven code development.
formatting errors of Unstructured data. This should be handled by an independent 
Too many open stack tools causing interoperability bugs. This leads to loss in confidence in the project intern which leads to scrapping.
Lack of training for people. Training helps in productivity.
Lack of quality big data people, admin, architect, manager, developers.
Lack of sprints and agile, too many projects at single time during waterfall.

### What should be done.

Intermediate Code clean up releases.   

Clean up hackthon(Not for production for training and development only) once in a quarter where the entire code is cleaned and updated with new desgins and creative features.    

Responsibility should be taken by the designers of code. These designers should be active code developers for the project. - Fundamental agile principal.     

Requirement in a git/jira should be maintained by product owners in user stories file bugs should be marked seperate.  

Technical requirement and design decisions should be handled in the git versioning. Signed of by the product owner.   

All new staff should be trained in agile and clean code practices.
One in 3 months developers should talk to client for api useages and tips and tricks transfer.  

Fun creative envirornment should be created and roles should be shuffled inbetween teams for temporaryly for knowledge purposes.  

Productivity should be counted for .8 times and 20% should be given for training, cleanup, and opensource code commit. This should be given once at start of every quarter.   

Greed can kill a team division and company, whereas compassion towards code and others will build the team.  

## Naming

Names are most important than comments comments more important than  your code.
Most important in clean code is naming. As it will help in finding the root cause of bug in least time.  
Names are the first and foremost for communicating the code. Helps in reading your own code later.  
In this new era cost is in maintainance not in computaion cycles. A powerful computer for 1 hr costs 10cents/hr Developer team costs 200-350/hr$

### Good practices  

* Understand by names itself. A code should not be read for understanding the name meaning.
	- baseYear = bese.getYYYY() - JANUARY;
* Comments should not be used for describing the names of the class.
* Comments should be consice and to point.
* Comments should communicate design intent and method usage. 
* Names which misinform/disinform waste lot of time for the team.
* No need of types in names with new IDE.
* Pro code and avg code differs in grammar usage in naming
	* Classes and variables are __noun__
	* methods are __verbs__ getFuelRate()
	* methods which return boolean should be return as isLate()
```
if(employee.isLate){
	employee.repremaid()
}
```
	* Booleans are __predicates__ isEmpty
	* enum are state or object descriptor __adjectives__ {RED,BLUE,SHORT}


* __Variables__ with Longer scope should have longer name vice versa, for {can use just i and short hand}

* __Functions__ with longer scope should have a smaller name and functions with shorter scope should have a bigger name. Shorter code means less reusable and less generic so big names are necessary.

* When u use a lot use a small name.
When u use less shot scope use a big name 

## Functions

### __Functions should be small 6 to 10 Lines__

* As less lines means more names, these small functions will have long description names.
* These good names will help in understanding the code just by reading them.
* This will help in test cases and also in reusability of code
* This will be helpful for new recruits
* More the team size more consice and clean the code should be.
* All big functions can be converted into classes
	* __Tip__: Have a caracterisation test i.e., save the result of the function and compare the new function result to this test
* How can big functions be refactored, Extract till you drop. IF and While should not have braces.
https://www.youtube.com/watch?v=ptItfUYRHVM&feature=youtu.be



