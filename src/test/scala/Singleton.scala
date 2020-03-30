import org.scalatest.FunSuite
import org.scalatest._

class SingletonSpec extends FlatSpec with Matchers {
    "A pool" should "have two initial values" in {
        Pool.connectionsCount() should be (2)
    }

    it should "have zero values after class object instantation" in {
        val pool = new Pool
        Pool.connectionsCount() should be (0)
    }
    it should "have single value after opening connection" in {
        val pool = new Pool
        pool.openConnection
        Pool.connectionsCount() should be (1)
    }
}