class Post (val titulo: String,
            val autor: String,
            val contenido: String,
            val fecha: String
){
    var comentarios: MutableList<String> = mutableListOf()
    var calificacion: Int = 0
    constructor(
        titulo: String,
        autor: String,
        contenido: String,
        fecha: String,
        comentarios: MutableList<String>,
        calificacion: Int
    ): this(titulo, autor, contenido, fecha) {
        this.comentarios = comentarios
        this.calificacion = calificacion
    }

    //fun mostrarPosts() = "$titulo\n Post de: $autor | $fecha\n$contenido\n\n"
    fun mostrarPosts() = "Post de: $autor | $fecha\nTitulo: $titulo\n  $contenido\nValoracion: $calificacion estrellas \nComentarios: \n    $comentarios\n\n"
    fun mostrarPosts2() {
        if(comentarios.size > 0){
            println("Post de: $autor | $fecha\nTitulo: $titulo\n  $contenido\nValoracion: $calificacion estrellas \nComentarios:(${comentarios.size})\n $comentarios\n\n")
        }else{
            println("$titulo\n Post de: $autor | $fecha\n$contenido\n\n")
        }
    }
}