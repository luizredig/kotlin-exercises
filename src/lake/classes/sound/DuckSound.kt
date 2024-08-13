package lake.classes.sound

import lake.interfaces.sound.AnimalSound

open class DuckSound : AnimalSound {
    override fun play() {
        println("Quack!")
    }
}