fun main() {

    // Existen dos tipos de lista: no mutables y mutables

    // Declarando una lista unmutable
    val listaFrutas = listOf("Mango","Sandía","Kiwi","Pera","Manzana")
    // listaFrutas.add("Platano") // Esta linea solo funciona si la lista es mutable

    // Imprimiendo toda la lista de golpe:
    print("\n\n\t Frutas: $listaFrutas")

    // Usando el ciclo for in
    print("\n\n\t Lista de frutas (for in): ")
    for(fruta in listaFrutas) // for in
        print("\n\t Aquí hay $fruta")

    // Usando un foreach con lambda
    print("\n\n\t Frutas con foreach: ")
    listaFrutas.forEach {
        fruta -> print("\n\t Fruta #${listaFrutas.indexOf(fruta)}: $fruta")
    }

    // Creando una lista a partir de otra con el método .map
    val longitudesFrutas = listaFrutas.map{
        fruta -> fruta.length // length devuelve la longitud de una cadena
    }

    // Imprimiendo la lista creada
    print("\n\t Longitudes de las frutas: ")
    longitudesFrutas.forEach {
        long -> print(" $long")
    }

    // Creando una lista a partir de filtrar otra:
    val listaFiltrada = listaFrutas.filter {
        fruta -> fruta.length<=4
    }

    // Imprimiendo la lista filtrada:
    print("\n\n\t Lista filtrada: $listaFiltrada")

}


/*
*    Listas:
*    Indice-Valor
*     0-Mango
*     1-Sandía
*     2-Kiwi
*     3-Pera
*     4-Manzana
*
*    Mapas (Maps)
*    Clave-Valor
*    Mango-5
*    Sandía-6
*    Kiwi-4
*    Pera-4
*    Manzana-7
*
*
* */
