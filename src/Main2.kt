fun leerSensorIdiomatico (texto: String): Double {
    return texto.toDoubleOrNull() ?: -1.0
}

fun main() {
    println("Con 23.5: ${leerSensorIdiomatico("23.5")}")
    println("Con abc: ${leerSensorIdiomatico("abc")}")
}