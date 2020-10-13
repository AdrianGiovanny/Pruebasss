//1. Desarrollar un algoritmo en scala que calcule el radio de un circulo

def Diame=2000
def Radio = Diame/2
Radioc

//2. Desarrollar un algoritmo en scala que me diga si un numero es primo
def numeroprimo(num:Int): Boolean = {
    for(n <- Range(2, num)){
        if(num%n == 0){
            return false
        }
    }
    return true
}

println(numeroprimo())

//3. Dada la variable bird = "tweet", utiliza interpolacion de string para imprimir "Estoy ecribiendo un tweet"
val bird = "Tweet, " + "Estoy escribiendo un Tweet!"