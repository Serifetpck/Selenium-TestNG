package tests.day16;

import org.testng.annotations.Test;
import utilities.TestBaseBeforeClassAfterClass;

public class C03_Priority extends TestBaseBeforeClassAfterClass {

    /*
 TestNG (default) olarak @Test methodlarıni alfabetik sıraya göre run eder. (Yukardan asagi degil!)
 priority annotation Testlere öncelik vermek için kullanılır.
Kucuk olan Numara daha once calisir priority yazmayan Test method'u varsa default olarak 0 dır ve o calisir,
sonra priority yazan testler siralanir.

 */
    @Test (priority = 1)
    public void youtubeTest() {
        driver.get("https://www.youtube.com");

    }

    @Test //Burayı 0 kabul eder bu yüzden ilk bu method çalışır
    public void bestbuyTesti() {
        driver.get("https://www.bestbuy.com");
    }

    @Test (priority = 2)
    public void amazonTesti() {
        driver.get("https://www.amazon.com");
    }


    @Test (priority = -1)
    public void hepsiburadaTesti() {
        driver.get("https://www.hepsiburada.com");
    }
}
