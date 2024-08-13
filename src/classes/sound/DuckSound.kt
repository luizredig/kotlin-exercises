package classes.sound

import interfaces.sound.AnimalSound

class DuckSound : AnimalSound {
    override fun play() {
        println("Quack!")
    }
}