un areaCuadrado() {
    print("Ingresa el valor del lado: ")
    val lado = readln().toDouble()
    println("El área del cuadrado es: ${lado * lado}")
}

fun areaTriangulo() {
    print("Ingresa la base: ")
    val base = readln().toDouble()
    print("Ingresa la altura: ")
    val altura = readln().toDouble()
    println("El área del triángulo es: ${(base * altura) / 2}")
}

fun areaRectangulo() {
    print("Ingresa la base: ")
    val base = readln().toDouble()
    print("Ingresa la altura: ")
    val altura = readln().toDouble()
    println("El área del rectángulo es: ${base * altura}")
}

fun areaCirculo() {
    print("Ingresa el radio: ")
    val radio = readln().toDouble()
    val area = PI * radio.pow(2)
    println("El área del círculo es: $area")
}

fun main() {
    var opc: Int = 0

    while (opc != 5) {
        println("\n--- MENÚ DE ÁREAS ---")
        println("1. Área del cuadrado")
        println("2. Área del triángulo")
        println("3. Área del rectángulo")
        println("4. Área del círculo")
        println("5. Salir")
        print("Elige una opción: ")
        
        

        when (opc) {
            1 -> areaCuadrado()
            2 -> areaTriangulo()
            3 -> areaRectangulo()
            4 -> areaCirculo()
            5 -> println("Saliendo")
            else -> println("Opción no válida")
        }
        
        if (opc != 5) {
           
            readln()
            limpiarPantalla()
        }
    }

