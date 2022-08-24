//Sets -> colección que solo permite valores únicos y no permite repetidos
fun main(){
    //Sets mutables
    val nombres = setOf<String>("Alfredo","Luis","Luis","Belén")
    println(nombres)

    //Sets mutables
    val numeros = mutableSetOf(1,2,2,4,5,2,3,6,3,7)
    println(numeros)

    numeros.sum()
    val pares = numeros.filter {
        it % 2 == 0
    }
    println(pares)

    //Números primos:
    val numero = 7
    //Primo es divisible entre 1 y sí mismo
    for (i in 2 .. numero / 2)
    {
        //Verdad hasta que hayan más de dos divisiones posibles
    }
    val numerosPrimos = numeros.filter{
        var esPrimo = true
        for (i in 2 .. it/2){
            if (it % i == 0){
                esPrimo = false
                break
            }
        }
        esPrimo
    }
    println("Los números primos dentro del set son: $numerosPrimos")
}