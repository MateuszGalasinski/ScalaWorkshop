object Pool { 
    def showConnections() {
        connections.values.foreach(con => println(con))
    }
    val connections = Map("1"->"Connection1", "2"->"Connection2")
}