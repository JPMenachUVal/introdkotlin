package POO
//Producto de la abstracción
//Si luego de la clase se pone paréntesis y dentro se definene parámetros de tipo val o var
//se está creando un constructor.
class Persona(val nombre: String,
              val apellido: String,
              edad: Int
) {
    //Atributos - Características
    val edadFinal = edad //Creando un atributo manualmente asignando un parámetro que llego con el constructor

    //Si necesitas que el constructor realice más procesos que solo inicializar
    //variables como llamar a un método o ejecutar un flujo de código, para ese
    //constructor hay que llamar al bloque init
    init{
        //Procesos
        //esto ocurre al crear la instancia de la clase
        println("Proceso ejecutado")
    }

    //Comportamientos - Métodos
    fun mostrarDatos(){
        println("El usuario es: $nombre $apellido, tiene $edadFinal años, bienvenido")
    }
}