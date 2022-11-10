import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SteamXpath {
    public static void main(String[] args) {
        // Setting system property for browser (Edge)
        System.setProperty("webdriver.edge.driver","C:\\Program Files\\Java\\edgedriver_win64\\msedgedriver.exe");

        WebDriver driver = new EdgeDriver();

        //Maximize window
        driver.manage().window().maximize();

        //open webpage
        driver.get("https://store.steampowered.com/");
//        driver.get("https://store.steampowered.com/login/?redir=&redir_ssl=1&snr=1_4_4__global-header");
        //custom Xpath
        driver.findElement(By.xpath("//*[@class='global_action_link']")).click();

        //Waits until element(link) becomes clickable
        WebElement firstResult = new WebDriverWait(driver, Duration.ofSeconds(3)).until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@type='text']")));

        driver.findElement(By.xpath("//input[@type='text']")).sendKeys("test");
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("test");
        driver.findElement(By.xpath("//button[@type='submit']")).click();

        //custom CSS
//        driver.findElement(By.cssSelector("a[class='global_action_link']")).click();
//        driver.findElement(By.cssSelector("input#text")).sendKeys("test");
    }
}
