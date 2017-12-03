package day_01

object Task1 extends App {

  val answer = findAnswer(args(0))

  println("The answer is: " + answer)

  def findAnswer(input: String) = {

    val digits = input.map(_.asDigit)

    val matchedInts = digits
      .foldLeft(Nil: List[Int])((accumulator, next) => {
        accumulator match {
          case x :: xs if x != next => next :: xs
          case acc => next :: acc
        }
      }) match {
      case list if list.head == digits.head => list
      case list => list.tail
    }
    matchedInts.sum
  }

}