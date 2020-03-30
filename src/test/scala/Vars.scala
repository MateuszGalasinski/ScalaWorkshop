import org.scalatest.FunSuite
import org.scalatest._

class VariablesSpec extends FlatSpec with Matchers {
    def fixture =
      new {
        val iterator = (f: Int=>Int, a: Array[Int]) => a.map(e => fun(e))
        val numbers2 = Array(16, 154)
        val x = 7
        var numbers = Array(1, 7, 4)
        var fun = (s: Int) => s/x // ???
      }
    "'Fun' applied to numbers" should "give correct values" in {
      val f = fixture
      f.iterator(f.fun, f.numbers) should equal (Array(1, 0, 4))
    }

    "'Fun' applied to numbers2" should "give correct values" in {
        val f = fixture
        f.iterator(f.fun, f.numbers2) should equal (Array(2, 0))
    }
}