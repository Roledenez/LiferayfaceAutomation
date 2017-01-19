import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

/**
 * Created by Roledene on 1/11/2017.
 */
public class SenarioOneTest {

    @Test
    public void testingLiferayFace(){
        Util util = new Util();
        WebDriver webDriver = util.initWebDriver("webdriver.chrome.driver","C:\\Users\\Roledene\\Downloads\\Compressed\\chromedriver_win32\\chromedriver.exe");

        Assert.assertNotNull(webDriver);

        util.go("http://liferayfaces.org");
        Assert.assertEquals("http://liferayfaces.org","http://liferayfaces.org");
        util.find("//*[@id=\"_1_WAR_comliferayfacessitearchetypeportlet_:j_idt3:liferayVersion\"]/option[2]").click();
        Assert.assertEquals("Liferay Portal","Liferay Portal");


    }
}