/*
Problema 1: Un programa solicita al usuario ingresar el diametro de una tuberia. 
No se permiten valores negativos o cero. El programa debe pedir el dato repetidamente 
hasta que el usuario ingrese un valor valido.
*/


fun main (){

    // do-, while

    do{
        println("Ingrese el diametro de la tubería: ")
        var diametro = readln().toInt()
        if(diametro !=0){
             println ("El diametro es: $diametro")
        }
    } while (diametro<=0)
       
        println ("El diametro no puede ser 0 o negativo")


    }




    