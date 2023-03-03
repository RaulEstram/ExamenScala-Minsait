package problemas

import models.TrianguloPascal

object Problema4 {
  def main(args: Array[String]): Unit = {

    val nivelTriangulo: Int = 5

    println(TrianguloPascal(nivelTriangulo))

    // explicación que para que se vea mejor la recursividad
    TrianguloPascal.printTrianguloPascal(nivelTriangulo)

    val triangulo = for {row <- 0 until  nivelTriangulo} yield {
      for {col <- 0 to row} yield (s"Row: $row", s"Col = $col")
    }
    triangulo.foreach(element => println(element.toList))
  }
}
