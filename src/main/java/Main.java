import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "D:\\webdriver\\chromedriver.exe");
        //interfejs je manje vise abstr klasa sa dosta praznim metoda koje se kasnije implementiraju
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.kupujemprodajem.com/");
        String title = driver.getTitle();
        String expected = "KupujemProdajem";
        if(title.equals(expected)){
            System.out.println("slaze se");
        }
        WebElement add = driver.findElement(By.xpath("//*[@id=\"bodyTag\"]/div[9]/div/div[2]"));
        add.click();
        WebElement el = driver.findElement(By.xpath("//*[@id=\"searchKeywordsInput\"]"));
        el.sendKeys("iphone 13");
        el.submit();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebElement el2 = driver.findElement(By.className("adName"));
        el2.click();
        driver.close();
    }
}
