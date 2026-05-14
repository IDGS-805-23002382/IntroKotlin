/*
-- Tipo--   --Areglo--
Int    IntArray
Double  DoubleArray
Float FloatArray
Boolean BooleanArray
*/

fun main(){
    //numeroa
    val numeros = arrayof(1,2,3,4,5)

    println(numeros[0])

    //cadenas
    val nombres =arrayof("Ana", "Luis", "Carlos")
    println(nombres[1])

    //Recorerr arreglos

    val frutas = arrayof("Manzana", "Pera", "Uvas")

    for(fruta in frutas){
        println(fruta)
    }

    //arreglo vacio
    val numeros = Array(5){0}

    val matriz = arrayof(
        arrayof(1, 2),
        arrayof(3, 4)
    )

    print(matriz [1] [0])
}