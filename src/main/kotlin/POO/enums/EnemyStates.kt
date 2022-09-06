package POO.enums
/*
Enum: clase que tiene una colección de valores ya definidos en un
holder o contenedor que no deberían cambiar en ningún momento
constante -> convención usar cada valor en mayúsculas
cuando defines enum darle nombre muy detallado que explique
qué valores conteiene o que refiere a un listado categórico
 **************Cada valor presente en la colección de valores representa una instancia
 de la clase en cuestión*****************/
enum class EnemyStates {
    //IDDLE Animación por defecto o estado de reposo
    IDDLE,
    WALK,
    RUN,
    ATTACK,
    POWER_ATTACK,
    PATROL,
    DASH,
    DIE
}