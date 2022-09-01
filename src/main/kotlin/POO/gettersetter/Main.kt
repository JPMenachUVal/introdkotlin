package POO.gettersetter

fun main(){
    //val usuario = Usuario("mail@mail.com","123456")
    val usuario = Usuario()
    usuario.email = "ABC@mail.com" //Setter -> parametro value = "ABC@mail.com"
    usuario.password = "a2E4#678"
    println(usuario.email) //Getter
    println(usuario.password)

    /*val usuarioRegistrado = UsuarioRegistrado()
    usuario.usuarioRegistrado = usuario*/

    //val aux = "a2E4#678"
    //println(aux.matches("^(?=.*?[A-Z])(?=.*?[a-z])(?=.*?[0-9])(?=.*?[#?!@\$%^&*-]).{8,30}\$".toRegex()))
}
//Expresión regular que diga si cadena empieza con letra minúscula