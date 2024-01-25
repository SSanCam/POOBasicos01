
/*
Ejercicio 4.1¶
Crear una clase Rectángulo, con atributos base y altura.
La clase debe disponer del constructor y los métodos para calcular el area y el perimetro.
Los atributos no se podrán modificar, aunque si consultar. Por último,
tendrán que ser mayor que 0.
*/
fun main() {


    println("Introduce la altura del triángulo: ")
    val altura = readln().toDouble()
    println("Introduce la base del triángulo: ")
    val base = readln().toDouble()

    val triangulo = Triangulo(base, altura)
    println("Área del triángulo: ${triangulo.calArea(base,altura)}cm.")
    println("Perímetro del triángulo: ${triangulo.calPerimetro(base)}cm.")
}