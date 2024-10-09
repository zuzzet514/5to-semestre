import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IMCTest {

    @Test
    void casoUno() {
        assertThrows(ArithmeticException.class, () -> IMC.calcularIMC(0,150));
    }

    @Test
    void casoDos() {
        assertThrows(ArithmeticException.class, () -> IMC.calcularIMC(150,0));
    }

    @Test
    void casoTres() {
        assertThrows(ArithmeticException.class, () -> IMC.calcularIMC(0,0));
    }

    @Test
    void casoCuatro() {
        assertThrows(ArithmeticException.class, () -> IMC.calcularIMC(601,301));
    }

    @Test
    void casoCinco() {
        assertEquals(66.66, IMC.calcularIMC(600,300));
    }

    @Test
    void casoSeis() {
        assertEquals(24.88, IMC.calcularIMC(56,150));
    }

    @Test
    void casoSiete() {
        assertEquals(24.44, IMC.calcularIMC(55,150));
    }

}