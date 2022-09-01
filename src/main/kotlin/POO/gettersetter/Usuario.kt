package POO.gettersetter
//En kotlin los getter y setter son implicitos por defecto
/*
Los getter y setter manuales se usan cuando no
se usen atributos en el constructor principal.
Aplicarlos para utilizar un lógica adicional al momento de asignar o
recibir valores para sus atributos esos.
Cuando se configuran manualmente, estos van inmediatamente después  de
la denominación de la variable o atributo.
Tanto getter como setter utilizan un tipo de contenedor o campo que es el
que va a asignar a la variable o atributo.
 */
//*****Registro de inicio de sesión de usuario ******///
/*
Reglas email:
1) Debe tener @
2) Debe estar en minúsculas
Reglas password:
1)At least 8 caracteres
2)Un caracter numérico
3)Al menos una mayúscula y minúscula
4) Un caracter especial
 */
class Usuario() {
    //Atributos
    //value = valor que se está asignando al atributo
    var esValido = true
    var mensajeError = ""
    var email: String = ""
        set(value) {
            field = if (value.contains("@")) value.lowercase() else {
                esValido = false
                mensajeError = "El email no tiene el formato establecido"
                ""
            }
        }
    var password: String = ""
        set(value) {
            field = if(value.matches("^(?=.*?[A-Z])(?=.*?[a-z])(?=.*?[0-9])(?=.*?[#?!@\$%^&*-]).{8,30}\$".toRegex())) value else {
                esValido = false
                mensajeError = "La password no cumple con la solicitud minima"
                ""
            }
        }
        get() {return "*".repeat(field.length)}
}