package POO.enums

import java.time.LocalDate
import java.time.Month

fun main() {
    var enemyState = EnemyStates.IDDLE
    val collider = 50
    enemyState = if(collider < 100) EnemyStates.ATTACK else EnemyStates.PATROL

    val fecha = LocalDate.of(
        2021,
        Month.AUGUST,
        26
    )

}