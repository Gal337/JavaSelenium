import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;


public class FramesTest {
    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver", "C:\\Program Files\\Java\\geckodriver-v0.32.0-win64\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        String link = "https://jqueryui.com/droppable";
        driver.manage().window().maximize();
        driver.get(link);
//        Getting the number of frames on the webpage
        System.out.println(driver.findElements(By.tagName("iframe")).size());
//        Switching to iFrame
        driver.switchTo().frame(0);
//        driver.switchTo().frame(driver.findElement(By.cssSelector("iframe.demo-frame")));
//        driver.findElement(By.id("draggable")).click();
//        Declaring WebElements for source and target drag and drop action
        WebElement source = driver.findElement(By.id("draggable"));
        WebElement target = driver.findElement(By.id("droppable"));
//        Creating Actions class for drag and drop function
        Actions a = new Actions(driver);
        a.dragAndDrop(source, target).build().perform();
//        For doing other operations on the webpage, iFrame needs to be exited, we do it with command below
        driver.switchTo().defaultContent();
    }
}
