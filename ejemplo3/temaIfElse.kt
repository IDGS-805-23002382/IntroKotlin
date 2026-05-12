fun main(){
    println("Ingrese el sueldo del empleado")

    val sueldo=readln().toDouble()

    if (sueldo>300){
         println("Pagar impuestos")
    }
    else
     println("No paga impuestos")

     /*
     >, <, <=, >=, ==, !=
     +, -, *, /, %
     */

     val a=3
     val b=3
     val mayor= if (a>b) a else b 
     println("El numero mayor entre $a y $b es $mayor")

}