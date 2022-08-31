package Ejercicios

fun main(){
    val numeros = arrayOf(10, 30, 20, 50)
    eval(numeros)
}

fun eval(numeros: Array<Int>){
    if(numeros == numeros.sorted()){
        println("El array está desordenado")
    }
    else if(numeros == numeros.distinct()){
        println("El array tiene numeros repetidos")
    }
    else{
        println(numFalt(numeros))
    }
}

fun numFalt(numeros: Array<Int>): MutableList<Int>{
    val falts = mutableListOf<Int>()
    val largo = numeros.size
    for (i in numeros[0] .. numeros[largo-1])
        if (!numeros.contains(i)){
            falts.add(i)
        }
    return falts
}