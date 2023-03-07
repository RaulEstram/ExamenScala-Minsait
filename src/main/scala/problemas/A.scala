package problemas

import scala.::

object A extends App {

  for (index <- 0 to 10) {
    println(index)
  }
  println("\n" + "=" * 50 + "\n")

  //------------------------------------------------

  for (index <- 0 until 10) {
    println(index)
  }
  println("\n" + "=" * 50 + "\n")

  //------------------------------------------------

  val rows = 5
  val unFor = for (row <- 0 until rows) yield {
    row
  }
  println(unFor)

  // Python
  // >>> [row for row in range(5)]
  //[0, 1, 2, 3, 4]

  println("\n" + "=" * 50 + "\n")
  //------------------------------------------------

  val dosFor = for (row <- 0 until rows) yield {
    for (column <- 0 to row) yield {
      (row, column)
    }
  }
  println(dosFor)
  // rows=5
  // [[ (row, column) for column in range(row+1)] for row in range(rows)]
  // [[(0, 0)], [(1, 0), (1, 1)], [(2, 0), (2, 1), (2, 2)], [(3, 0), (3, 1), (3, 2), (3, 3)], [(4, 0), (4, 1), (4, 2), (4, 3), (4, 4)]]


}
