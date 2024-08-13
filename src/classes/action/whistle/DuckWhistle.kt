package classes.action.whistle

import interfaces.action.whistle.Whistle

class DuckWhistle : Whistle {
    override fun play() {
        println("Using duck whistle")
    }
}