package day_01

import org.scalatest.FlatSpec
import org.scalatest.prop.TableDrivenPropertyChecks._
import org.scalatest.Matchers._

class Task1Spec extends FlatSpec {

  val testParams =
    Table(
      ("input"    , "answer"),
      ("1122"     , 3),
      ("1111"     , 4),
      ("1234"     , 0),
      ("91212129" , 9),
    )

  "findAnswer" should "compute answer" in {
    forAll(testParams) { (input: String, result: Int) => {
        Task1.findAnswer(input) shouldBe result
      }
    }
  }

}
