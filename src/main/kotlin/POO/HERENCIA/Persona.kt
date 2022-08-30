package POO.HERENCIA
//Las clases descendientes deben
open class Persona (
    open val nombre: String,
    open val apellido: String,
    open val experiencia: Int,
    open val area: String,
    open var salario: Int
){
    //Atributos
    open var bono: Int = 0
    open var sancion: Int = 0 //No está abierto a herencia

    //Métodos
    open fun mostrarInformacion(): String {
        //Existe un formato para formar strings
        //de varias líneas, respeta los saltos
        //de línea que se tengan y los espacios
        //que se generen. Usan: """"""
        //.trimIntend() -> Va a ajustar las identaciones,
        // espacios y líneas puestas
        return """
            El nombre completo es: $nombre $apellido,
            tiene $experiencia años de experiencia,
            trabaja en el área de $area
            y gana un salario de Bs. $salario.
        """.trimIndent()
    }

    //Calcular un bono
    open fun calcularBono(): Int = this.salario + 150

    //Calcular sanciones
    open fun calcularSanciones(): Int = this.salario - 1000
}