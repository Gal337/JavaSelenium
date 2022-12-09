import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

import java.util.List;
import java.util.stream.Collectors;

public class FilteringWebTableJavaStream {
    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver", "C:\\Program Files\\Java\\geckodriver-v0.32.0-win64\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        String link = "https://rahulshettyacademy.com/seleniumPractise/#/offers";

        driver.manage().window().maximize();
        driver.get(link);
//        Sending the text to search box
        driver.findElement(By.id("search-field")).sendKeys("mango");
//        Saving all items to list
        List<WebElement> items = driver.findElements(By.xpath("//tr/td[1]"));
//        Checking if entered text matches and collecting back the returned elements
        List<WebElement> filteredItems = items.stream().filter(i -> i.getText().contains("Mango")).collect(Collectors.toList());
        Assert.assertEquals(items.size(),filteredItems.size());

    }
}
