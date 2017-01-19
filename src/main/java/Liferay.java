import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

/**
 * Created by Roledene on 1/11/2017.
 */
public class Liferay {
    public static void main(String[] args) throws IOException, InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Roledene\\Downloads\\Compressed\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

//        System.setProperty("webdriver.ie.driver","C:\\Users\\Roledene\\Downloads\\Compressed\\IEDriverServer_Win32_3.0.0\\IEDriverServer.exe");
//        WebDriver driver = new InternetExplorerDriver();

//        System.setProperty("webdriver.gecko.driver","C:\\Users\\Roledene\\Downloads\\Compressed\\geckodriver-v0.13.0-win64\\geckodriver.exe");
//        DesiredCapabilities capabilities= DesiredCapabilities.firefox();
//        capabilities.setCapability("marionette", true);
//        WebDriver driver = new FirefoxDriver(capabilities);

        driver.navigate().to("http://liferayfaces.org");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
//        System.out.println("before div");




        WebElement ele = driver.findElement(By.xpath("//*[@id=\"portlet_1_WAR_comliferayfacessitearchetypeportlet\"]/div"));

        driver.findElement(By.xpath("//*[@id=\"_1_WAR_comliferayfacessitearchetypeportlet_:j_idt3:liferayVersion\"]/option[2]")).click();
        driver.findElement(By.xpath("//*[@id=\"_1_WAR_comliferayfacessitearchetypeportlet_:j_idt3:jsfVersion\"]/option[2]")).click();
        driver.findElement(By.xpath("//*[@id=\"_1_WAR_comliferayfacessitearchetypeportlet_:j_idt3:suite\"]/option[3]")).click();
        driver.findElement(By.xpath("//*[@id=\"_1_WAR_comliferayfacessitearchetypeportlet_:j_idt3:build\"]/option[2]")).click();

        //scroll to the element
        Actions actions = new Actions(driver);
        actions.moveToElement(ele);
// actions.click();
        actions.perform();

        File screenshot  = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        BufferedImage fullImg = ImageIO.read(screenshot);

        // Get the location of element on the page
        Point point = ele.getLocation();

        // Get width and height of the element
        int eleWidth = ele.getSize().getWidth();
        int eleHeight = ele.getSize().getHeight();

//        System.out.println(eleHeight);
//        System.out.println(eleWidth);
//        System.out.println(point.getY());
//        System.out.println(point.getX());
        // Crop the entire page screenshot to get only element screenshot
//        BufferedImage eleScreenshot= fullImg.getSubimage(point.getX(), point.getY(),
//                eleWidth, eleHeight);
//        ImageIO.write(eleScreenshot, "png", screenshot);

        File screenshotLocation = new File("C:\\Users\\Roledene\\Desktop\\droid project\\clustering\\Automation\\src\\main\\resources\\test_screenshot.png");
        FileUtils.copyFile(screenshot, screenshotLocation);

        driver.findElement(By.xpath("//*[@id=\"layout_2\"]/a")).click();
//        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//          driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
//        Thread.sleep(5000);
        WebDriverWait wait = new WebDriverWait(driver, 300);
        WebElement selectElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"_1_WAR_comliferayfacesdemoalloyshowcaseportlet_:j_idt8\"]/div[1]/div")));
//        WebElement selectElement2 = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"_1_WAR_comliferayfacesdemoalloyshowcaseportlet_:j_idt8\"]/div[1]/div")));
//        WebElement triggerDropDown = driver.findElement(By.xpath());


        String element = driver.findElement(By.xpath("//*[@id=\"_1_WAR_comliferayfacesdemoalloyshowcaseportlet_:j_idt8\"]/div[1]/div")).getText();
        System.out.println(element + "is visible");
        driver.findElement(By.xpath("//*[@id=\"_1_WAR_comliferayfacesdemoalloyshowcaseportlet_:j_idt8\"]/div[1]/div")).click();
        //sub links
//        driver.findElement(By.xpath("//*[@id=\"_1_WAR_comliferayfacesdemoalloyshowcaseportlet_:j_idt8:0:j_idt13\"]/li[1]/a")).click();
//        driver.navigate().back();
        Thread.sleep(1000);

        element = driver.findElement(By.xpath("//*[@id=\"_1_WAR_comliferayfacesdemoalloyshowcaseportlet_:j_idt8\"]/div[3]")).getText();
        System.out.println(element + "is visible");
        driver.findElement(By.xpath("//*[@id=\"_1_WAR_comliferayfacesdemoalloyshowcaseportlet_:j_idt8\"]/div[3]")).click();
        Thread.sleep(1000);

        element = driver.findElement(By.xpath("//*[@id=\"_1_WAR_comliferayfacesdemoalloyshowcaseportlet_:j_idt8\"]/div[5]/div")).getText();
        System.out.println(element + "is visible");
        driver.findElement(By.xpath("//*[@id=\"_1_WAR_comliferayfacesdemoalloyshowcaseportlet_:j_idt8\"]/div[5]/div")).click();
        Thread.sleep(1000);

        element = driver.findElement(By.xpath("//*[@id=\"_1_WAR_comliferayfacesdemoalloyshowcaseportlet_:j_idt8\"]/div[7]/div")).getText();
        System.out.println(element + "is visible");
        driver.findElement(By.xpath("//*[@id=\"_1_WAR_comliferayfacesdemoalloyshowcaseportlet_:j_idt8\"]/div[7]/div")).click();
        Thread.sleep(1000);

        element = driver.findElement(By.xpath("//*[@id=\"_1_WAR_comliferayfacesdemoalloyshowcaseportlet_:j_idt8\"]/div[9]/div")).getText();
        System.out.println(element + "is visible");
        driver.findElement(By.xpath("//*[@id=\"_1_WAR_comliferayfacesdemoalloyshowcaseportlet_:j_idt8\"]/div[9]/div")).click();
        Thread.sleep(1000);

        element = driver.findElement(By.xpath("//*[@id=\"_1_WAR_comliferayfacesdemoalloyshowcaseportlet_:j_idt8\"]/div[11]/div")).getText();
        System.out.println(element + "is visible");
        driver.findElement(By.xpath("//*[@id=\"_1_WAR_comliferayfacesdemoalloyshowcaseportlet_:j_idt8\"]/div[11]/div")).click();
        Thread.sleep(1000);

        //next page
        driver.findElement(By.xpath("//*[@id=\"layout_3\"]/a")).click();
        System.out.println("page JSF loaded");
        selectElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"_1_WAR_comliferayfacesdemojsfshowcaseportlet_:j_idt8\"]/div[1]/div[1]/a/span")));

        //next page
        driver.findElement(By.xpath("//*[@id=\"layout_4\"]/a")).click();
        selectElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"_1_WAR_comliferayfacesdemoportalshowcaseportlet_:j_idt8\"]/div[1]/div[1]/a/span")));
        System.out.println("page Portal loaded");

        driver.navigate().to("http://liferayfaces.org");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);


        driver.findElement(By.xpath("//*[@id=\"_com_liferay_portal_search_web_portlet_SearchPortlet_keywords\"]")).click();
        System.out.println("click works fine");
        driver.findElement(By.xpath("//*[@id=\"_com_liferay_portal_search_web_portlet_SearchPortlet_keywords\"]")).clear();
        driver.findElement(By.xpath("//*[@id=\"_com_liferay_portal_search_web_portlet_SearchPortlet_keywords\"]")).sendKeys("faces");
        System.out.println("keys are send");
        driver.findElement(By.xpath("//*[@id=\"_com_liferay_portal_search_web_portlet_SearchPortlet_rjus__null__null\"]")).click();


        driver.findElement(By.xpath("//*[@id=\"p_p_id_com_liferay_product_navigation_user_personal_bar_web_portlet_ProductNavigationUserPersonalBarPortlet_\"]/span/a")).click();
        selectElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"_com_liferay_login_web_portlet_LoginPortlet_login\"]")));

        driver.findElement(By.xpath("//*[@id=\"_com_liferay_login_web_portlet_LoginPortlet_login\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"_com_liferay_login_web_portlet_LoginPortlet_login\"]")).clear();
        driver.findElement(By.xpath("//*[@id=\"_com_liferay_login_web_portlet_LoginPortlet_login\"]")).sendKeys("test@email.com");

        driver.findElement(By.xpath("//*[@id=\"_com_liferay_login_web_portlet_LoginPortlet_password\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"_com_liferay_login_web_portlet_LoginPortlet_password\"]")).clear();
        driver.findElement(By.xpath("//*[@id=\"_com_liferay_login_web_portlet_LoginPortlet_password\"]")).sendKeys("PASSWORD");

//        selectElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"_com_liferay_login_web_portlet_LoginPortlet_mspp\"]")));
//        driver.findElement(By.xpath("//*[@id=\"_com_liferay_login_web_portlet_LoginPortlet_mspp\"]")).click();


//        driver.findElement(By.xpath("//*[@id=\"_1_WAR_comliferayfacesdemoalloyshowcaseportlet_:j_idt8\"]/div[1]/div")).click();





    }
}
