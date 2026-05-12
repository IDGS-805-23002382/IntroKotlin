/*
Crear un programa que permita calcular el área de 4 figuras utilizando funciones para cada figura.
Mostrará un menú para elegir la figura a calcular el área, pedirá los valores necesarios
y mostrará el resultado. Después mostrará nuevamente el menú.
Termina al elegir la opción 5.
*/

import kotlin.math.pow
import kotlin.math.PI

fun limpiarPantalla() {
    ProcessBuilder("cmd", "/c", "cls")
        .inheritIO()
        .start()
        .waitFor()
}

fun areaCuadrado() {
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

    var opc = 0

    while (opc != 5) {

        println("\n--- MENÚ DE ÁREAS ---")
        println("1. Área del cuadrado")
        println("2. Área del triángulo")
        println("3. Área del rectángulo")
        println("4. Área del círculo")
        println("5. Salir")
        print("Elige una opción: ")

        opc = readln().toInt()

        when (opc) {

            1 -> areaCuadrado()

            2 -> areaTriangulo()

            3 -> areaRectangulo()

            4 -> areaCirculo()

            5 -> println("Saliendo del programa...")

            else -> println("Opción no válida")
        }
    }
}