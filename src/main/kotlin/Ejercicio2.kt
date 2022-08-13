import kotlin.random.Random

fun main(){
    val numeros2 = IntArray(8){i: Int -> i.inc()* Random(7).nextInt(0, 30) }
    println(numeros2[0])
}

/*Revisar la función distinct()
* lista, lista mutable - de preferencia
* arrays aunque cuesta más
* */