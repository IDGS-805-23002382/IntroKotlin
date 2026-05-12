/*

Problema2: Una bateria comienza con 0% de carga. Un cargador añade 15% cada minuto. 
Se debe detener el ciclo cuando la carga llegue o supere el 100%.


 

 fun main (){
    var carga = 0

    while (carga< 100){
        println(carga )
        carga += 15

    }

}
    */

fun main (){

    // do-, while
     var carga = 0

    do{
      
        if(carga < 100){
        println(carga )
        carga += 15
        }
    } while (carga < 100)
         println(carga )
        carga += 15
       
    }
