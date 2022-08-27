package POO

import Post
import java.util.Random

fun main(){
    //Instancia de una clase
    val persona: Persona = Persona("Pablo", "Menacho",19)
    //persona.mostrarDatos()

    val cancion1 = Cancion(
        "Follow you",
        "Bring me the Horizon",
        'R'
    )
    //println(cancion1.mostrarCanciones())
    val cancion2 = Cancion(
        "Enemy",
        "Imagine Dragons",
        'R',
        150.0f,
        5
    )
    //println(cancion2.mostrarCanciones())

    val cancion3 = Cancion(
        "Clausula",
        "Quirquiña"
    ) //Aunque no mandes el tercer parámetro género
    //como en tu constructor has creado un parámetro con
    // un valor con defecto, si te olvidas o no mandas
    //asume ese valor que pusiste por defecto

    //println(cancion3.mostrarCanciones())

    val cancion4 = Cancion(
        genero = 'R',
        duracion = 200.0f,
        titulo = "Lamento Boliviano",
        valoracion = 5,
        autor = "Enanitos Verdes",
    )

    //println(cancion4.mostrarCanciones())

    val random = Random()

    fun rand(from: Int, to: Int) : Int {
        return random.nextInt(to - from) + from
    }

    val Post1 = Post(
        titulo = "Mi primer posr",
        autor = "Juanito Perez",
        contenido = "JAJA,SI_SOY.JPG",
        fecha = "27/08/2022"
    )

    val Post2 = Post(
        titulo = "Hola mundo",
        autor = "Juanito Perez",
        contenido = "JAJA,NO_SOY.JPG",
        fecha = "27/08/2022",
        comentarios = mutableListOf("Buena publicacion","JAJA"),
        calificacion = rand(1,5)
    )

    //println(Post2.mostrarPosts())
    //println(Post1.mostrarPosts2())
    Post1.mostrarPosts2()
    Post2.mostrarPosts2()
}