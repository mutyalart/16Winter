## Basics of oops programming in scala

  * Scala is a pure objected oriented programming language everything is object including methods
  


  - A Class is a blue print of objects

```scala
 	class ChecksumAccumulator { // public is default in scala
	  var sum  = 0 // instance variable
          private var sum2 = 0 // cannot change the value from outside
}

	val rt = new ChecksumAccumulator
        rt.sum = 2 // can be changed
        println(rt.sum2)    // cannot be accesed
``` 
   - A method starts with def
	- single point methods are prescribed for quality programming
	- side effects should be used minimally
	- for method with only side effects (i.e., which returns only unity) equal sign can be removed
	- parameter inside a def method(b : Int) = { // b is val }


```scala
   class ChecksumAccumulator {
	private var sum = 0
	def add(b: Byte): Unit = sum += b // single line methods doesnot need curly braces
	def checksum(): Int = ~(sum & 0xFF)
	def add2(b: byte) { sum += b }
```

	- Singleton Object
		- when a singleton object is similar to class name it is called a campanion object, a class and comapanion object can access each others private members
		- scala is more object oriented as the classes in scala does not has the static variables only instance variables.
		- these variables can be called using object.methodName
		- companion object should be defined in same file

	- Running Scala 
		- scripts can be run by scala **Name**.scala
		- Class have to be compiled scalac or fsc (fast scala compiler which starts a seperate demon)
```scala
object Checksum {

        var s1 = 0
        private val checkMap = Map[String,Int]()
        def main(args: Array[String]){
                for (arg <- args){
                        println(arg)
                }

```
		- scala **Name** to execute the code
		- can also use application trait but best avoided for multithreading, commandline args, optimization of code.		
