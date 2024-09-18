package Termometro

import TempHabitacion.TempHabitacion

class TermometroDigital : Termometro {
    override fun mostrarTemp(tempActual: TempHabitacion.TempHabitacion) {
        println("""
            La temperatura actual: ${tempActual.getTempActual()}
        """.trimIndent())
    }

    override fun leerTemp(tempActual: TempHabitacion.TempHabitacion): Double {
        return tempActual.getTempActual()
    }
}