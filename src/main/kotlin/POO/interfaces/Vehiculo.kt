package POO.interfaces
//Implementar interfaz usando el operador:
class Vehiculo: Localizable, Security {
    override var latitud: Double = 0.0
    override var longitud: Double = 0.0
    override var redButton: Boolean = true
    var speed = 0.0
    override fun calculatePositionGps(): String {
        latitud = (-20..-10).random().toDouble()
        longitud = (-80..-60).random().toDouble()
        return "$latitud° - $longitud° "
    }

    override fun showInformation(): String {
        return super.showInformation()
    }

    override fun enableMovement() {
        speed = if ((!redButton)) (10..20).random().toDouble() else 0.0
            val acceleration = if (!redButton) 1.0 else 0.0
            println("Tu velocidad de movimiento es $speed con una aceleración de $acceleration")
    }
}