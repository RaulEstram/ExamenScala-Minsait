package models

object TrianguloPascal {
  def apply(rows: Int): Unit = {
    for (row <- 0 until rows) {
      for (col <- 0 to row) {
        print(pascal(row, col) + " ")
      }
      println()
    }
  }

  private def pascal(row: Int, column: Int): Int =
    if (column == 0 || row == column) 1
    else pascal(row - 1, column - 1) + pascal(row - 1, column)
}
