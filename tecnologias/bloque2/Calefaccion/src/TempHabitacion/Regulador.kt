package TempHabitacion

import Calentador.Calentador
import Termometro.Termometro

class Regulador private constructor() {
    private var maxTemp: Double = 0.0
    private var minTemp: Double = 0.0

    companion object {
        private var instance: Regulador? = null

        fun getInstance(): Regulador {
            if (instance == null) {
                instance = Regulador()
            }
            return instance!!
        }
    }

    fun setMaxTemp(maxTemp: Double) {
        this.maxTemp = maxTemp
    }

    fun setMinTemp(minTemp: Double) {
        this.minTemp = minTemp
    }

    fun getMinTemp(): Double {
        return minTemp
    }

    fun tempPromedio(maxTemp: Double, minTemp: Double): Double {
        return (maxTemp + minTemp) /2
    }

    fun calibrarTemp(termometro : Termometro, minTemp: Double, tempActual : TempHabitacion) {
        if(termometro.leerTemp(tempActual) > maxTemp || termometro.leerTemp(tempActual) < minTemp) {
            println("""
                (!) TEMPERATURA FUERA DEL RANGO (!)
                Calibrando...
                Temperatura resstablecida a: ${tempPromedio(maxTemp, minTemp)}
            """.trimIndent())
            tempActual.setTempActual(tempPromedio(maxTemp, minTemp))
        } else {
            println("""
                
                Temperatura dentro del rango permitido. No hay nada que hacer.
                
            """.trimIndent())
        }
    }


}