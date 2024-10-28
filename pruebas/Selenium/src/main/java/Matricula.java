import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Matricula {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        driver.get("http://www.pino.mx/ti/codigo01.php");

        String  miMatricula = "s22017025";

        // obteniendo el input de la matricula
        WebElement inputMatricula = driver.findElement(By.id("matricula"));
        // mandando mi matricula
        inputMatricula.sendKeys("S22017025");
        inputMatricula.submit();

        // obteniendo input del código
        WebElement inputCodigo = driver.findElement(By.id("codigo"));
        String codigo = inputCodigo.getAttribute("value");

        System.out.println("Matrícula: " + miMatricula + "; Codigo: " + codigo);
    }

}
