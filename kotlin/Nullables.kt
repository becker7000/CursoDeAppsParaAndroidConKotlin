
fun main() {

    val nombre: String? = null // Así se inicia una variable en nulo
    print("\n\t El nombre es: $nombre")

    // Operador llamado double bang
    // val resultado = nombre!!.length
    // print("\n\t La longitud del nombre es: $resultado") // Da una exception

    // El bloque try catch me ayuda a manejar las exceptions
    try{
        val resultado = nombre!!.length
    }catch (exception : NullPointerException){
        print("\n\t Ha ocurrido un error y no sé que es...")
    }finally {
        print("\n\t Fin del bloque 1")
    }

    // Aplicando el bloque try-catch
    val x = 30 // Numerador
    val y = 0 // Denominador

    val division : Int = try{ x/y } catch (exception: ArithmeticException){ 0 }
    print("\n\t El resultado de la division es: $division")

   /* val division : Int // Declaramos la division
    try{
        division=x/y
        print("\n\t La division es: $division")
    }catch (exception : ArithmeticException){
        print("\n\t Prohibido dividir por cero...")
    }finally {
        print("\n\t Fin del bloque 2")
    }*/
    
}