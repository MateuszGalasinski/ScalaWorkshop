class Pool(){ 
    Pool.clearConnections

    def openConnection: (String, String) = Pool.openConnection(java.util.UUID.randomUUID.toString->java.util.UUID.randomUUID.toString)
}

object Pool { 
    private val connections = collection.mutable.Map("abc"->"Connection1", "xyz"->"Connection2")
    private def openConnection(connection:(String, String)): (String, String) = {
        connections += connection
        connection
    } 
    private def clearConnections() {
        connections.clear()
    }
    def showConnections = connections.values.foreach(con => println(con))
    def connectionsCount = () => connections.size
}