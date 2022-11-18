
fun main() {

    print("\n\t Escribe tu nombre: ") // Instrucción
    val nombre : String = readLine().toString() // Todas las variables en Kotlin son un objeto

    if(nombre.isNotEmpty()){
        print("\n\t Tu nombre tiene ${nombre.length} letras")
    }else{
        print("\n\t Error, el nombre no tiene letras...")
    }

    // Creando un mensaje
    val mensaje = if(nombre.length>4){
        "Tu nombre es largo"
    }else if(nombre.isEmpty()){
        "Tu nombre no tiene letras"
    }else{
        "Tu nombre es corto"
    }

    print("\n\t El mensaje es: $mensaje")

}