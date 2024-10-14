import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalificadorTest {

    @Test
    void casoTodosCero() {
        assertEquals(0, Calificador.calcularCalificacionFinal(0,0,0));
    }

    @Test
    void casoPrimeroMenorACero() {
        assertThrows(ArithmeticException.class, () -> Calificador.calcularCalificacionFinal(-1.56,5.87,0));
    }

    @Test
    void casoSegundoMenorCero() {
        assertThrows(ArithmeticException.class, () -> Calificador.calcularCalificacionFinal(5.68,-1.56,7.1));
    }

    @Test
    void casoTerceroMenorCero() {
        assertThrows(ArithmeticException.class, () -> Calificador.calcularCalificacionFinal(10,5.8,-0.5));
    }

    @Test
    void casoUnExamenMayorADiez() {
        assertThrows(ArithmeticException.class, () -> Calificador.calcularCalificacionFinal(10.5,8,9.2));
    }

    @Test
    void casoTodosMenoresCero() {
        assertThrows(ArithmeticException.class, () -> Calificador.calcularCalificacionFinal(-5,-1.0,-0.5));
    }

    @Test
    void casoTodosDiez() {
        assertEquals(10, Calificador.calcularCalificacionFinal(10,10,10));
    }

    @Test
    void idk() {
        assertEquals(8.56, Calificador.calcularCalificacionFinal(7.5,8.2,10));
    }

}