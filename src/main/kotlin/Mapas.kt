//Los mapas son colecciones muy usadas, se manejan bajo un criterio
// de "llave, valor" donde ya no es prioridad el acceso a info, se mueve
//por un índice secuencial que empieza en 0
fun main() {
    //Mapas inmutables
    val productos = mapOf<String, Float>(
        "gaseosa" to 4.99f,
        "galleta" to 6.00f,
        "leche" to 3.5f
    )
    println(productos)


    //No se pueden introducir, eliminar t modificar lo creado en el mapa
    //Mapas mutables
    //A parte de los mapas hay varias colecciones no tan usadas
    //una de estas se conoce como Pair(pareja o par)
    val estudiantes = mutableMapOf<Int,String>(
        Pair(1234,"Jose"),
        Pair(5432,"Hannes"),
        Pair(9897,"Zaira"),
        Pair(5556,"Alejandro"),
        Pair(3333,"Laura"),
        Pair(3334,"Luis"),
    )
    estudiantes.put(5421, "Hugo")
    estudiantes.remove(5556)

    estudiantes.forEach {
        val llave = it.key
        val valor = it.value
        println("La llave es: $llave y su valor es $valor")
    }

    //Sumar el total de los productos
    val total = productos.values.sum()
    println("La suma de prods es $total")

    val aprobados = estudiantes.filter {
        it.value.lowercase().contains("l")
    }
    println("Los aprobados son: $aprobados")

    //Promedio de los carnets de los estudiantes
    estudiantes.keys.average()
    println(estudiantes.keys.sorted())
    println(estudiantes.values.sorted())
    estudiantes.keys.count {
        it==1
    }
}