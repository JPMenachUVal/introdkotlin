package POO.HERENCIA
/*
1) Heredar de persona
2) Pillar 2 atributos que tiene en particular solamente un jefe de carretra
3) Sobreescriban los métodos del padre - mostrarInformacion()
4) Para el jefe de carrera el bono se calcula:
    sacando el 15% dek salario total ganado y adicionado a ese 15%
    un número aleatorio entre 1000 y 5000 bs.
5) Buscar una manera de calcular la sanción
6) La sanción y el bono deben afectar directamente al salario ganado
parte del jefe de carrera.
 */
class jefeCarrera (
    nombre: String,
    apellido: String,
    experiencia: Int,
    area: String,
    salario: Int,
    grado: List<String>
): Persona(nombre, apellido, experiencia, area, salario) {
    var grado = listOf<String>()

    init {
        this.grado = grado
        this.bono = calcularBono()
        this.sancion = calcularSanciones()
        this.salario = salario+bono-sancion
    }

    override fun mostrarInformacion(): String {
        //return super.mostrarInformacion()
        return """
            El nombre completo es: $nombre $apellido,
            tiene $experiencia años de experiencia,
            es jefe de la carrera de $area,
            tiene un bono de $bono,
            tiene sanciones de $sancion,
            gana un salario de Bs. $salario,
            y sus grados academicos son ${grado.joinToString()}
        """.trimIndent()
    }

    override fun calcularBono(): Int {
        //return super.calcularBono()
        return this.salario*10/100 * 2
    }

    override fun calcularSanciones(): Int {
        //return super.calcularBono()
        return this.salario*10/100
    }
}