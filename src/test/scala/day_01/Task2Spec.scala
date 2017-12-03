package day_01

import org.scalatest.FlatSpec
import org.scalatest.prop.TableDrivenPropertyChecks._
import org.scalatest.Matchers._

class Task2Spec extends FlatSpec {

  val testParams =
    Table(
      ("input"    , "answer"),
      ("1212"     , 6),
      ("1221"     , 0),
      ("123425"   , 4),
      ("123123"   , 12),
      ("12131415" , 4),
    )

  "findAnswer" should "compute answer" in {
    forAll(testParams) { (input: String, result: Int) => {
      Task2.findAnswer(input) shouldBe result
    }
    }
  }

}
