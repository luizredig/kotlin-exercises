package classes.action.flight

import interfaces.action.flight.Flight

class NoFlight : Flight {
    override fun fly() {
        println("I can't fly")
    }
}