package AutomationDemo;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class SoundPlayer
{
    public static void playSound(String artist, String title) throws InterruptedException
    {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com/");
        driver.manage().window().maximize();
        WebElement search = driver.findElement(By.xpath(PageElements.search));

        Thread.sleep(1000);
        search.sendKeys((artist +" "+title));
        Thread.sleep(1000);
        search.sendKeys(Keys.ENTER);
        Thread.sleep(3000);

        driver.findElement(By.xpath(PageElements.firstSearchResult)).click();
        Thread.sleep(50000);
        driver.quit();
    }
}
