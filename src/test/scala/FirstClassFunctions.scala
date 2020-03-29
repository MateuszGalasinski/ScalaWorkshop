import org.scalatest.FunSuite
import Functions.WeekDay._

class FunctionsTests extends FunSuite {
    // val isWorkingDay = (d: WeekDay) => ! (d == Sat || d == Sun)
    val workingDayLooper = (e: WeekDay=>Unit) => Functions.WeekDay.values filter ((d: WeekDay) => ! (d == Sat || d == Sun)) foreach e
    val idPrinter = (d: WeekDay) => println(s"${d} id is ${d.id}")
    test("FunctionsTests") {
        workingDayLooper(idPrinter)
        var sum = 0
        workingDayLooper((w:WeekDay) => sum += w.id)
        assert(sum == 10)
    }   
}