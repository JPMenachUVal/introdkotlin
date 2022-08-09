fun main(){
    //Para leer datos por teclado introducidos en consola se usa
    //la función readln() que por defecto devuelve en String
    val numero = readln().toInt()
    val par:Int
    val numero1 = readln().toInt()
    val numero2 = readln().toInt()
    val menor: Int
    if (numero % 2 == 0){
        //Proceso cuando la codnición es verdadera
        println("El número $numero es par.")
    }else{
        println("El número $numero es impar.")
    }
    //Cuando el codigo de la condición es de una sola línea se puede obviar las llaves
    //o poner el código en una sola línea
    if (numero % 2 == 0)
        par = numero
    else
        par = 0
    //Kotlin permite que el resultado de una condicional tanto por true o false
    //sea asignado directamente a una variable
    println("Caso ubicar el menor")
    menor = if (numero1 < numero2) numero1 else numero2
    println("El menor de los números es: $menor")

    //Kotlin no tiene el switch case
    //Kotlin utiliza otra estructura mejorada llamadad when
    // que resume mucho la estructura anterior del switch
    //nota va de un rando de 0 a 10 donde a partir de 6 apruebas
    val nota = 8
    when (nota){
        0,1,2,3,4,5 -> {println("Usted ha reprobado :(")}//Se usan llaves si tienes más de una línea
        6,7,8,9,10 -> println("Usted ha aprobado :D")
        else -> println("¡Usted es un genio!!!! :O")
    }
    val resultado: Int
    val operacion = "suma"
    resultado = when (operacion) {
        "suma" -> 5 + 6
        "resta" -> 5 - 6
        "multiplicacion" -> 5 * 6
        "division" -> 5 / 6
        else -> 5 % 10
    }
}