import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class S22017025_ACTIVIDAD_25 {
    public static void main(String[] args) {
        String[][] nombres = new String[16][3];

        WebDriver driver = new ChromeDriver();
        WebElement input;

        for (int i = 0; i < nombres.length; i++) {
            String nombre;
            String apellido;
            String idConfirmacion;

            // primero, obtener nombre
            driver.get("http://www.pino.mx/act25/lista.php");
            input = driver.findElement(By.id("nom_"+(i+1) ));
            nombre = input.getAttribute("value");

            // segundo, obtener apellido
            input = driver.findElement(By.id("ap_"+(i+1)));
            apellido = input.getAttribute("value");

            nombres[i][0] = nombre;
            nombres[i][1] = apellido;

            //tercero, obetener el id de verificacion
            driver.get("http://www.pino.mx/act25/registro01.php");


                //nombre
            input = driver.findElement(By.name("nombre"));
            input.sendKeys(nombres[i][0]);

                // apellido
            input = driver.findElement(By.name("apellidos"));
            input.sendKeys(nombres[i][1]);

            input.submit();


            input = driver.findElement(By.id("confirmacion"));
            idConfirmacion = input.getAttribute("value");


            nombres[i][2] = idConfirmacion;
            /*

             */
        }

        System.out.println("#\t\tNombre completo\t\t\tID Confirmacion\n-----------------------------------------------");
        for (int i = 0; i < nombres.length; i++) {
            System.out.println((i+1) + "\t\t" + nombres[i][0] + "\t" + nombres[i][1] + "\t\t\t\t" + nombres[i][2]);
        }
    }

}
