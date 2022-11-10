import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.Iterator;
import java.util.Set;

public class MultipleWindowsTest {
    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver", "C:\\Program Files\\Java\\geckodriver-v0.32.0-win64\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        String link = "https://accounts.google.com/signup";

        driver.manage().window().maximize();
        driver.get(link);
//        Opening the link and clicking Help button, so that new tab gets opened
        driver.findElement(By.xpath("html/body/div[1]/div[1]/footer/ul/li[1]/a")).click();
//        Checking if we get the parent tab webpage title or child tab webpage title
//        Selenium by default always gives title of parent tab webpage
        System.out.println(driver.getTitle());
//        Getting multiple window IDs
        Set<String> ids = driver.getWindowHandles();
//        Traversing / iterating through window IDs with the help of iterator
        Iterator<String> id = ids.iterator();
        String parentid = id.next();
        String childid = id.next();
//        Switching to other tab / window from parent window
        driver.switchTo().window(childid);
        System.out.println(driver.getTitle());
//        Switching back to parent tab
        driver.switchTo().window(parentid);
        System.out.println(driver.getTitle());
    }
}
