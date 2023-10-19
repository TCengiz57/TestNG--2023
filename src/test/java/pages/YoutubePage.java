package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class YoutubePage {
    public YoutubePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy (xpath = "(//a[@id='logo'])[1]")
    public WebElement YoutubeLogo;

    @FindBy (xpath = "//input[@id='search']")
    public  WebElement SearchBox;
}

