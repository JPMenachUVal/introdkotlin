//Los programas en Kotlin tienen un archivio
//principal que es el que se va a ejecutar
//El entry point donde arranca (fun main()), fun es la manera de definir funciones en kotlin
fun main() {
    //Variables
    //2 tipos val y var --
    //Tipado explicito de datos
    val numero1: Int = 10
    //Tipado implícito de datos
    var numero2 = 20;

    //Las var sí se pueden modificar
    numero2 = 25
    // Las val no se pueden modificar
    //numero1 = 15

    //¡¡¡por favor usa val si es posible!!!
    val nota1 = 41.5f
    val nota2 = 78.362541
    val esEstudiante = true
    val nombre = "Pablo"
    val apellido = "Menacho"
    var ejemplo = 15

    //ejemplo = "Jueves" //No se puede cambiar el tipo de dato

    //En los strings existe algo llamado String Template
    //En otros lenguajes se lo conoce como interpolación de cadenas.
    //Para imprimir en consola se usa la función print() o println().
    println("Su nombre es "+nombre+" "+apellido+".")
    //Con String Tempalte:
    //Cuando la variable es simple solo es pooner el signo de dolar antes de la variable
    println("Su nombre es $nombre $apellido, bienvenido.")
    //Cuando la variable es compleja hay que poner llaves entre
    //el signo de dolar u las operaciones o variables en cuestión
    println("La suma de sus notas es: ${nota1+nota2}.")
    //Que es complejo para String Template
    //Objetos de una clase
    //${estudiante.mostrarNotas()}
}