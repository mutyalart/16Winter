## Functional Objects

* 
```scala

// Example in oops

class Rational(n: Int, d: Int) {
    require(d != 0) // part of predef takes a boolean throws an Illegal argument exception when not met, similar to assert but blames the caller instead for failure
    def this(n: Int) = this(n, 1) // auxiliary constructor
    override def toString = n +"/"+ d 
    } 

	
```
