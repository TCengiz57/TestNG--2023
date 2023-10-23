package tests;

import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ZeroAppPage;
import utilities.ConfigReader;
import utilities.Driver;

public class E06_Handle_Dropdown {
    /*
    1. http://zero.webappsecurity.com/ Adresine gidin
2. Sign in butonuna basin
3. Login kutusuna “username” yazin
4. Password kutusuna “password.” yazin
5. Sign in tusuna basin

  ONLINE BANKING sayfasina gidin
6. Pay Bills sayfasina gidin
7. “Purchase Foreign Currency” tusuna basin
8. “Currency” drop down menusunden Eurozone’u secin
9. “amount” kutusuna bir sayi girin
10. “US Dollars” in secilmedigini test edin
11. “Selected currency” butonunu secin
12. “Calculate Costs” butonuna basin sonra “purchase” butonuna basin
13. “Foreign currency cash was successfully purchased.” yazisinin ciktigini
kontrol edin.
     */
@Test
    public void DropdownTest(){

        Driver.getDriver().get(ConfigReader.getProperty("zerowebUrl"));
        ZeroAppPage zeroWebPage=new ZeroAppPage();

        zeroWebPage.signinButton.click();
        zeroWebPage.login.sendKeys(ConfigReader.getProperty("zeroUsername"));
        zeroWebPage.Password.sendKeys(ConfigReader.getProperty("zeroPassword"));
        zeroWebPage.signinButton2.click();
        Driver.getDriver().navigate().back();
        zeroWebPage.onlyBankingButtonu.click();
        zeroWebPage.payBill.click();
        zeroWebPage.pfc.click();


    Select select=new Select(zeroWebPage.currencyDropdown);

    select.selectByValue("EUR");

    zeroWebPage.amount.sendKeys(ConfigReader.getProperty("amountNumber"));
    Assert.assertTrue(!zeroWebPage.USDolar.isSelected());

    zeroWebPage.SelectedCurrency.click();
    zeroWebPage.calculate.click();
    zeroWebPage.purchase.click();

    Assert.assertTrue(zeroWebPage.sonucYazi.isDisplayed());

    Driver.closeDriver();



    }
}
