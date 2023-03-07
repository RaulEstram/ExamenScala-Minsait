package models

import libs.PascalRowException

object TrianguloPascal {

  def apply(rows: Int): List[Int] = {
    // Comprobación de que se introduce un numero de rows permitidos
    if (rows <= 0) throw new PascalRowException()
    // lógica del la función
    // until -> 0 until 3 = 0, 1, 2
    // to -> 0 to 3 = 0, 1, 2, 3
    // el primer for es para el nivel de las filas
    // el segundo for es para el nivel de las columnas
    // En Scala, el for-yield se utiliza para crear una nueva colección transformando los elementos de una colección
    // existente, de una manera que es similar a la comprensión de listas en Python.
    val triangle = for {row <- 0 until rows} yield {
      for {col <- 0 to row} yield {
        pascal(row, col)
      }
    }
    // regresamos el ultimo elemento que sera la lista que tenemos que regresar
    triangle.last.toList
  }


  def printTrianguloPascal(rows: Int): Unit = {
    if (rows <= 0) throw new PascalRowException()
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
