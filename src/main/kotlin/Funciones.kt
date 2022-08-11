fun main(){
    mostrarMensaje("Grupo B")
    showMessage("Torre Antigua Univalle")
    println("La suma es: ${calcularNumeros(1,2)}")
    println("La resta es: ${restarNumeros(1,2)}")
}

//Funciones
//Entre paréntesis deben ir los parámetros(argumentos) que recikbe la función:
//Necesariamente deben explicitar o indicar el tipo de dato de un parámetro
//en su función, si es que lo tiene
//Para indicar el tipo de retorno o qué va a devolver tu función luego de los paréntesis
//donde se definen los parámetros se colocan : y el tipo de dato de retorno
//Cuando la función no retorna nada no es necesario escribir el tipo Unit,
//Kotlin ya lo asume.
fun mostrarMensaje(mensaje: String): Unit {
    val cadena = mensaje + ", fin de mensaje"
    println(cadena)
}

fun showMessage(mensaje: String){
    println("$mensaje, fin de mensaje.")
}

//Funciones que retornan un valor:
//Luego de los paréntesis donde degines los parámetros
//usas : y debes indicar el tipo de dato que retornará tu función
//si la función tiene un proceso sencillo -> que solo tiene una línea de código, y esa
// línea de código es el retorno de dato
// se puede resumir de 2 formas, ver las funciones que continuan a este ejemplo:
fun calcularNumeros(numero1: Int, numero2: Int): Int {
    return numero1 + numero2
}

fun restarNumeros(numero1: Int, numero2: Int): Int = numero1 - numero2