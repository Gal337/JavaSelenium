import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

public class InvokingMultipleWindows  {
    public static void main(String[] args) throws IOException {
//        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Java\\chromedriver_win32\\chromedriver.exe");
//        WebDriver driver = new ChromeDriver();

        System.setProperty("webdriver.gecko.driver", "C:\\Program Files\\Java\\geckodriver-v0.32.0-win64\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        String link = "https://rahulshettyacademy.com/angularpractice/";
        String link2 = "https://rahulshettyacademy.com/";

        driver.manage().window().maximize();
//        Opening the URL
        driver.get(link);
//        Opening new tab in the same browser and getting the ID's of tabs
        driver.switchTo().newWindow(WindowType.TAB);
        Set<String> handles = driver.getWindowHandles();
//        Iterating through tabs
        Iterator<String> it = handles.iterator();
//        Declaring parent and child tabs
        String parentWindowId = it.next();
        String childWindow = it.next();
//        Switching to new tab and opening new website
        driver.switchTo().window(childWindow);
        driver.get(link2);
//        Retrieving some info (course title) and copying from new tab and pasting it in original tab in specific window
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        String courseName = driver.findElements(By.cssSelector("a[href*='https://courses.rahulshettyacademy.com/p']")).get(5).getText();
        driver.switchTo().window(parentWindowId);
//        Saving web element to variable
        WebElement name = driver.findElement(By.cssSelector("[name='name']"));
        name.sendKeys(courseName);
//        Capturing screenshot of web element
        File file = name.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(file, new File("webElement.png"));
//        Getting the height and width of the screenshot
        System.out.println(name.getRect().getDimension().getHeight());
        System.out.println(name.getRect().getDimension().getWidth());
    }
}
