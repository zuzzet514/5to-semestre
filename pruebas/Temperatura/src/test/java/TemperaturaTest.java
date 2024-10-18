import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TemperaturaTest {

    @Test
    void casoMenorA36dot5() {
        assertEquals("HIPOTERMIA", Temperatura.promedioTemperatura(32,32,33));
    }

    @Test
    void casoMayorA36dot5() {
        assertEquals("NORMAL", Temperatura.promedioTemperatura(35,38,38));
    }

    @Test
    void casoMenorA37dot4() {
        assertEquals("NORMAL", Temperatura.promedioTemperatura(35,38,38));
    }

    @Test
    void casoMayorA37dot5() {
        assertEquals("HIPERTERMIA", Temperatura.promedioTemperatura(36,39,39));
    }

    @Test
    void casoMeor39dot9() {
        assertEquals("HIPERTERMIA", Temperatura.promedioTemperatura(40,39,40));
    }

    @Test
    void casoMayor40() {
        assertEquals("HIPERPIREXIA", Temperatura.promedioTemperatura(40,40,40));
    }

    @Test
    void casoPrimeraTempMenorA30() {
        assertEquals("EL VALOR 29 NO ES CORRECTO", Temperatura.promedioTemperatura(29,30,30));
    }

    @Test
    void casoSegundaTempMenorA30() {
        assertEquals("EL VALOR 29 NO ES CORRECTO", Temperatura.promedioTemperatura(30,29,30));
    }

    @Test
    void casoTodasMenorA30() {
        assertEquals("EL VALOR 29 NO ES CORRECTO", Temperatura.promedioTemperatura(29,29,29));
    }

    @Test
    void casoPrimeraTempMayorA45() {
        assertEquals("EL VALOR 46 NO ES CORRECTO", Temperatura.promedioTemperatura(45,46,45));
    }

    @Test
    void casoSegundoTempMayorA45() {
        assertEquals("EL VALOR 46 NO ES CORRECTO", Temperatura.promedioTemperatura(45,46,45));
    }

    @Test
    void casoTerceraTempMayorA45() {
        assertEquals("EL VALOR 46 NO ES CORRECTO", Temperatura.promedioTemperatura(45,45,46));
    }

}