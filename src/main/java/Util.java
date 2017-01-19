import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by Roledene on 1/11/2017.
 */
public class Util {
    WebDriver driver;
    public Util(){

    }

    WebDriver initWebDriver(String _driver, String location){
        System.setProperty(_driver,location);
        driver = new ChromeDriver();
        return driver;
    }

    void go(String url){
        driver.navigate().to(url);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    WebElement getWebElement(String xpath){
        return driver.findElement(By.xpath(xpath));
    }

    WebElement find(String xpath){
        return driver.findElement(By.xpath(xpath));
    }
}
