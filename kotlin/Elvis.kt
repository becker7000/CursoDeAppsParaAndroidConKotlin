
fun main() {

    val telefono : String? = null // Este valor puede asignarse o no

    // Usando el operador Elvis (se nombró así por el copete del cantante)
    val longitud : Int = telefono?.length ?: 0
    print("\n\t El telefono tiene $longitud digitos...")

}