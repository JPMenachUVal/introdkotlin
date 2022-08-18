//Recursividad
//Ejemplo simple
/*
Dado un array de percios, obtener el total
simulando que es un carrito de compras y entregar
el valor a pagar
 */
fun main(){
    val precios = floatArrayOf(10.0f, 5.99f, 2.99f, 3.0f, 15.0f)
    println("El total a pagar es: ${calcularPrecios(precios)}")
    println("El total a pagar es: ${calcularPreciosRecursivo(precios, precios.size - 1)}")
}
//Forma normal
fun calcularPrecios(precios: FloatArray): Float {
    var total = 0.0f //cambia
    for (precio in precios) { //precio cambia
        total += precio
    }
    return total
}


//Recursividad
//Lo recursivo se basa en eliminar el uso de variables mutables
//Generalmente lo recursivo trabaja bajo 2 conceptos:
// - Buscar un caso base que es el que rompe la recursividad
// - Buscar el caso recursivo donde la idea es que la función se llame a sí misma
// Técnica en cada momento recursivo se va acumulando el proceso en una pila de datos...
//EN PILAS (STACKS): LO PRIMERO QUE ENTRA ES LO PRIMERO QUE SALE...
//En lo recursivo generalmente se va de derecha a izquierda al revés de for y lo tradicional
fun calcularPreciosRecursivo(precios: FloatArray, maxIndex: Int): Float {
    //Caso base
    if (maxIndex == 0) return precios[0]
    //Caso recursivo
    //La función se llama a sí misma
    return precios[maxIndex] + calcularPreciosRecursivo(precios, maxIndex - 1)
}