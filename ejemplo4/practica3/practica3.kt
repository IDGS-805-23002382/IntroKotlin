/*

Problema 3: Un controlador PLC bloquea el acceso tras 3 intentos fallidos de ingresar una clave de seguridad.
 */

 fun main (){

   var intentos = 0
   var clave = 123

    do{
        println("Ingrese la clave de seguridad: ")
         var entrada = readln().toInt()
        if(entrada == clave){
             println ("Clave correcta!")
        }
        else {
            intentos++
            println("Clave incorrecta. Intentos restantes: ${3 - intentos}")
        }
    } while (entrada != clave)
 
         println ("Acceso")

    }
            

    