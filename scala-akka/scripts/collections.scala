// scala lists sets and maps

def p(x: Any) {
	println (x)
}

// lists

val list1 = List() ::: Nil
p(list1)

val list2 = "string" :: list1
p(list2)

val list3 = (1 to 10).toList
p (list3)

// scala list methods 
	

  // for each returns nothing 
	
  // important map function
		val list4 = list3.map( s => s.toString)
		list4.foreach(p(_))

		p (list3.map(_.toString).count(_.length==1))

// Reduce and fold
	// Reduceleft reduceRight scanLeft scanRight

  p("reduce to left")
    val list5 = list4.reduceLeft((a,b) => if (a > b) a else b)
    p(list5)

	//Wonderfull Exmaple for reduce left
p ("reduce left example of array 1 to 10")
def findMax(x : Int, y : Int) = {
    val winner =  x max y
    p (s"compared $x and $y and winner is $winner")
    winner
}

val result = list3.reduceLeft(findMax)

p(result)

// p(s"reduce to right $(list3.reduceRight(findMax))")

p("foldLeft")
p(s"fold to left ${list3.foldLeft(100)(findMax)} it takes input 100")




