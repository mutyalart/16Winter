## Basics of oops programming in scala

  * Scala is a pure objected oriented programming language everything is object including methods
  


  - A Class is a blue print of objects

```scala
 	class ChecksumAccumulator { // public is default in scala
	  var         sum  = 0 // instance variable
          private var sum2 = 0 // cannot change the value from outside
}

	val rt = new ChecksumAccumulator
        rt.sum = 2 // can be changed
        rt.sum2    // cannot be accesed
``` 
   - A method starts with def
	- single point methods are prescribed for quality programming
	- side effects should be used minimally
	- for method with sideeffects(returns only unity) only remove equals sign

```scala
   class ChecksumAccumulator {
	private var sum = 0
	def add(b: Byte): Unit = sum += b // single line methods doesnot need curly braces
	def checksum(): Int = ~(sum & 0xFF)
	def add2(b: byte) { sum += b }
```
