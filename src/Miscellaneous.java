import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

public class Miscellaneous {
    public static void main(String[] args) throws IOException {
        System.setProperty("webdriver.gecko.driver", "C:\\Program Files\\Java\\geckodriver-v0.32.0-win64\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        String link = "www.google.com";

        driver.manage().window().maximize();
//        Deleting cookies or single cookie
        driver.manage().deleteAllCookies();
//        driver.manage().deleteCookieNamed("sessionKey");

        driver.get(link);

//        Capturing screenshot, declaring variable to save screenshot to
        File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//        Command to save the screenshot from variable to specified hard drive location
        FileUtils.copyFile(src, new File("C://screenshot.png"));
    }
}
