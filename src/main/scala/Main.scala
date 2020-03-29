object Main extends App {
    println("Before pool construction")
    println(Pool.connectionsCount())
    Pool.showConnections
    val pool = new Pool
    println("After pool construction")
        println(Pool.connectionsCount())
    Pool.showConnections
    pool.openConnection
    println("After opening connection")
        println(Pool.connectionsCount())
    Pool.showConnections
}