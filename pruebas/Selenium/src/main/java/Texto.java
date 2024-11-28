import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Texto {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.softplan.com.br/es/tech-writers/ihc/");

        String xpath = "//p[not(@id) and not(@class) and not(@name)]";

        List<WebElement> paragraphs = driver.findElements(By.xpath(xpath));

        for (WebElement paragraph : paragraphs) {
            System.out.println(paragraph.getText());
        }
    }
}
