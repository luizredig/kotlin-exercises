package classes.entity.duck

import classes.sound.DuckSound
import interfaces.action.flight.Flight

open class Duck(private var sound: DuckSound, private var flightMode: Flight) {
    fun makeQuack() {
        sound.play()
    }

    fun fly() {
        flightMode.fly()
    }

    open fun changeFlightMode(flightMode: Flight) {
        this.flightMode = flightMode

        val flightModeName = this.flightMode::class.java.simpleName
        println("Now flying with $flightModeName.")
    }
}