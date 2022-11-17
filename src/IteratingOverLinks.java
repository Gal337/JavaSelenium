import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.ProtocolException;
import java.net.URL;
import java.util.List;

public class IteratingOverLinks {
    public static void main(String[] args) throws IOException {
        System.setProperty("webdriver.gecko.driver", "C:\\Program Files\\Java\\geckodriver-v0.32.0-win64\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        String link1 = "https://rahulshettyacademy.com/AutomationPractice/";

        driver.manage().window().maximize();
        driver.get(link1);
//        Storing all the links from footer to a list variable
        List<WebElement> links = driver.findElements(By.cssSelector("li[class='gf-li'] a"));
//        Implementing SOFT assertion
        SoftAssert a = new SoftAssert();
//        Iterating through list of links with enhanced for loop
        for (WebElement link : links) {
            String url = link.getAttribute("href");
//        Opening connection to retrieve server response code
            HttpURLConnection connection = (HttpURLConnection)new URL(url).openConnection();
            connection.setRequestMethod("HEAD");
            connection.connect();
            int respCode = connection.getResponseCode();
            System.out.println(respCode);
            a.assertTrue(respCode < 400,"The link with text " + link.getText() + " is broken. Code: " + respCode);
//            ====================================================================================================
//            If server response code is higher than 400 the test fails
//            if (respCode > 400) {
//                System.out.println("The link with text " + link.getText() + " is broken. Code: " + respCode);
//                HARD assertion - stops the test
//                Assert.assertTrue(false);
            }
//            ====================================================================================================
//        assertAll is used to report the problems
        a.assertAll();

        }

    }
