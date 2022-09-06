package POO.enums

//Algunas veces se puede apoyar cada valor
//con algún o algunos atributos que sirvan para reforzar el criterio
//Enum class puede contener constructores no vacíos -> Primarios
enum class ColorCategories(
    val hexCode: String
) {
    WHITE("#FFFFFF"),
    BLACK("#000000"),
    RED("#ff0000"),
    GREEN("#008000"),
    YELLOW("#ffff00"),
    BLUE("#0000ff")
}