package lake.classes.action.flight

import lake.interfaces.action.flight.Flight

class BalloonFlight : Flight {
    override fun fly() {
        println("Flying with balloon")
    }
}