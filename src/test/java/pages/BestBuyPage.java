package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class BestBuyPage {

    public BestBuyPage() {PageFactory.initElements(Driver.getDriver(),this);    }

@FindBy ( xpath = "(//img[@class='logo'])[1]")
public WebElement logo;

    @FindBy (xpath = "//button[@lang='fr']")
    public WebElement franızcaLink;



}