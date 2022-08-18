//Colecciones
//3: Listas, Sets, Mapas
//Las colecciones usan mucho el concepto de
//funciones de orden superior
//Pueden ser mutables y no mutables
fun main(){
    //Lista mutable
    val nombres = mutableListOf("Luis", "Alejandro", "Yamir", "Alfredo", "Hugo")
    val notas = mutableListOf<Int>() //Cuando no tiene elementos al inicializarse
    //Agregar elementos
    nombres.add("Hannes") //Agrega un elemento al final
    nombres.add(1, "Zaira") //Agrega en posición elemento
    println(nombres)
    //Quitar elementos
    nombres.remove("Alejandro") //Remove element browsing by name
    nombres.removeAt(2) //Remove elemento en position
    println(nombres)
    //Listas inmutables
    val valores = listOf(10,20,30,40,50)
    recorrerLista(valores)

    val numeros = listOf(1,2,4,2,3,2,4,5,8,7,4,7,6)
    quitarDuplicados(numeros)
}

fun recorrerLista(lista: List<Int>){
    //Se hace a través de foreach que recibe
    //una función como parámetro en casos complejos
    //lista = [1,2,3]
    //foreach -- indice 0 --> it = 1 -- indice 1 --> it = 2
    lista.forEach {
        println(it)
    }
}



//Resolución ejercicio 2 práctica
//Dado un array quitar los duplicados
//en formato string
fun quitarDuplicados(numeros: List<Int>) {
    //Programación funcional a su máxima expresión:
    val resultado = numeros.distinct().sorted().joinToString()
    println(resultado)
    //Segunda manera
    val resultado2 = numeros.toSet().sorted().joinToString()
    println(resultado2)
}