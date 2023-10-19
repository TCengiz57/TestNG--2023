package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AmazonPage {
    public AmazonPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy (xpath = "//select[@title='Search in']")
    public WebElement AllDropdown;

    @FindBy (id = "twotabsearchtextbox")
    public WebElement SearchBox;
}
