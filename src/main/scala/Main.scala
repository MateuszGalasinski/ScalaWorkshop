object Main extends App {
  println("Before pool construction")
  Pool.showConnections
  val pool = new Pool
  println("After pool construction")
  Pool.showConnections
  pool.openConnection
  println("After opening connection")
  Pool.showConnections
}