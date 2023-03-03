package problemas

import models.hofEnteros

object Problema2 {
  def main(args: Array[String]): Unit = {
    println(hofEnteros((x, y) => x + y, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10))

    println(hofEnteros(hofEnteros.suma, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10))
    println(hofEnteros(hofEnteros.multiplicacion, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10))
  }
}


