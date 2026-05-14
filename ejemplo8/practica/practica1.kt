/*
Suma de dos matrices 3x3 en Kotlin

Crear un programa que permita al usuario ingresar por teclado
los valores de dos matrices de tamaño 3x3 y posteriormente
realiza la suma de ambas matrices, mostrando el resultado en pantalla.
*/

fun main() {

    // Crear las matrices
    val matriz1 = Array(3) { FloatArray(3) }
    val matriz2 = Array(3) { FloatArray(3) }
    val resultado = Array(3) { FloatArray(3) }

    // Llenar matriz 1
    println("Ingrese los valores de la primera matriz")

    for (i in 0..2) {
        for (j in 0..2) {
            print("Elemento [$i][$j]: ")
            matriz1[i][j] = readln().toFloat()
        }
    }

    // Llenar matriz 2
    println("\nIngrese los valores de la segunda matriz")

    for (i in 0..2) {
        for (j in 0..2) {
            print("Elemento [$i][$j]: ")
            matriz2[i][j] = readln().toFloat()
        }
    }

    // Sumar matrices
    for (i in 0..2) {
        for (j in 0..2) {
            resultado[i][j] = matriz1[i][j] + matriz2[i][j]
        }
    }

    // Mostrar resultado
    println("\nLa suma de las matrices es:")

    for (i in 0..2) {
        for (j in 0..2) {
            print("${resultado[i][j]} ")
        }
        println()
    }
}