
fun main() {

    var opcion : Int // Declaración con tipado

    do{
        print("\n\t Escribe un natural entre 1 y 5: ")
        opcion = readLine().toString().toInt()
    }while(opcion<1 || opcion>5) // Condición del filtro

    print("\n\t La opción $opcion es válida")

}