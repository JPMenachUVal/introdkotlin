package POO.abstracto

import java.time.LocalDate

//Para usar algo abstracto se sigue la línea de
//de la herencia con el operador :
class Cajero(
    nombre: String,
    apellido: String,
    fechaNacimiento: LocalDate,
    genero: Char
): Persona() {
    override var nombre: String = ""
    override var apellido: String = ""
    override var fechaNacimiento: LocalDate = LocalDate.now()
    override var genero: Char = 'M'

    init {
        this.nombre = nombre
        this.apellido = apellido
        this.fechaNacimiento = fechaNacimiento
        this.genero = genero
        edad = calcularEdad()
    }

    override fun getHorasTrabajadas() = (3..7).random()

    override fun calcularRendimiento() {
        val potenciaTrabajo = (100..500).random()
        val horasTrabajadasMes = getHorasTrabajadas() * 21
        val rendimiento = (potenciaTrabajo + horasTrabajadasMes) / 100
        println("Tu rendimiento del mes fue de $rendimiento")
    }

    //Sobreescritura para complementar lógica ya establecida en el padre
    override fun mostrarInformacion() {
        super.mostrarInformacion()
        println("tu trabajaste: ${this.getHorasTrabajadas()}")
    }
}