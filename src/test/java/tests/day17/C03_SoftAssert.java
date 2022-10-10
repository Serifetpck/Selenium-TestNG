package tests.day17;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import utilities.TestBaseBeforeMethodAfterMethod;

public class C03_SoftAssert extends TestBaseBeforeMethodAfterMethod {

    //sadece Assert.asert... kullanırsak hata bulduğu an çalışmayı durdurur ve sadece o hatayı rapor eder
    //ama Softassertion farklı çalısır.
    //Not;Assert.assertTrue Assert bir classtır çünkü büyük harfle başlar Assert calısından direk nokta yazıp
    //assertTrue gibi methodları çağırıyorsak bu methodlar statictir
    //Softassertion baslangıc ve bitis satırları arasındaki tum assertionlari bitis satırına geldiğinde bize bulduğu
    //tum hataları rapor eder
    //Softassertion methodlarına ulaşmak için obje olusturmamız gereklidir çünkü statik değil.daha sonra o obje üzerinden
    //methodlara gidilir

    @Test
    public void test01() {

        SoftAssert softAssert = new SoftAssert();
        //1-amazon anasayfaya gidin
        driver.get("https://amazon.com");
        //2-title in Amazon içerdigini test edin
        softAssert.assertTrue(driver.getTitle().contains("Amazon"), "Girdiğiniz kelimeyi içermiyor");
        //3-arama kutusnun erişilebilir oldugunu tets edin
        WebElement aramaKutusu = driver.findElement(By.id("twotabsearchtextbox"));
        softAssert.assertTrue(aramaKutusu.isEnabled(), "WE erişilemez");
        //4-arama kutusuna Nuella yazıp aratın
        aramaKutusu.sendKeys("Nutella", Keys.ENTER);
        //5-arama yapıldıgını test edin
        WebElement sonuc = driver.findElement(By.xpath("//*[@class='a-section a-spacing-small a-spacing-top-small']"));
        softAssert.assertTrue(sonuc.isDisplayed(), "SonucWE görüntülenemedi");
        //6-arama sonucunun Nutella içerdigini test edin
        softAssert.assertTrue(sonuc.getText().contains("Nutella"), "Nutella içermiyor");


        //SoftAssert'e bitis satırını soylemek için assertAll() kullanılır.
        //bu satır yazılmazsa assertion gorevi yapılmamıs olur

        //Eger assertAlldan sonra faıl rapor edilirse assertalldan sonraki kodlar calısmaz

         softAssert.assertAll();
        System.out.println("assertion'lardan fail olan olursa burası çalışmaz");
    }
}
