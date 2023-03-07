package models

object EncryptVowel {
  def apply(vowelsList: List[Char]): List[Char] = {

    val cipherMap = Map('a' -> 'L', 'e' -> '9', 'i' -> '$', 'o' -> 'R', 'u' -> '4')
    vowelsList.map((x: Char) => cipherMap.getOrElse(x, x))
  }
}
