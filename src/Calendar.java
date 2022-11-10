import org.openqa.selenium.Keys;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import graphql.relay.Edge;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import java.util.List;

public class Calendar {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.edge.driver", "C:\\Program Files\\Java\\edgedriver_win64\\msedgedriver.exe");
//        System.setProperty("webdriver.geckodriver.driver", "C:\\Program Files\\Java\\geckodriver-v0.32.0-win64\\geckodriver.exe");

        WebDriver driver = new EdgeDriver();
//        WebDriver driver2 = new FirefoxDriver();

        driver.manage().window().maximize();

//        String link = "https://www.spicejet.com";
        String link2 = "https://www.airindia.in/";
        String link3 = "https://rahulshettyacademy.com/dropdownsPractise/";
//        String link4 = "https://www.airindia.in/";
        String rButton1 = "//input[@value='OneWay']";
        String rButton2 = "//input[@value='RoundTrip']";

        driver.get(link3);
//        Using Thread.sleep function so elements get loaded
//        Thread.sleep(2000);
//        Selecting radio button (Round Trip and then reverting selection to One Way)
        driver.findElement(By.xpath(rButton2)).click();
//        Selecting FROM and TO places
        driver.findElement(By.xpath("//input[@id='ctl00_mainContent_ddl_originStation1_CTXT']")).click();
        driver.findElement(By.cssSelector("a[value='BLR']")).click();
//        Using Thread.sleep function so elements get loaded
        Thread.sleep(1000);
        driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();
//        Selecting current day from Calendar
//        CSS selector - we use class attribute for selector by writing the value of class attribute with . infront and . for space
        driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight")).click();
//        Selecting multiple passengers (adults)
        driver.findElement(By.id("divpaxinfo")).click();
        Thread.sleep(1000);
        for (int i = 0; i < 2; i++) {
            driver.findElement(By.id("hrefIncAdt")).click();
        }
//        Selecting the currency from Currency dropdown menu
        Select s = new Select(driver.findElement(By.xpath("//select[@id='ctl00_mainContent_DropDownListCurrency']")));
        s.selectByValue("USD");


//        ---------------------------------------------------------------
//        Selecting an option from auto-suggestive dropdown menu EXAMPLE:
//        ---------------------------------------------------------------
        Thread.sleep(10000);
        driver.get(link2);
        WebElement from = driver.findElement(By.id("from"));
        WebElement to =  driver.findElement(By.id("to"));
        from.clear();
        from.sendKeys("Dub");
        Thread.sleep(1000);
        from.sendKeys(Keys.ARROW_DOWN);
        from.sendKeys(Keys.ENTER);
        to.sendKeys("Can");
        Thread.sleep(1000);
        for (int i = 0; i < 3; i++){
            to.sendKeys(Keys.ARROW_DOWN);
        }
        to.sendKeys(Keys.ENTER);
    }

}
