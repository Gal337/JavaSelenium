import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.*;


public class PopUpWindows {
    public static void main(String[] args) throws InterruptedException {
//        Setting the path to Selenium driver
            System.setProperty("webdriver.gecko.driver", "C:\\Program Files\\Java\\geckodriver-v0.32.0-win64\\geckodriver.exe");
//        Setting variables
        WebDriver driver = new FirefoxDriver();
        String link = "https://rahulshettyacademy.com/AutomationPractice/";
        String name = "Gal";
//        Opening the URL automatically
        driver.get(link);
//        Maximizes the browser window
        driver.manage().window().maximize();
//        Sends string to specific web element
        driver.findElement(By.id("name")).sendKeys(name);
//        Looks for Alert button by xpath locator and clicks it
        driver.findElement(By.xpath("//input[@id='alertbtn']")).click();
        Thread.sleep(2000);
//        Grabs the text from pop-up alert window and returns the text in console
        System.out.println(driver.switchTo().alert().getText());
//        Implementing sleep so we can see if alert window gets dismissed by the next command
        Thread.sleep(2000);
//        Selenium Webdriver switches to pop-up alert window and clicks Ok / Accept
        driver.switchTo().alert().accept();
//        Looks for Confirm button by id attribute and clicks it
        Thread.sleep(2000);
        driver.findElement(By.id("confirmbtn")).click();
        System.out.println(driver.switchTo().alert().getText());
//        Clicks on Cancel button on pop-up alert window
        Thread.sleep(2000);
        driver.switchTo().alert().dismiss();



    }
}
