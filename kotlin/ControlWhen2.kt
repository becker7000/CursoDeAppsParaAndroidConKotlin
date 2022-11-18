
fun main() {

    print("\n\t Escribe un número con decimales: ")
    val numero = readLine().toString().toFloat()

    // También podemos usar la estructura de control when
    // sin paramatros y básicamente puede funcionar con un if-else
    val mensaje = when{
        numero>0 -> "El número es positivo"
        numero<0 -> "El número es negativo"
        else -> "El número es exactamente cero"
    }

    print("\n\t $mensaje")

}