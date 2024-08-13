package classes.action.flight

import interfaces.action.flight.Flight

class BalloonFlight : Flight {
    override fun fly() {
        println("Flying with balloon")
    }
}