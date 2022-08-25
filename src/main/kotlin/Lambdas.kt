//Dunciones Lambda, de flechas o anónimas
fun main(){
    //Variables de tipo función
    //La firma de una función lambda es la estructura que hace
    //única a esa función
    //(Int, Int) -> String //estructura

    //izq de la flecha: parámetros
    //der de la flecha: proceso o cuerpo de la función
    val suma: (Int, Int) -> Int = {x, y -> x + y}
    //val x: Int, val y: Int -> x + y
    println(suma(4,5)) //Invocando a la función que está en esa variable.
    println(suma.invoke(4,5)) //Otra forma de invocar a la función
}