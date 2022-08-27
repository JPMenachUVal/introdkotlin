package POO

//Hay un constructor primario van entre paréntesis luego del nombre de la clase,
//
//los complementarios van dentro de la clase con la palabra reservada constructor.
//Un constructor primario debe tener solo los campos requeridos en lo posible.
//Los campos opcionales deberían pensarse para campos secundarios en lo posible.
/*
El cliente pide registrar canciones: donde se pueda tener título, artista, género,
pero adicionalmente indique que en ciertos casos también indique duración y valoración.
 */
class Cancion(
    val titulo: String,
    val autor: String,
    val genero: Char = 'R'
) {
    //Atributos
    var duracion: Float = 0.0f
    var valoracion: Int = 0

    //Constructores secundarios si son necesarios.
    //: this() es lo que necesita el constructor primario para crear atributos
    constructor(
        titulo: String,
        autor: String,
        genero: Char,
        duracion: Float,
        valoracion: Int
    ): this(titulo, autor, genero){
        //Procesos del constructor
        //La vieja escuela
        this.valoracion = valoracion
        this.duracion = duracion
    }
    //Métodos
    fun mostrarCanciones(): String = "La canción es $titulo escrita por $autor"
}