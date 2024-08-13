package lake.classes.action.whistle

import lake.interfaces.action.whistle.Whistle

class DuckWhistle : Whistle {
    override fun play() {
        println("Using duck whistle")
    }
}