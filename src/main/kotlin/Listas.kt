/*Colexxiones: LIstas*/
fun main(){
    //Lista no mutable
    val nombres = listOf("Luis","Alfredo","Hannes","Hugo")
    //Lista mutable
    val precios = mutableListOf(5.99,10.0,11.5,2.5,4.99)
    precios.add(20.99)//Agrega al final
    precios.add(1,6.5)//Agrega según índice
    precios.remove(11.5)//Elimina según nombre
    precios.removeAt(3)//Elimina según ínidce
    println(precios)

    //Programación funcional con las colecciones
    //Por ejemplo funciones de orden superior.

    //Total a pagar de la lista precios
    println("El total a pagar sera: ${precios.sum()}")//Suma
    precios.average()//promedio
    println(precios.random())//saca un número al azar de la lista

    //Invertir lista
    val nombresInvertidos = nombres.reversed()
    println(nombresInvertidos)

    //Ordenar una lista de mayor a menor
    println(precios.sortedDescending().joinToString())
    //Ordenar lista
    println(precios.sorted())

    //Funciones de orden superior que se pueden aplicar a colecciones
    //Filter, Map, Reduce
    val numeros = listOf(2,3,4,2,6,10,7,5)
    //Filter: filtra una lista según cierta condición que debe aplicarse
    // y genera una nueva lista con los elementos que cumplan esa condición,
    // generalmente cuando se envía estas funciones código que resulta ser
    // con la condicional IF, se le conoce como predicado.

    //it guarda una variable temporal de tipo índice que agarra el primer elemento de la lista

    //Ejemplo: muestren los elementos pares de la lista
    val numerosPares = numeros.filter {
        it % 2 == 0
    }
    println(numerosPares)
    val edades = listOf(20,29,18,20,22,26,17)
    val mayores = edades.filter { it > 18 }
    println(mayores)
    val menores = edades.filter {
        edad -> edad <= 18
    }

    //Reduce: reduce una colección a un elemento o resultado, producto
    //de ir aplicando cierta operación sobre los elementos de la lista
    //acumulando el resultado de esa operación en cada iteración.
    //Reduce barre la lista de izquierda a derecha, si se desea ir al
    //revés o invertir la lista o usar reduceRight.
    val sumaNumeros = numeros.reduce { acumulado, elemento -> acumulado + elemento }
    println(sumaNumeros)

    //Map: recorre la colección y aplica sobre cada elemento alguna operación o proceso.
    //La operación o proceso que sea indicada, y devuelve una lista resultado del proceso
    //aplicado sobre cada elemento.
    val resultado = numeros.map { Math.pow(it.toDouble(), 2.0) }
    println(resultado)

    val incremento = numeros.map { it + (it * 0.15) }
    println(incremento)

    val preciosRedondeados = precios.map { it + (it*0.15) }
    println(preciosRedondeados)

    println("La lista tiene: ${numeros.count()} elementos.")
    val cantidadPares = numeros.count {
        numero -> numero % 2 == 0
    }
    println("La cantidad de pares es: $cantidadPares")
    //Suma de cuadrados se podría hacer con sumof.

    //Ordenamiento en base a nuestros criterios
    val ordenadosPropio = numeros.sortedBy {
        numero -> numero > 5
    }
    println(numeros)
    println(ordenadosPropio)

    val total = numeros.maxOf {
        it % 2 == 0
    }
    println(total)
    //Para qué sirve el maxOf?
    //Devuelve el máximo entre dos números, si los valores son iguales retorna el primero
}