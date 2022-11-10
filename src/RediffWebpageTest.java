import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class RediffWebpageTest {

    public static void main(String[] args) {

        System.setProperty("webdriver.edge.driver","C:\\Program Files\\Java\\edgedriver_win64\\msedgedriver.exe");

        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.rediff.com/");
        //Custom CSS selector, * identifies the first selector matching the value of tagName attribute
        driver.findElement(By.cssSelector("[title*='Sign in']")).click();
//        WebElement firstResult = new WebDriverWait(driver, Duration.ofSeconds(5)).until(ExpectedConditions.elementToBeClickable(By.xpath("//input[contains(@name,'procee')")));
        driver.findElement(By.xpath("//input[@id='login1']")).sendKeys("test");
//        driver.findElement(By.cssSelector("input#password")).sendKeys("goodbye");
        driver.findElement(By.cssSelector("#password")).sendKeys("goodbye");
        driver.findElement(By.xpath("//input[contains(@name,'procee')]")).click();

    }

}
