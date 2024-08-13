package lake

import lake.classes.action.flight.BalloonFlight
import lake.classes.action.flight.NoFlight
import lake.classes.action.flight.WingedFlight
import lake.classes.action.whistle.BearWhistle
import lake.classes.action.whistle.DuckWhistle
import lake.classes.entity.duck.Duck
import lake.classes.entity.duck.RubberDuck
import lake.classes.entity.hunter.Hunter
import lake.classes.sound.DuckSound
import lake.classes.sound.RubberDuckSound

fun main() {
    println("=== Duck ===")
    val duck = Duck(sound = DuckSound(), flightMode = WingedFlight())
    duck.makeQuack()
    duck.fly()
    duck.changeFlightMode(BalloonFlight())
    duck.fly()

    println()

    println("=== RubberDuck ===")
    val rubberDuck = RubberDuck(sound = RubberDuckSound(), flightMode = NoFlight())
    rubberDuck.makeQuack()
    rubberDuck.fly()
    rubberDuck.changeFlightMode(BalloonFlight())

    println()

    println("=== Hunter ===")
    val hunter = Hunter(whistle = DuckWhistle())
    hunter.useWhistle()
    hunter.changeWhistle(BearWhistle())
    hunter.useWhistle()
}