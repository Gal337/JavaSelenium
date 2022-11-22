import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.awt.*;

public class TableSortingJavaStream {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.gecko.driver", "C:\\Program Files\\Java\\geckodriver-v0.32.0-win64\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        String link = "https://rahulshettyacademy.com/seleniumPractise/#/offers";

        driver.manage().window().maximize();
        driver.get(link);
//        Click on the column for items to get sorted
        driver.findElement(By.xpath("//tr/th[1]")).click();
//        Capturing text of all webelements into list
        List<WebElement> items = driver.findElements(By.xpath("//tr/td[1]"));
//        Printing the text of webelements into new list
        List<String> ogList =  items.stream().map(i -> i.getText()).collect(Collectors.toList());
//        Sorting the list of webelements
        List<String> soList = ogList.stream().sorted().collect(Collectors.toList());
//        Comparing original list to sorted list
        Assert.assertTrue(ogList.equals(soList));
//        Scan the name column with getText -> example: Rice -> print the price of the Rice
        List<String> price = items.stream().filter(i -> i.getText().contains("Banana")).map(i -> getPriceVeggie(i)).collect(Collectors.toList());
        price.forEach(i -> System.out.println(i));

    }

//    Custom method to retrieve the price
    private static String getPriceVeggie(WebElement i) {
        String pValue = i.findElement(By.xpath("following-sibling::td[1]")).getText();
        return pValue;
    }
}
