import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CourseTest {

    @Test
    void division() {
        int validNumOne = 6;
        int validNumTwo = 2;
        int result = Course.division(validNumOne, validNumTwo);
        assertEquals(result, 3);
    }
}