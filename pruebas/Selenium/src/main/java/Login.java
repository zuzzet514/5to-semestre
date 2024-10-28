import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        /* //google


        driver.get("https://www.google.com/");

        System.out.println("Título de la página: " + driver.getTitle());

        WebElement element = driver.findElement(By.name("q"));
        element.sendKeys("selenium");

        element.submit();

        //driver.quit();
        */

        driver.manage().window().maximize();
        // duckduckgo

        driver.get("https://duckduckgo.com/");

        System.out.println("Título de la página: " + driver.getTitle());

        WebElement element = driver.findElement(By.id("searchbox_input"));
        element.sendKeys("monsta x");

        element.submit();

        String elementval = driver.findElement(By.name("q")).getAttribute("value");
        System.out.println("Elemento: " + elementval);

    }
}
