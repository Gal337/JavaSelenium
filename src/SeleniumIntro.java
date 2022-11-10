import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebDriver;

public class SeleniumIntro {
    public static void main(String[] args) {

        // ChromeDriver.exe -> Chrome browser
//        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Java\\chromedriver_win32\\chromedriver.exe");

        // msedgedriver.exe -> Edge browser
        System.setProperty("webdriver.edge.driver","C:\\Program Files\\Java\\edgedriver_win64\\msedgedriver.exe");

        // geckodriver.exe -> Friefox browser
//        System.setProperty("webdriver.gecko.driver","C:\\Program Files\\Java\\geckodriver-v0.32.0-win64\\geckodriver.exe");

        // Invoke Chrome browser
        // Edge - EdgeDriver, Friefox - FirefoxDriver, etc...
//        ChromeDriver driver = new ChromeDriver();
        WebDriver driver = new EdgeDriver();
//        WebDriver driver = new FirefoxDriver();

        // Opens specific URL and shows title in console
        driver.get("https://rahulshettyacademy.com");
        System.out.println(driver.getTitle());
        driver.get("https://www.24ur.com/");

        // Navigate to previous URL or forward URL
        driver.navigate().back();
        driver.navigate().forward();




        // Fetch current URL in console
        System.out.println(driver.getCurrentUrl());

        // Fetching / printing page source if right click is disabled
//        System.out.println(driver.getPageSource());

        // Close current browser window *using single webpage*
//        driver.close();

        // Closes all browsers *using multiple tabs*
//        driver.quit();




    }
}
