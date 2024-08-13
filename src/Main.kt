import classes.action.flight.BalloonFlight
import classes.action.flight.NoFlight
import classes.action.flight.WingedFlight
import classes.action.whistle.BearWhistle
import classes.action.whistle.DuckWhistle
import classes.entity.duck.Duck
import classes.entity.duck.RubberDuck
import classes.entity.hunter.Hunter
import classes.sound.DuckSound
import classes.sound.RubberDuckSound

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