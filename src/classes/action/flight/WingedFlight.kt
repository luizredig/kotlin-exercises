package classes.action.flight

import interfaces.action.flight.Flight

class WingedFlight : Flight {
    override fun fly() {
        println("Flying with wings")
    }
}