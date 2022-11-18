
fun main() {

    print("\n\t Ingresa un color del semaforo: ")
    val color = readLine().toString()

    when(color){ //Selector o variable de control
        "Verde","verde" -> print("\n\t Avanza!")
        "Amarillo","amarillo" -> print("\n\t Precaución!")
        "Rojo","rojo" -> print("\n\t Detente!")
        else -> print("\n\t Error, color no válido!")
    }

    print("\n\t Escribe un código: ")
    val code = readLine().toString().toInt()
    when(code){ // Trabajando con un entero de acuerdo a rangos:
        in 200..299 -> print("\n\t Todo está OK")
        in 400..500 -> print("\n\t Algo ha falládo y no sé que es...")
        else -> print("\n\t Código desconocido...")
    }

    print("\n\t Escribe una letro o simbolo: ") // México
    val letra = readLine().toString()[0] // Guardamos únicamente un caracter

    // Notación inline
    val mensaje = when(letra){
        'a','A' -> "Soy la primera vocal"
        'e','E' -> "Soy la segunda vocal"
        'i','I' -> "Soy la tercer vocal"
        'o','O' -> "Soy la cuarta vocal"
        'u','U' -> "Soy la quinta vocal"
        else -> "No soy una vocal..."
    }

    print("\n\t $mensaje")

}