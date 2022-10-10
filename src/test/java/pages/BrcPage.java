package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class BrcPage {
    public BrcPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy (xpath = "//*[@class='btn btn-primary btn-sm']")
    public WebElement brclogin;
    @FindBy(xpath = "//*[@name='email']")
    public WebElement brcmail;

    @FindBy(className = "btn btn-primary btn-sm")
    public WebElement ikinciLogin;


    @FindBy(xpath = "//*[@id='dropdown-basic-button']")
    public WebElement basariliGiris;
}