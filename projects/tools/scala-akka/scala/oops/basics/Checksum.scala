import scala.collection.mutable.Map

class Checksum(args: Array[String]) {
 	var s = 0 
	def add(x: Int): Unit = { 
           s += x
	}
	def add2(x: Int) {
	   s += 2*x 
	}

	def p(){

		val acc = new Checksum(Array("10","11")) // Class() is optional for zero input parameters

		for (arg <- args)
  			acc.add(arg.toInt)
			println(acc.s)

		val acc2 = new Checksum(Array("10","11"))
		for (arg <- args)
  			acc2.add2(arg.toInt)
			println(acc2.s)
	}	
}

// Companion Object

object Checksum {

	var s1 = 0
	private val checkMap = Map[String,Int]()
	def main(args: Array[String]){
		for (arg <- args){
			println(arg)
		}
		println(s"resultant map: ${Checksum.add2Map("Rat",1)}")
	}
	def add2Map(key: String,value: Int) = {
		if(checkMap.contains(key)) checkMap 
		else checkMap += (key -> value)
	}
}


