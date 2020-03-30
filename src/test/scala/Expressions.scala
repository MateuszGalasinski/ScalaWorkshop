import org.scalatest.FunSuite

class ExpressionsTests extends FunSuite {
    val v = 2
    test("ExpressionsTests") {
        assert(println("Expressions everywhere!") == ())

        var t:String = ""
        if (v > 2) { t = "Greater" } else { t = "Lesser" }
        assert(t == "Lesser")

        assert((if (v > 2) {"Greater"} else { "Lesser"}) == "Lesser")
    }
}