// map func combinator, not a Map
val n = List(1, 2, 3, 4) 
n.map((i: Int) => i * 2)

// or separate into equivalent ^
def timesTwo(i: Int): Int = i * 2
 n.map(timesTwo)

// foreach
//n.foreach(println) 

// filter
//n.filter((i: Int) => i % 2 == 0) 

// predicate function
//def isEven(i: Int): Boolean = i % 2 == 0 
//n.filter(isEven)

// zip
//List(1, 2, 3).zip(List("a", "b", "c")) 

// partition
//val numbers = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
// numbers.partition(_ % 2 == 0)

// find
//numbers.find((i: Int) => i > 5) 

// drop
//numbers.drop(5) 

// foldLeft
//numbers.foldLeft(0)((m: Int, n: Int) => m + n) 

// in case it helps, see foldLeft processing visually
//numbers.foldLeft(0) {
//  (m: Int, n: Int) => println("m: " + m + " n: " + n); m + n
//}

// flatten
//List(List(1, 2), List(3, 4)).flatten 

// flatMap
//val nestedNumbers = List(List(1, 2), List(3, 4)) 
//nestedNumbers.flatMap(x => x.map(_ * 2))

// or "map" and then "flatten"... mapFlat
//nestedNumbers.map((x: List[Int]) => x.map(_ * 2)).flatten 
