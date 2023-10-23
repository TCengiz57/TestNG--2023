package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class FacebookPage {


    public FacebookPage() {PageFactory.initElements(Driver.getDriver(),this);    }

    @FindBy(xpath = "//a[@data-testid='open-registration-form-button']")
    public WebElement hesapOlustur;

    @FindBy (xpath = ("(//input[@class='_8esa'])[1]"))
            public WebElement femaleRadioB;

    @FindBy (xpath = ("(//input[@class='_8esa'])[2]"))
    public WebElement maleRadioB;

    @FindBy (xpath = ("(//input[@class='_8esa'])[3]"))
    public WebElement customRadioB;

}
