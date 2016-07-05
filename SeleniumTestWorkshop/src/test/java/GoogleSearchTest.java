import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;


public class GoogleSearchTest {

    @Test
    public void testWebSearch() throws Exception {
        WebDriver driver = new ChromeDriver();

        driver.get("http://www.google.com");

        WebElement element = driver.findElement(By.name("q"));

        element.sendKeys("an interesting topic");

        element.submit();

        Thread.sleep(3000);

        List<WebElement> elements = driver.findElements(By.tagName("h3"));

        assert elements.size() > 0;

        driver.quit();
    }

}
