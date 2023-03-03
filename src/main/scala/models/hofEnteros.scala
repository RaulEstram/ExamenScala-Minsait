package models

object hofEnteros {
  def apply(function: (Int, Int) => Int, numeros: Int*): Int = {
    numeros.reduce(function)
  }

  def suma(numero1: Int, numero2: Int): Int = numero1 + numero2

  def resta(numero1: Int, numero2: Int): Int = numero1 - numero2

  def multiplicacion(numero1: Int, numero2: Int): Int = numero1 * numero2
}
