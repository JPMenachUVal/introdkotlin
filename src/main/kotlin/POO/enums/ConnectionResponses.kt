package POO.enums

//Las clases enum pueden tener tanto clases como métodos, los atributos que se desee incorporar deben
//ir al final de la lista de categorías, y luego del último valor de la lista colocar ; para indicar que luego
//habrá má<s contenido.
enum class ConnectionResponses(
    val message: String
) {
    SUCCESS("La conexión ha sido exitosa") {
        override var responseCode: Int = 200

        override fun showServerLog(): String {
            return """dguiohd
                gdsagjiadsgjk
                gd dhdfhf
                 f gdj qweq
            """.trimIndent()
        }

        override fun getCountIntents(): Int = (1..5).random()
    },
    PERMISSION_DENIED("Tu usuario no tiene permiso para acceder a este recurso") {
        override var responseCode: Int = 401

        override fun showServerLog(): String {
            return """ghuighdf g
                | hgd
                |  gdfiog ds
                |   ghjugde
            """.trimIndent()
        }

        override fun getCountIntents(): Int = (1..3).random()
    },
    INTERNAL_ERROR("El servidor tuvo un problema, por favor intenta más tarde") {
        override var responseCode: Int = 500

        override fun showServerLog(): String {
            return """ftdhsufhsduf error ddfel shf dsfh soie srhsio 
                |sdfuio sfhse
                |sfs hso sefssj seservirdor aaaaaAA
                |hdfas aaaaaaaaaaaaa
            """.trimIndent()
        }

        override fun getCountIntents(): Int = 2
    };

    //Atributos
    abstract var responseCode: Int
    val pingConnection: Int = 110

    abstract fun showServerLog(): String
    abstract fun getCountIntents(): Int
    open fun showServerConnection(): String {
        return "https://www.heroku.com"
    }

}