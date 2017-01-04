class Checksum {
 	var s = 0 
	def add(x: Int): Unit = { 
           s += x
	}
	def add2(x: Int) {
	   s += 2*x 
	}

}

val acc = new Checksum
for (arg <- args)
  acc.add(arg.toInt)
println(acc.s)

val acc2 = new Checksum
for (arg <- args)
  acc2.add2(arg.toInt)
println(acc2.s)
