package lake.classes.action.flight

import lake.interfaces.action.flight.Flight

class NoFlight : Flight {
    override fun fly() {
        println("I can't fly")
    }
}