/* solo con main
fun main(){
    var cadena = readln().toString()
    var cadena2 = ""
    var largo = 0
    largo = cadena.length
    for (i in 0 .. largo-1){
        cadena2 += "*"
    }
    if (largo % 7 == 0){
        cadena = cadena2
        println(cadena)
    }else{
        cadena = cadena2+cadena
        println(cadena)
    }
}
*/

fun main(){
    var cadena = readln().toString()
    var cadena2 = ""
    var largo = 0
    largo = cadena.length

    for (i in 0 .. largo-1){
        cadena2 += "*"
    }

    if (largo % 7 == 0){
        evalCadena(cadena2)
    }else{
        evalCadena(cadena, cadena2)
    }
}

fun evalCadena(cadena: String){
    println(cadena)
}

fun evalCadena(cadena: String, cadena2: String){
    println(cadena2+cadena)
}