package classes.sound

import interfaces.sound.AnimalSound

open class DuckSound : AnimalSound {
    override fun play() {
        println("Quack!")
    }
}