import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultiplesMatriculas {
    public static void main(String[] args) {
        String[][] matriculas = new String[46][3];

        WebDriver driver = new ChromeDriver();
        WebElement input;

        for (int i = 0; i < 46; i++) {
            String matricula;
            String codigo;
            String idConfirmacion;

            // primero: obtener la matricula
            driver.get("http://www.pino.mx/ti/lista.php");

            input = driver.findElement(By.id("m_"+(i+1) ));
            matricula = input.getAttribute("value");

            // segundo, ingresar matricula y obtener codigo
            driver.get("http://www.pino.mx/ti/codigo01.php");
            input = driver.findElement(By.name("matricula"));
            input.sendKeys(matricula);
            input.submit();

            input = driver.findElement(By.name("codigo"));
            codigo = input.getAttribute("value");

            //obetener el id de verificacion
            driver.get("http://www.pino.mx/ti/acceso01.php");
            input = driver.findElement(By.name("matricula"));
            input.sendKeys(matricula);
            input = driver.findElement(By.name("codigo"));
            input.sendKeys(codigo);
            input.submit();

            input = driver.findElement(By.name("confirmacion"));
            idConfirmacion = input.getAttribute("value");

            matriculas[i][0] = matricula;
            matriculas[i][1] = codigo;
            matriculas[i][2] = idConfirmacion;

        }

        System.out.println("#\t\tMatricula\t\tCódigo\t\tID Confirmacion\n-----------------------------------------------------");
        for (int i = 0; i < 46; i++) {
            System.out.print((i+1) + "\t\t");
            for (int j = 0; j < 3; j++) {
                System.out.print(matriculas[i][j] + "\t\t");
            }
            System.out.println();
        }

        /*
        driver.get("http://www.pino.mx/ti/lista.php");

        WebElement input;

        for (int i = 0; i < matriculas.length; i++) {
            input = driver.findElement(By.id("m_"+(i+1) ));
            matriculas[i] = input.getAttribute("value");
        }

        for(String m : matriculas) {
            System.out.println(m);
        }
        */
    }
}
