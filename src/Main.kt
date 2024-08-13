import classes.action.flight.BalloonFlight
import classes.action.flight.WingedFlight
import classes.entity.Duck
import classes.sound.DuckSound

fun main() {
    val duck = Duck(sound = DuckSound(), flightMode = WingedFlight())
    duck.makeQuack()
    duck.fly()
    duck.changeFlightMode(BalloonFlight())
    duck.fly()
}