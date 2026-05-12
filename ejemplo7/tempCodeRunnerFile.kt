fun limpiarPantalla (){
   ProcessBuilder("cmd", "/c", "cls")
    .inheritIO()
    .start()
    .waitFor()
}