## Scala basics

Link:
https://www.safaribooksonline.com/library/view/programming-in-scala/9780981531649/first-steps-in-scala.html

Chapter 2:
  * val consant  
  * var can be reassigned
  * string is java.lang.String
  * for (arg <- args)

Chapter 3:
  *  print(s"reduce left starts from left and reduces the list using the function ${list4.reduceLeft(_+_)}")
  *  Array(1,2,3) and  Array.apply(1,2,3) are similar
  *  All strings are of java.lang.string
  *  List() and Nil are same
  *  strings can be concatnated to immutable lists "string" :: list()
  *  list4.map(_.toString) 
  *  functions can be forwarded to other functions
``` scala 
def findMax(x : Int, y : Int) = {
    	val winner =  x max y
    	p (s"compared $x and $y and winner is $winner")
    	winner
     }
val result = list3.reduceLeft(findMax)
val result2 = list3.foldleft(100)(_ max _)
```


