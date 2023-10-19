package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ZeroWebPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class E17_ZeroWeb_Dropdown {

      /*1. http://zero.webappsecurity.com sayfasina gidin
        2. Signin buttonuna tiklayin
        3. Login alanine “username” yazdirin
        4. Password alanina “password” yazdirin
        5. Sign in buttonuna tiklayin
        6. Back tusu ile sayfaya donun
        7. Online Banking menusunden Pay Bills sayfasina gidin
        8. amount kismina yatirmak istediginiz herhangi bir miktari yazin
        9. tarih kismina “2020-09-10” yazdirin
        10. Pay buttonuna tiklayin
        11. “The payment was successfully submitted.” mesajinin
        ciktigini test edin
*/
    @Test
    public void ZeroWebDropdownTesti(){
        Driver.getDriver().get(ConfigReader.getProperty("zerowebUrl"));
        ZeroWebPage zeroWebPage=new ZeroWebPage();

        zeroWebPage.signinButton.click();
        zeroWebPage.login.sendKeys(ConfigReader.getProperty("zeroUsername"));
        zeroWebPage.Password.sendKeys(ConfigReader.getProperty("zeroPassword"));
        zeroWebPage.signinButton2.click();
        Driver.getDriver().navigate().back();

        zeroWebPage.onlyBankingButtonu.click();
        zeroWebPage.payBill.click();
        zeroWebPage.pspAmount.sendKeys(ConfigReader.getProperty("amountNumber"));
        zeroWebPage.Date.sendKeys(ConfigReader.getProperty("zeroDate"));
        zeroWebPage.payButonu.click();

       Assert.assertTrue(zeroWebPage.pspSonucYazisi.isDisplayed());
       ReusableMethods.bekle(2);

       Driver.closeDriver();



    }

}

