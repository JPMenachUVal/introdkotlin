package POO.singleton

//UTILIZAREMOS EL PATRON DE DISEÑO DE SOFTWARE SINGLETON
//QUE PERMITE SOLO UNA INSTANCIA DE CLASE EN EL PROYECTO

//Singleton: es un patrón de diseño de software (muy utilizado)
//limita cierta clase a solo tener una única instancia en el proyecto
//se utiliza en ámbito global.

fun main() {
    val producto1 = Producto("Lavadora", CategoriaProductos.ELECTRODOMESTICO.name, 499.99)
    val producto2 = Producto("X Box Series S", CategoriaProductos.CONSOLA.name, 750.00)
    val producto3 = Producto("Xiaomi Redmi 10", CategoriaProductos.COMUNICACION.name, 200.00)

    //Singleton --> única instancia de una clase
    val carritoCompra = CarritoCompra //No pueden haber más instancias de carrito de compra
    carritoCompra.productos = mutableListOf(producto1, producto3)
    println("Los productos seleccionados para compra son: ${carritoCompra.getNombresProductos().joinToString()}")
    val carritoCompra2 = carritoCompra
    carritoCompra2.productos = mutableListOf(producto2, producto3)
    println("Los productos seleccionados para compra son: ${carritoCompra2.getNombresProductos().joinToString()}")
    println("Los productos seleccionados para compra son: ${carritoCompra.getNombresProductos().joinToString()}")
}
