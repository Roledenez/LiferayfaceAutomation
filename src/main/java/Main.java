import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by Roledene on 12/11/2016.
 */
public class Main {
    public static void main(String[] args){
//        System.setProperty("webdriver.chrome.driver","C:/Program Files (x86)/Google/Chrome/Application/chrome.exe");
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Roledene\\Downloads\\Compressed\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.navigate().to("http://mail.google.com");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        driver.findElement(By.cssSelector("#Email")).sendKeys("roledene99x@gmail.com");
        driver.findElement(By.cssSelector("#next")).click();
//        driver.findElement(By.cssSelector("#PersistentCookie"))
//        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);

        driver.findElement(By.cssSelector("#Passwd")).sendKeys("Password@#123");
        driver.findElement(By.cssSelector("#signIn")).click();

        //inside the mail box
//        Boolean isPresent = driver.findElements(By.xpath("//*[@id=\":fs\"]/div/div")).size() > 0;
//        if(!isPresent)
//            isPresent = driver.findElements(By.xpath("*[@id=\":g1\"]/div/div")).size() > 0;

        //*[@id=":fs"]/div/div
        //*[@id=":g1"]/div/div
//        driver.findElement(By.xpath("//*[@id=\":g1\"]/div/div")).click();

        //*[@id=":g2"]/div/div

        driver.findElement(By.xpath("//*[@id=\":gb\"]/div/div")).click();
        //*[@id=":gb"]/div/div
        //*[@id=":gb"]/div/div
        // #\3a gb > div > div

        //*[@id=":gb"]/div/div
        // #\3a gb > div > div

        //*[@id=":gb"]/div/div

        driver.findElement(By.xpath("//*[@id=\":lq\"]")).sendKeys("sroledenes@yahoo.com");
        //*[@id=":lq"]
        //*[@id=":lq"]
        // #\3a lk

        //*[@id=":l9"]/div


        driver.findElement(By.xpath("//*[@id=\":la\"]")).sendKeys("Automated Email For Testing");
        //*[@id=":la"]
        //*[@id=":lq"]
        // #\3a la

        driver.findElement(By.xpath("//*[@id=\":mg\"]")).sendKeys("Hi, This is an automated email sent to you for testing an automated application");
        //*[@id=":mg"]
        //*[@id=":mg"]
        // #\3a mg

        driver.findElement(By.xpath("//*[@id=\":l0\"]")).click();
        //*[@id=":l0"]
        //*[@id=":l0"]
        // #\3a l0




    }
}
