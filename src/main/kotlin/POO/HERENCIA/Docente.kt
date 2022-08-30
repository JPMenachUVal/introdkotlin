package POO.HERENCIA
//La herencia se hace con el operador : nombre de la clase padre
//acompañado de su constructor, si es necesario con parámetros
class Docente(
    nombre: String,
    apellido: String,
    experiencia: Int,
    area: String,
    salario: Int,
    materias: List<String>
): Persona(nombre, apellido, experiencia, area, salario) {
    var materias = listOf<String>()

    init {
        this.materias = materias
        this.bono = calcularBono()
        this.salario = bono
    }

    //Polimorfismo múltiples formas de representar un método
    //Super hace referencia al padre
    override fun mostrarInformacion(): String {
        //return super.mostrarInformacion()
        return """
            El nombre completo es: $nombre $apellido,
            tiene $experiencia años de experiencia,
            trabaja en el área de $area,
            gana un salario de Bs. $salario,
            y dicta las materias de ${materias.joinToString()}
        """.trimIndent()
    }

    override fun calcularBono(): Int {
        //return super.calcularBono()
        return this.salario + (this.salario) + 150
    }

    //CLASE JEFE DE CARRERA
}