package POO.interfaces

///Conjunto de métodos: los métodos solo eran abstractos o conceptos...
//Aplicables a nivel de cualquier clase...
//se pueden pensar en una especie de multi herencia... HERENCIA MÚLTIPLE
//Reglas del juego -> CONTRATOS
//INTERFAZ = CONTRATOS
//Los comportamientos de las interfaces son obligatorios de implementar porque son abstractos.
/*
Interfaces 2.0 --- Final de los finales
1) Las interfaces permiten atributos que pueden ser abstractos
2) Las interfaces ahora permiten desarrollar la lógica de la función dentro de su estructura
Ojo: en lo posible trata de aplicar conceptos abstractos a la hora de definir comportamientos,
solo si el comportamiento no variará o será similar al momento de implementar, aplicar la lógica de la interfaz.
 */

//Herencia: misma naturaleza dependencia directa de padre e hijo

//Interfaz: comportamientos es lo que más se ajusta en los cambios de proyecto
//se puede implementar en cualquier clase del software

//Interfaz sobre abstracto por simular multi herencia
//La herencia solo permite herencia con cosas de la misma naturaleza = clase abstracta
//Cualquier clase del proyecto puede adoptar los comportamientos de la interfaz = interfaces

//Un ejemplo de interfaz es OnClick en Android Studio
interface Localizable {
    abstract var latitud: Double
    abstract var longitud: Double

    //Comportamientos
    fun calculatePositionGps(): String

    open fun showInformation(): String {
        return """
            Tu latitud es: $latitud
            Tu longitud es: $longitud
            Estas en Bolivia
        """.trimIndent()
    }
}