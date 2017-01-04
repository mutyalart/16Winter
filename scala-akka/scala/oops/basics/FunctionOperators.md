```Scala
// Operators

class Rational(n: Int, d: Int) {
    require(d != 0) // part of predef takes a boolean throws an Illegal argument exception when not met, similar to assert but blames the caller
 instead for failure
    def this(n: Int) = this(n, 1) // auxiliary constructor
    override def toString = n +"/"+ d
    }

// Defining Operators _be careful with operator priority_

     def + (that: Rational): Rational = 
       new Rational(numer * that.denom + that.numer * denom,
          denom * that.denom
        )  
      def * (that: Rational): Rational =
        new Rational(numer * that.numer, denom * that.denom)  
```

- implicit conversions
	- implicit def intToRational(x:Int) = new Rational(x,1)
 		chapter 21 for implicit conversions
	- be careful as implicit conversions are done by compiler automatically users readability will be reduced in some cases
