import java.time.DateTimeException;
import java.time.LocalDate;
import java.util.HashMap;

public class AgeCalculator {

    public static int calcularEdad(int year, int month, int day) {
        // validating year
        if (year < 1900 || year > 2023) {
            throw new DateTimeException("Invalid year: " + year);
        }

        if (month < 1 || month > 12) {
            throw new DateTimeException("Invalid month: " + month);
        }

        // validating month and day
        HashMap<Integer,Integer> months = new HashMap<>();
        months.put(1, 31);
        months.put(2, 28);
        months.put(3, 31);
        months.put(4, 30);
        months.put(5, 31);
        months.put(6, 30);
        months.put(7, 31);
        months.put(8, 31);
        months.put(9, 30);
        months.put(10, 31);
        months.put(11, 30);
        months.put(12, 31);

        int maxDaysForMonth = months.get(month);

        if (day > maxDaysForMonth || day < 1) {
            throw new DateTimeException("Invalid day for the month " + day);
        }

        LocalDate today = LocalDate.now();

        return today.getYear() - year;
    }


}
