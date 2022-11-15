import com.beust.ah.A;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class TableGridsExample {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.gecko.driver", "C:\\Program Files\\Java\\geckodriver-v0.32.0-win64\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        String link = "https://rahulshettyacademy.com/AutomationPractice/";
        String link2 = "https://www.cricbuzz.com/live-cricket-scorecard/57573/nep-vs-uae-1st-odi-united-arab-emirates-tour-of-nepal-2022";
        int sum = 0;

        driver.manage().window().maximize();
        driver.get(link2);

        WebElement table = driver.findElement(By.cssSelector("div[class='cb-col cb-col-100 cb-ltst-wgt-hdr']"));
        int rowcount = table.findElements(By.cssSelector("cb-col cb-col-100 cb-scrd-itms")).size();
        int count = table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).size();

        for (int i = 0; i < count-2; i++){
            String value = table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).get(i).getText();
            int valueInteger = Integer.parseInt(value);
            sum = sum + valueInteger;
        }
        String Extras = driver.findElement(By.xpath("//div[text()='Extras']/following-sibling::div")).getText();
        int extrasValue = Integer.parseInt(Extras);
        int TotalSumValue = sum + extrasValue;
        System.out.println(TotalSumValue);

        String ActualTotal = driver.findElement(By.xpath("//div[text()='Total']/following-sibling:::div")).getText();
        int ActualTotalValue = Integer.parseInt(ActualTotal);
        if (ActualTotalValue == TotalSumValue) {
            System.out.println("Count matches.");
        }
        else {
            System.out.println("Count failed.");
        }

//        WebElement table = driver.findElement(By.xpath("/html/body/div[3]/div[2]/fieldset[2]/div[1]/table/thead/tr/th[4]"));
//        int rowcount = table.findElements(By.xpath("/html/body/div[3]/div[2]/fieldset[2]/div[1]/table/tbody/tr[3]/td[4]")).size();
//        int count = table.findElements(By.xpath("/html/body/div[3]/div[2]/fieldset[2]/div[1]/table/tbody/tr[9]/td[4]")).size();
//
//        for (int i = 0; i < count; i++) {
//            System.out.println(table.findElements(By.xpath("/html/body/div[3]/div[2]/fieldset[2]/div[1]/table/tbody/tr/td")).get(i).getText());
//        }



    }
}
