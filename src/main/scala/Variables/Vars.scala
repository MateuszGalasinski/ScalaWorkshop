package Variables
import org.scalatest.FunSuite

class VariablesTests extends FunSuite {
  var fun = (s: Int) => s /2
  fun = i => i % 2
  
  test("Arg1") {
    assert(fun(argument))
  }

  test("Arg1") {
    assert(fun(argument))
  }
}