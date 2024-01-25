class Triangulo(private val base: Double, private val altura: Double) {
    //Constructor principal\\

    //Indicamos que los valores recibidos no pueden ser menores que 0
    init {
        require (base > 0.0) { "La base debe de ser mayor de 0." }
        require (altura > 0.0) { "La altura debe ser mayor de 0" }
    }

    /**
     * Calcular área:
     * @return Devuelve el área del triángulo.
     */
    fun calArea(base: Double, altura: Double): Double{
        return base * altura
    }

    /**
     * Calcular Perímetro:
     * @return Devuelve el perímetro total de triándulo.
     */
    fun calPerimetro(base: Double): Double{
        val perimetro = base * 3
        return perimetro
    }

}