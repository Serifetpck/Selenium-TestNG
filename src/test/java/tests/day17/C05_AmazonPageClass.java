package tests.day17;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import pages.AmazonPage;
import utilities.Driver;

public class C05_AmazonPageClass {
    @Test
    public void test01() {


        AmazonPage amazon = new AmazonPage();
        Driver.getDriver().get("https://amazon.com");
        amazon.aramaKutusu.sendKeys("nuttela", Keys.ENTER);
    }
}
