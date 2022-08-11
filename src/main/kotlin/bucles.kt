
fun main(){
    //Crear arrays de cualquier tipo
    val ejemplos = arrayOf(1 ,2 ,true ,"hola", "adiós", 3.6f)
    val precios = arrayOf(10, 30, 20, 50)
    //Existen métodos para crear Arrays de un tipo de dato en específico:
    val numeros = intArrayOf(1,2,3,4,5,6,7,8)
    val nombres = arrayOf("Hugo", "Leandro", "Fermín")
    val impuestos = doubleArrayOf(2.6,5.1256,0.1546)
    //Existe otra forma de definir Arrays usando las clases de cada tipo de dato:
    val cantidades = IntArray(5)
    val totales = DoubleArray(10)
    val vacios = emptyArray<Float>()

    val numeros2 = IntArray(8){i: Int -> i.inc() }//Lo mismo que números, pero con incremento en función lambda

    //El ciclo iterativo For tiene varias formas de ejecutarse a gusto del programador
    //pero antes se debe entender el tipo de dato llamado rango
    val rango = (1 .. 10) //1,2,3,4,5,6,7,8,9,10
    val valorAleatorio = rango.random() //Sacar un aleatorio de rango.

    //Primera forma
    //En numeros --> numeros.size = 8
    println("PRIMERA FORMA")
    for (i in 0 .. numeros.size-1){
        println(numeros[i])
    }

    //En los bucles For igual que en el if si el proceso es de menos de una 2 líneas
    //se pueden obviar las llaves.

    //Segunda forma
    println("SEGUNDA FORMA")
    for (i in 0 until numeros.size)
        println(numeros[i])

    //TERCERA FORMA
    //Específicamente para recorrer Arrays
    println("TERCERA FORMA")
    //numeros --> rango llamado indices
    //Las 3 primeras formas sirven para recorrer por índice
    for (i in numeros.indices)
        println(numeros[i])

    //CUARTA FORMA
    //Para Arrays
    //Para acceder directamente a los elementos del array
    println("CUARTA FORMA")
    //La variable auxiliar número toma en cada iteración el valor del array
    for (numero in numeros)
        println(numero)

    //Uso de While
    //cuidado de no caer en bucles infinitos
    println("BUCLE WHILE")
    var iterador = 0
    while (iterador < numeros.size){
        println(numeros[iterador])
        iterador++
    }
}