import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class RelativeLocators {
    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver", "C:\\Program Files\\Java\\geckodriver-v0.32.0-win64\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        String link = "https://rahulshettyacademy.com/angularpractice/";

        driver.manage().window().maximize();
        driver.get(link);

//        above() - relative locator
        WebElement nameEditBox = driver.findElement(By.cssSelector("[name='name']"));
        System.out.println(driver.findElement(with(By.tagName("label")).above(nameEditBox)).getText());
//        below() - relative locator
        WebElement dateofBirth = driver.findElement(By.xpath("//label[@for='dateofBirth']"));
        driver.findElement(with(By.tagName("input")).below(dateofBirth)).sendKeys("17/03/1987");
//        to Left of - relatice locator
        WebElement iceCream = driver.findElement(By.xpath("//label[text()='Check me out if you Love IceCreams!']"));
        driver.findElement(with(By.tagName("input")).toLeftOf(iceCream)).click();
//        Getting the label of first radio button
//        to Right of - relative locator
        WebElement rButton = driver.findElement(By.id("inlineRadio1"));
        System.out.println(driver.findElement(with(By.tagName("label")).toRightOf(rButton)).getText());


    }
}
