import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;


public class End2EndTest {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.gecko.driver", "C:\\Program Files\\Java\\geckodriver-v0.32.0-win64\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        String link = "https://rahulshettyacademy.com/dropdownsPractise/";
        String rButton1 = "//input[@value='OneWay']";
        String rButton2 = "//input[@value='RoundTrip']";

        driver.manage().window().maximize();

        driver.get(link);
//        Using Thread.sleep function so elements get loaded
//        Thread.sleep(2000);
//        Selecting radio button (Round Trip and then reverting selection to One Way)
        driver.findElement(By.xpath(rButton1)).click();
//        Selecting FROM and TO places
        driver.findElement(By.xpath("//input[@id='ctl00_mainContent_ddl_originStation1_CTXT']")).click();
        driver.findElement(By.cssSelector("a[value='BLR']")).click();
//        Using Thread.sleep function so elements get loaded
        Thread.sleep(1000);
        driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();
//        Checking if the web element is enabled or disabled
        if (driver.findElement(By.id("Div1")).getAttribute("style").contains("0.5"))
        {
            System.out.println("It's disabled.");
            Assert.assertTrue(true);
        } else {
            System.out.println("Round trip is selected.");
            Assert.assertTrue(false);
        }
//        Selecting current day from Calendar
//        CSS selector - we use class attribute for selector by writing the value of class attribute with . infront and . for space
        driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight")).click();
//        Selecting multiple passengers (adults)
        driver.findElement(By.id("divpaxinfo")).click();
        Thread.sleep(1000);
        for (int i = 0; i < 3; i++) {
            driver.findElement(By.id("hrefIncAdt")).click();
        }
//        Selecting the currency from Currency dropdown menu
        Select s = new Select(driver.findElement(By.xpath("//select[@id='ctl00_mainContent_DropDownListCurrency']")));
        s.selectByValue("USD");
//        Selecting CHECKBOX
        driver.findElement(By.cssSelector("input[id*='chk_friendsandfamily']")).click();
//        1. Click Search button using id attribute
        driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();
//        2. Click Search button using CSS selector (multiple ways of CSS selectors)
//        driver.findElement(By.cssSelector("#ctl00_mainContent_btn_FindFlights")).click();
//        driver.findElement(By.cssSelector("input[value='Search']")).click();
//        3. Click Search button using xpath selector
//        driver.findElement(By.xpath("//input[@value='Search']")).click();
//        4. Click Search button using name attribute
//        driver.findElement(By.name("ctl00$mainContent$btn_FindFlights")).click();

    }

}
