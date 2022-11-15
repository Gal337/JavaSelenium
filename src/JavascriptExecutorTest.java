import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class JavascriptExecutorTest {
    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver", "C:\\Program Files\\Java\\geckodriver-v0.32.0-win64\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        String link = "https://ksrtc.in/oprs-web/guest/home.do";

        driver.manage().window().maximize();
        driver.get(link);
        //Choosing destination from dropdown with multiple choices
        driver.findElement(By.xpath("//input[@id='fromPlaceName']")).sendKeys("BENG");
        //Adding IMPLICIT WAIT so webpage can fully load
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.findElement(By.xpath("//input[@id='fromPlaceName']")).sendKeys(Keys.DOWN);
        System.out.println(driver.findElement(By.xpath("//input[@id='fromPlaceName']")).getText());
        //JavaScript DOM can extract hidden elements
        //Selenium can not identify hidden elements (Ajax implementation)
        //Investigate the properties of object if it have any hidden text to get the element
        //=====================================
        //Declaring JavascriptExecutor variable
        //=====================================
        JavascriptExecutor js = (JavascriptExecutor) driver;
        //Getting JavascriptExecutor element and saving it to variable script
        String script = "return document.getElementById(\"fromPlaceName\").value;";
        //Executing the script and saving it to variable text
        String text = (String) js.executeScript(script);
        System.out.println(text);
        int i = 0;
        //Iterating through values until we reach desired value
        while (!text.equalsIgnoreCase("BENGALURU INTERNATIOn AIRPORT"))
        {
            i++;
            driver.findElement(By.xpath("//input[@id='fromPlaceName']")).sendKeys(Keys.DOWN);
            text = (String) js.executeScript(script);
            System.out.println(text);
            if (i > 10) {
                break;
            }
        }
        if (i > 10) {
            System.out.println("Element not found");
        } else {
            System.out.println("Element found");
        }
    }
}
