package classes.entity.hunter

import interfaces.action.whistle.Whistle

class Hunter(private var whistle: Whistle) {
    fun useWhistle() {
        whistle.play()
    }

    fun changeWhistle(whistle: Whistle) {
        this.whistle = whistle

        val whistleName = this.whistle::class.java.simpleName
        println("Changing whistle to $whistleName.")
    }
}