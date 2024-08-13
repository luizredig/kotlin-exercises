package lake.classes.action.whistle

import lake.interfaces.action.whistle.Whistle

class BearWhistle : Whistle {
    override fun play() {
        println("Using bear whistle")
    }
}