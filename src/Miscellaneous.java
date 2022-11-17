import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.time.Duration;

public class Miscellaneous {
    public static void main(String[] args) throws IOException {
//        System.setProperty("webdriver.edge.driver","C:\\Program Files\\Java\\edgedriver_win64\\msedgedriver.exe");
//        WebDriver driver = new EdgeDriver();
        System.setProperty("webdriver.gecko.driver", "C:\\Program Files\\Java\\geckodriver-v0.32.0-win64\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        String link = "https://rahulshettyacademy.com/AutomationPractice/";

        driver.manage().window().maximize();
//        Deleting cookies or single cookie
//        driver.manage().deleteAllCookies();
//        driver.manage().deleteCookieNamed("sessionKey");

        driver.get(link);

//        ==================================================================
//        Capturing screenshot, declaring variable to save screenshot to
//        ==================================================================
//        File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//        Command to save the screenshot from variable to specified folder on hard drive
//        FileUtils.copyFile(src, new File("C:\\Users\\user\\Documents\\screenshot.png"));

//        ====================================================================================
//        Using Java method (openConnection) to call URL and getting the server response code
//        ====================================================================================
//        String url = driver.findElement(By.cssSelector("a[href*='soapui']")).getAttribute("href");
        String url = driver.findElement(By.cssSelector("a[href*='brokenlink']")).getAttribute("href");
//        Opening connection to retrieve server response code
        HttpURLConnection connection = (HttpURLConnection) new URL(url).openConnection();
        connection.setRequestMethod("HEAD");
        connection.connect();
        int respCode = connection.getResponseCode();
        System.out.println(respCode);





    }
}
