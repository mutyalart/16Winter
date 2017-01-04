
val numNames = Array("zero","bigb","smalc");
val numNames2 = Array.apply("One","trw","tree")


def printArray(numNames : Array[String]) = {
	for(x <- numNames)
		println(x)
}

printArray(numNames);
println("");
printArray(numNames2);


