package POO.singleton
//Singleton: es un patrón de diseño de software (muy utilizado)
//limita cierta clase a solo tener una única instancia en el proyecto
//se utiliza en ámbito global.
//Se implementa con la palabra object

object CarritoCompra {
    var productos = mutableListOf<Producto>()

    fun getNombresProductos(): List<String> {
        val nombres = productos.map {
            it.nombre
        }
        return nombres
    }
}