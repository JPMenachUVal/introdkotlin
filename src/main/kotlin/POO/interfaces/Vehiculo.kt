package POO.interfaces
//Implementar interfaz usando el operador:
class Vehiculo: Localizable {
    override var latitud: Double
        get() = TODO("Not yet implemented")
        set(value) {}
    override var longitud: Double
        get() = TODO("Not yet implemented")
        set(value) {}

    override fun calculatePositionGps(): String {
        TODO("Not yet implemented")
    }

    override fun showInformation(): String {
        return super.showInformation()
    }
}