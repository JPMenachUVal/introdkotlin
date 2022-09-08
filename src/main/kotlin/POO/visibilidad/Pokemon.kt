package POO.visibilidad

//Nivel de archivo: si se tiene varias clases o variables y funciones están en el mismo contexto
class Pokemon {
    //lateinit permite inicializar variables después, ayuda con la programación funcional en android studio aceptando el riesgo
    //private lateinit var evolution: Int
    //Private: acceso en misma clase
    private var powerUp: Int = 0
    //private var bonus = Bonus()
    //protected: nivel de acceso para miembros de la clase y descendientes
    protected var damage: Int = 0
    //public: acceso desde cualquier parte del código //Por defecto en Kotlin
    /*public*/ var health: Int = 100

    //Kotlin maneja un 4to tipo de acceso: Internal
    //Internal: Es un acceso a nivel de módulos.
    //A nivel de módulos significa acceso de terceros y otras librerías
    //Módulo = introdkotlin //Internal protege con Internal al módulo (proyecto).
    internal fun generateAttack(): Int = (20..60).random()
}

/*private class Bonus {
    val life = 100
}*/