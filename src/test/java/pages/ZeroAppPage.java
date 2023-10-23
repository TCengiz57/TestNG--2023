package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class ZeroAppPage {
    public ZeroAppPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath= "(//button[normalize-space()='Signin'])[1]")
    public WebElement signinButton;

    @FindBy (xpath = "//input[@name='user_login']")
    public  WebElement login;

    @FindBy (xpath = "//input[@name='user_password']")
    public  WebElement Password;

    @FindBy(xpath = "//input[@class='btn btn-primary']")
    public  WebElement signinButton2;

    @FindBy (xpath = "//*[@id='onlineBankingMenu']")
    public WebElement onlyBankingButtonu;

    @FindBy (xpath = "//span[@id='pay_bills_link']")
    public WebElement payBill;

    @FindBy(linkText = "Purchase Foreign Currency")
    public WebElement pfc;

    @FindBy(id = "pc_currency")
    public WebElement currencyDropdown;

    @FindBy (xpath = "//input[@id='pc_amount']")
    public WebElement amount;

    @FindBy (xpath = "//input[@class='span1']")
    public  WebElement pspAmount;

    @FindBy (xpath = "//input[@id='pc_calculate_costs']")
    public WebElement USDolar;

    @FindBy (xpath = "(//input[@type='radio'])[2]")
    public WebElement SelectedCurrency;

    @FindBy (xpath = "//input[@id='pc_calculate_costs']")
    public  WebElement calculate;

    @FindBy (xpath = "//input[@id='purchase_cash']")
    public WebElement purchase;

    @FindBy (xpath = "//div[@id='alert_content']")
    public  WebElement sonucYazi;

    @FindBy (xpath = "//input[@id='sp_date']")
    public  WebElement Date;

    @FindBy (xpath = "//input[@type='submit']")
    public  WebElement payButonu;

    @FindBy (xpath = "//div[@class='alert alert-success hide']")
    public WebElement pspSonucYazisi;

}
