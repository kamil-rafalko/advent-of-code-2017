package day_01

object Task2 extends App {

  private val answer: Int = findAnswer(args(0))

  println("The answer is: " + answer)

  def findAnswer(input: String) = {

    val digits = input.map(_.asDigit)

    val half = digits.size / 2

    val (firstPart, secondPart) = digits.splitAt(half)

    val digitsShiftedByHalf = secondPart ++ firstPart

    digits.zip(digitsShiftedByHalf)
      .foldLeft(0)((sum, pairs) => {
        pairs match {
          case (elem, elemHalfWayAhead) if elem == elemHalfWayAhead => sum + elem
          case _ => sum
        }
    })
  }
}
