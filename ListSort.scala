import scala.collection.mutable.ListBuffer
// Simple list of integers
val intList = List[Int](1,4,3,2)
// Sort list
println(intList.sorted)
// Sort list in reverse
println(intList.sorted(Ordering.Int.reverse))


// List of tuples
val list = ListBuffer[(Int, Int)]()
// Add single value to list
list += (4 -> 9)
// Add multiple values to immutable list
list += ((1 -> 5), (3 -> 8), (2 -> 6))
// Sorting of list based on compare function
println(list.sortBy(x => x._2))
// Sorting of list based on specific function
println(list.sortBy(x => x._2))
// Sorting of list based on specific function in reverse
println(list.sortBy(x => x._2)(Ordering.Int.reverse))
