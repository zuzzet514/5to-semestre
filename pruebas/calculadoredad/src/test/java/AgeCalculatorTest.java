import org.junit.jupiter.api.Test;

import java.time.DateTimeException;

import static org.junit.jupiter.api.Assertions.*;

class AgeCalculatorTest {
    @Test
    void invalidYear1() {
        assertThrows(DateTimeException.class, () -> AgeCalculator.calcularEdad(1899,12,1));
    }

    @Test
    void invalidYear2() {
        assertThrows(DateTimeException.class, () -> AgeCalculator.calcularEdad(2024,12,1));

    }

    @Test
    void validYear1() {
        assertEquals(124, AgeCalculator.calcularEdad(1900,6,14));
    }

    @Test
    void validYear2() {
        assertEquals(1, AgeCalculator.calcularEdad(2023,7,28));
    }

    @Test
    void invalidMonth1() {
        assertThrows(DateTimeException.class, () -> AgeCalculator.calcularEdad(2004,0,1));
    }

    @Test
    void invalidMonth2() {
        assertThrows(DateTimeException.class, () -> AgeCalculator.calcularEdad(2024,13,1));
    }

    @Test
    void validMonth1() {
        assertEquals(20, AgeCalculator.calcularEdad(2004,12,31));
    }

    @Test
    void validMonth2() {
        assertEquals(1, AgeCalculator.calcularEdad(2023,2,28));
    }

    @Test
    void invalidDay() {
        assertThrows(DateTimeException.class, () -> AgeCalculator.calcularEdad(2004,6,0));
    }

    @Test
    void invalidDayForJanuary() {
        assertThrows(DateTimeException.class, () -> AgeCalculator.calcularEdad(2004,1,32));
    }

    @Test
    void invalidDayForSeptember() {
        assertThrows(DateTimeException.class, () -> AgeCalculator.calcularEdad(2004,9,31));
    }

}