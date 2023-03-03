package problemas

import models.EncryptVowel

object Problema3 {
  def main(args: Array[String]): Unit = {
    val resultado = EncryptVowel(List('A', 'a', 'e', 'i', 'o', 'u', 'p'))
    println(resultado)

    println(EncryptVowel(List('a', 'i', 'e', 'a')))
  }
}
