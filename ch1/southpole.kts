import java.time.*

val instant = Instant.now();
val southPole = instant.atZone(ZoneId.of("Antarctica/South_Pole"))
val dst = southPole.zone.rules.isDaylightSavings(instant)

println("It is ${southPole.toLocalTime()}")
