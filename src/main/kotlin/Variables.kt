//Variables globales
var total = 0
//Cuando me pidas una variable global que no cambia
//y previamente ya sabes que valor tiene
// se sugiere usar la palabra reservada const.
const val PI = 3.1415

fun main(){
    //variables locales
    //Constante val
    val esEstudiante = true
    var precio = 6.99f
    //Cuando no vamos a iniciar una variable al definirla
    // es necesario indicar su tipo de dato.
    val cantidad: Int
    cantidad = 65
    total += 1
    total = total + 1
    total++
    //La función inc() hace un incremento en una unidad a la variable
    total.inc()

    val a = 5
    val b = 10
    val suma = a + b
    //Función en los enteros para sumar
    a.plus(b)

    //Si realmente quieres que una variable no tenga cierto tipo de datos específico
    //la defines como Any
    val elemento: Any

    //En Kotlin las variables por defecto no admiten nulos
    //evitan el Null Ponter Exception
    //Si realmente necesitas que la variable admita nulos debes forzar el operador ? después del tipo de dato
    val potencia :String?
    potencia = null
}