//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    println("Con 23.5: ${leerSensor("23.5")}")
    println("Con abc: ${leerSensor("abc")}")
}

fun leerSensor(texto: String): Double {
    return try {
        texto.toDouble()
    } catch (e: NumberFormatException) {
        -1.0
    }
}