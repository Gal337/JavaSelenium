import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class ActionsTest {
    public static void main(String[] args) {

        System.setProperty("webdriver.gecko.driver", "C:\\Program Files\\Java\\geckodriver-v0.32.0-win64\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        String link = "https://www.amazon.com";
//        Creating Actions class to handle actions such as mouse over, etc...
//        Passing driver into Actions, so driver can have capabilities of Actions class
        Actions a = new Actions(driver);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//        Maximizes window and opens the link
        driver.manage().window().maximize();
        driver.get(link);
//        Save specific element into WebElement variable called move
        WebElement move = driver.findElement(By.cssSelector("a[id='nav-link-accountList']"));
//        Moving to Search text box and typing in hello in capital letters
        a.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("hello").doubleClick().build().perform();
//        Moving the mouse cursor to specific element
//        .build() makes specific command / step ready to be executed and with .perform() we execute it
        a.moveToElement(move).build().perform();
//        Right-clicking on element, but if text is selected it will get deselected
        a.moveToElement(move).contextClick().build().perform();






    }
}
