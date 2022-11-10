import graphql.relay.Edge;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;


public class SeleniumTutorials {

    public static void main(String[] args) {

        System.setProperty("webdriver.edge.driver","C:\\Program Files\\Java\\edgedriver_win64\\msedgedriver.exe");
//        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Java\\chromedriver_win32\\chromedriver.exe");

        WebDriver driver = new EdgeDriver();
        String link = "https://rahulshettyacademy.com/";

        driver.manage().window().maximize();

        driver.get(link);
        driver.findElement(By.linkText("Practice")).click();
        driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Malbik Endar");
        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("destined19876@gmail.com");
        driver.findElement(By.cssSelector("button[id='form-submit']")).click();

        WebElement firstResult = new WebDriverWait(driver, Duration.ofSeconds(5)).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='project-container']/div/div[1]/a[1]")));
//        WebElement secondResult = new WebDriverWait(driver, Duration.ofSeconds(5)).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='project-container']/div/div[1]/a[2]")));
//        WebElement thirdResult = new WebDriverWait(driver, Duration.ofSeconds(5)).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='project-container']/div/div[1]/a[3]")));

        driver.findElement(By.xpath("//*[@id='project-container']/div/div[1]/a[1]")).click();
        driver.navigate().back();
        driver.findElement(By.xpath("//*[@id='project-container']/div/div[1]/a[2]")).click();
        driver.navigate().back();
        driver.findElement(By.xpath("//*[@id='project-container']/div/div[1]/a[3]")).click();
        driver.navigate().back();


    }

}
