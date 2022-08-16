//import kotlin.random.Random

fun main(){
    /*val numeros2 = IntArray(8){i: Int -> i.inc()* Random(7).nextInt(0, 30) }
    println(numeros2[0])*/
    /*val numeros = intArrayOf(1,2,2,2,3,4,5,6,6,7,7,7)

    var a = numeros[0]
    var cadena1 = numeros[0].toString() + ""
    for (i in numeros.indices){
        println(numeros[i])

        if (numeros[i]==a){
            println("Repetido")
        }else{
            cadena1 = cadena1 + numeros[i].toString()
        }
        a = numeros[i]
    }
    println(cadena1)*/



    /*val numeros2 = intArrayOf(1,2,2,2,3,4,5,6,6,7,7,7)

    var a2 = numeros2[0]
    var cadena2 = numeros2[0].toString() + ""
    for (i in numeros2.indices){
        println(numeros2[i])

        for (j in numeros2.indices){
            if (numeros2[i]==numeros2[j]){
                println("Repetido")
            }else{
                cadena2 = cadena2 + numeros2[j].toString()
            println(numeros2[j])
            }
        }

        /*if (numeros2[i]==a2){
            println("Repetido")
        }else{
            cadena2 = cadena2 + numeros2[i].toString()
        }*/
        //a2 = numeros2[i]
    }
    println(cadena2)*/
    val numeros = mutableListOf(8,1,1,1,1,2,2,3,4,4,5,6,7,7,7,8)
    evalLista(numeros)
}


fun evalLista(numeros: List<Int>){
    var cadena = ""
    for (i in numeros.distinct().indices){
        cadena += numeros.distinct()[i].toString()
    }
    println("La cadena es: "+cadena)
}

/*Revisar la función distinct()
* lista, lista mutable - de preferencia
* arrays aunque cuesta más
* */