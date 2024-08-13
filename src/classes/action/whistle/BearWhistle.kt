package classes.action.whistle

import interfaces.action.whistle.Whistle

class BearWhistle : Whistle {
    override fun play() {
        println("Using bear whistle")
    }
}