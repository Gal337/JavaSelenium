import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;

public class HandlingCalendar {
    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver", "C:\\Program Files\\Java\\geckodriver-v0.32.0-win64\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        String link = "https://rahulshettyacademy.com/dropdownsPractise/";

        driver.manage().window().maximize();
        driver.get(link);
//        Opening the calendar
        driver.findElement(By.xpath("//input[@id='ctl00_mainContent_view_date1']")).click();
//        Searching for specific month and iterating through months
        while (!driver.findElement(By.className("ui-datepicker-title")).getText().contains("March")){
            driver.findElement(By.className("ui-datepicker-next")).click();
        }
        //        Saving days to list, variable dates
        List<WebElement> dates = driver.findElements(By.className("ui-state-default"));
//        Saving number of days to variable count by grabbing common attribute, putting it into list and iterate
        int count = driver.findElements(By.className("ui-state-default")).size();
//        Iterating through days to specific day we want to choose
        for (int i = 0; i < count; i++) {
            String days = driver.findElements(By.className("ui-state-default")).get(i).getText();
//            Checking if the day matches our chosen day and when it does it gets clicked
            if (days.equalsIgnoreCase("17")) {
                driver.findElements(By.className("ui-state-default")).get(i).click();
                break;
            }
        }
    }
}
