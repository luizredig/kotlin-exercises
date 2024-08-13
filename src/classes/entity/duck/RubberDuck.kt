package classes.entity.duck

import classes.action.flight.NoFlight
import classes.sound.RubberDuckSound
import interfaces.action.flight.Flight

class RubberDuck(sound: RubberDuckSound, flightMode: NoFlight) : Duck(sound = sound, flightMode = flightMode) {
    override fun changeFlightMode(flightMode: Flight) {
        if (flightMode is NoFlight) {
            println("I'm already on this flight mode")
            return
        }

        println("I can't change flight mode")
    }
}