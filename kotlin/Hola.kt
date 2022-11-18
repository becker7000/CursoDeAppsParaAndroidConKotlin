
//Las constante se definen fuera de la función main
//Se usa la palabra reservada const
const val PI = 3.1415926565 // Las constantes van en mayusculas

fun main() {

    print("\n\t Hola a todos desde Kotlin...")

    var monto = 100 // Kotlin maneja inferencia de datos
    // Kotlin sabe que el 100 en tipo Int y por eso sería redundante declararlo
    print("\n\t Monto: $$monto ")
    monto = 400
    print("\n\t El nuevo monto: $$monto")

    val nombre = "Erick"
    print("\n\t El nombre es: $nombre")

    // Imprimiendo una constante
    print("\n\t El valor de PI: $PI")

    // Usando un valor booleano
    val banderilla = true
    print("\n\t El valor booleano es: $banderilla")

    // Usando un valor long
    val largo = 34239384L
    print("\n\t Valor long: $largo")

    // Usando un valor double
    val phi = 1.6261
    print("\n\t El valor de phi es: $phi")

    // Usando un valor flotante
    val euler = 2.71f
    print("\n\t El valor de euler: $euler")

    // Usando otra cadena
    val apellido = "Alvarez"
    print("\n\t Nombre completo: $nombre $apellido")

}