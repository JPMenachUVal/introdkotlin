package POO.HERENCIA

fun main() {
    val docente = Docente(
        "Shirley",
        "Salazar",
        15,
        "Sistemas",
        10000,
        listOf("Programacion Web II","Programacion Web I","Ingeniería de Software","Taller de Tesis")
    )
    println(docente.mostrarInformacion())

    val jefecarrera = jefeCarrera(
        "Virginia",
        "Aspiazxu",
        15,
        "Sistemas",
        10000,
        listOf("Grado en educacion superior","Grado de bachillerato","Grado en Ingenieria de Sistemas")
    )
    println(jefecarrera.mostrarInformacion())
}