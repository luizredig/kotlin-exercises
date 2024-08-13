package lake.classes.entity.duck

import lake.classes.action.flight.NoFlight
import lake.classes.sound.RubberDuckSound
import lake.interfaces.action.flight.Flight

class RubberDuck(sound: RubberDuckSound, flightMode: NoFlight) : Duck(sound = sound, flightMode = flightMode) {
    override fun changeFlightMode(flightMode: Flight) {
        if (flightMode is NoFlight) {
            println("I'm already on this flight mode")
            return
        }

        println("I can't change flight mode")
    }
}