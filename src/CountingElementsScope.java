import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

import java.util.Iterator;
import java.util.Set;

public class CountingElementsScope {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.gecko.driver", "C:\\Program Files\\Java\\geckodriver-v0.32.0-win64\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        String link = "https://www.rahulshettyacademy.com/AutomationPractice";
        driver.manage().window().maximize();
        driver.get(link);
//        Gives the count of the links on the page (normally includes tag a in tagName)
        System.out.println(driver.findElements(By.tagName("a")).size());
//        Declaring footer variable and limiting the scope of WebDriver so it only gives the link that are in footer
        WebElement footerdriver = driver.findElement(By.id("gf-BIG"));
        System.out.println(footerdriver.findElements(By.tagName("a")).size());
//        Declaring column driver and listing links from first column in the footer
        WebElement columndriver = footerdriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
        System.out.println(columndriver.findElements(By.tagName("a")).size());
//        Clicking on each link in the first footer column and opening them in tabs
        for (int i = 1; i < columndriver.findElements(By.tagName("a")).size(); i++) {
            String openTab = Keys.chord(Keys.CONTROL, Keys.ENTER);
            columndriver.findElements(By.tagName("a")).get(i).sendKeys(openTab);
            Thread.sleep(5000);
        }
//        Saving tabs to index and then returns the title of the tab from each index
        Set<String> tabs = driver.getWindowHandles();
        Iterator<String> tab = tabs.iterator();
        while (tab.hasNext()) {
            driver.switchTo().window(tab.next());
            System.out.println(driver.getTitle());
            }

    }
}
