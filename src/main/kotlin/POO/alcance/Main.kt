package POO.alcance

fun main() {
    val estrella = Estrella(1, "Betelgeuse")
    //Funciones de Scope
    //Aplican y/o permiten ciertas operaciones en el ámbito del objeto de forma dinámica
    //Su ventaja es reducir el trabajo

    //Función Apply
    estrella.galaxia = "Vía Lactea"
    estrella.distancia = 5000000
    estrella.tamanio = 150
    estrella.apply {
        //Entrando al ámbito de tipo estrella
        galaxia = "Vía Lactea"
        distancia = 500000
        tamanio = 150
    }

    with(estrella) {
        //Estoy en el ámbito de una estrella para aplicar secuencialmente criterios en este objeto
        println("El nombre de la estrella es: $nombre")
        println(calcularSuperNova())
        println(calcularVidaUtil())
    }
}