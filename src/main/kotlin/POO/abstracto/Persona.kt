package POO.abstracto

import java.time.LocalDate

/*
Las clases abstractas -> modelos genéricos
que van a servir de vase con reglas, características y políticas
a clases que usen este modelo de referencia (hereden)
Combinación de reglas del juego o conceptos sin implementarse
con comportamientos y atributos ya implementados....
para definir una clase abstracta usas la palabra reservad abstract
 */
//UNA CLASE ABSTRACTA NO SE PUEDE INSTANCIAR (NO SE PUEDE CREAR OBJETOS DE ESA CLASE)
//No es recomendable que en una clase abstracta se defina un constructor primario
abstract class Persona {
    //Atributos
    //Definir qué características son obligatorias para tus descendientes
    abstract var nombre: String
    abstract var apellido: String
    abstract var fechaNacimiento: LocalDate
    abstract var genero: Char
    var edad: Int? = null //mucho cuidado con el control de nulos

    //Comportamientos
    //combinación de funcionalidad y conceptos.
    open fun mostrarInformacion() {
        val datos = """
        tus datos son: $nombre $apellido
        tu genero es: $genero
        naciste el: $fechaNacimiento
        """.trimIndent()
        println(datos)
    }
    //LocalDate.now() = fecha del sistema 2022-09-03
    fun calcularEdad(): Int = LocalDate.now().year - fechaNacimiento.year

    abstract fun getHorasTrabajadas(): Int

    abstract fun calcularRendimiento()
}