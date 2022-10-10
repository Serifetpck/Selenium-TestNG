package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class YoutubePage {

   public YoutubePage(){
        PageFactory.initElements(Driver.getDriver(),this);

   }
//annotation denir
   @FindBy(xpath = "//input[@id='search']")
    public WebElement searhBox;

   @FindBy(xpath = "(//*[@id='logo-icon'])[1]")
    public WebElement imageTest;


}
