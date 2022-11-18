fun main() {

    // Este tipo de lista no se puede modificar
    val listaDeNombres = listOf("Juan","Karla","Luis","Ana")
    print("\n\t Lista de golpe: $listaDeNombres")

    listaDeNombres.forEach {
        nombre -> print("\n\t $nombre")
    }

    // Este tipo de lista sí se puede modificar
    val listaVacia = mutableListOf<String>() // Declando una lista vacía de Strings
    listaVacia.add("WRX")
    print("\n\t Lista de autos: ")
    listaVacia.forEach { auto -> print(" $auto") }

    // Accediendo al primer elemento de ambas listas:
    print("\n\t Primer elemento (nombres): ${listaDeNombres[0]}")
    print("\n\t Primer elemento (autos): ${listaVacia[0]}")

    // El método first, nos permite acceder al primer elemento que cumpla una condición
    print("\n\t Nombre con 3 letras: ${listaDeNombres.first { nombre -> nombre.length==3 }}")

    // Eliminando un elemento de una lista de datos (sólo aplica con mutableListOf)
    listaVacia.removeAt(0)
    print("\n\t Lista vacía: $listaVacia") // Imprimiendo una lista vacía

    // Método firstOrNull guarda el primer elemento de una lista o nulo si este no existe
    val valorNulo : String? = listaVacia.firstOrNull() // Nota: ayuda a evitar una NoSuchElementException
    print("\n\t Primer elemento de la lista o nulo: $valorNulo")

    // Agregando muchos elemento a una lista mutable
    listaVacia.addAll(mutableListOf("R8","Yaris GR","Golf R","Roma","Model Y","Mustang Mach-E","Corvette","Challenger"))

    print("\n\n\t Lista de autos: ")
    listaVacia.forEach { auto -> print("\n\t ${listaVacia.indexOf(auto)}) $auto ") }

    // El método removeIf, sirve para eliminar un elemento de una mutableListOf dada una condición
    listaVacia.removeIf{
        auto -> auto == "Model Y"
    }

    print("\n\t Autos: $listaVacia")


}