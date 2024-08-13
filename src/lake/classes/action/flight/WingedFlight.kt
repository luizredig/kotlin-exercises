package lake.classes.action.flight

import lake.interfaces.action.flight.Flight

class WingedFlight : Flight {
    override fun fly() {
        println("Flying with wings")
    }
}