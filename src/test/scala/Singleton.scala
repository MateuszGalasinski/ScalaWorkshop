import org.scalatest.FunSuite

class SingletonTests extends FunSuite {
    test("SingletonTest") {
        //Before pool construction
        assert(Pool.connectionsCount() == 2)
        val pool = new Pool
        assert(Pool.connectionsCount() == 0)
        pool.openConnection
        assert(Pool.connectionsCount() == 1)
    }   
}