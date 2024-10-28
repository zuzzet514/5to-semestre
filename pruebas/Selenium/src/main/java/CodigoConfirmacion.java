import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Scanner;

public class CodigoConfirmacion {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.get("http://www.pino.mx/ti/codigo01.php");

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresa tu matrícula: ");
        String matricula = sc.nextLine();

        // obteniendo el input de la matricula
        WebElement inputMatricula = driver.findElement(By.name("matricula"));
        // mandando mi matricula
        inputMatricula.sendKeys(matricula);
        inputMatricula.submit();

        // obteniendo input del código
        WebElement inputCodigo = driver.findElement(By.name("codigo"));
        String codigo = inputCodigo.getAttribute("value");

        System.out.println(codigo);

        driver.get("http://www.pino.mx/ti/acceso01.php");

        WebElement inputMatricula2 = driver.findElement(By.name("matricula"));
        WebElement inputCodigo2 = driver.findElement(By.name("codigo"));

        inputMatricula2.sendKeys(matricula);
        inputCodigo2.sendKeys(codigo);
        inputCodigo2.submit();

        WebElement inputConfirmacion = driver.findElement(By.name("confirmacion"));
        String confirmacion = inputConfirmacion.getAttribute("value");

        System.out.println("Matrícula: " + matricula + "\nCodigo: " + codigo + "\nID Confirmacion: " + confirmacion);


    }
}
