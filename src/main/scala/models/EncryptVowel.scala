package models

object EncryptVowel {
  def apply(vowelsList: List[Char]): List[Char] = {
    vowelsList.map {
      case c if c == 'a' => 'L'
      case c if c.equals('e') => '9'
      case c if c.equals('i') => '$'
      case c if c.equals('o') => 'R'
      case c if c.equals('u') => '4'
      case c => c
    }
  }
}
