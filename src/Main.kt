import classes.action.flight.BalloonFlight
import classes.action.flight.NoFlight
import classes.action.flight.WingedFlight
import classes.entity.duck.Duck
import classes.entity.duck.RubberDuck
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
}