import org.scalatest.FunSuite

class VariablesTests extends FunSuite {
  val numbers2 = Array(16, 154)
  val x = 7

  var numbers = Array(1, 7)
  var fun = (s: Int) => s/x
  // fun = i => i % x
  
  val iterator = (f: Int=>Int, a: Array[Int]) => a.map(e => fun(e))
  test("VariablesTests") {
    assert(iterator(fun, numbers) sameElements Array(1, 0, 4))
    assert(iterator(fun, numbers2) sameElements Array(2, 0))
  }
}