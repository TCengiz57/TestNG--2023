package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.BestBuyPage;
import utilities.ConfigReader;
import utilities.Driver;

public class E01_Assertions_BestBuy {
    /* 1) Bir class oluşturun: BestBuyAssertions
 2) https://www.bestbuy.com/ Adresine gidin farkli test method’lari olusturarak


     asagidaki testleri yapin
      ○ Sayfa URL’inin https://www.bestbuy.com/ ‘a esit oldugunu test edin
      ○ titleTest => Sayfa başlığının “Rest” içermediğini(contains) test edin
      ○ logoTest => BestBuy logosunun görüntülendigini test edin
      ○ FrancaisLinkTest => Fransizca Linkine basın

     */
    @Test

    public void bestBuyUrl() {

        Driver.getDriver().get(ConfigReader.getProperty("bestBuyUrl"));
        String expectedUrl = ConfigReader.getProperty("bestBuyUrl");
        String actualUrl = Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(actualUrl, expectedUrl);


    }

    @Test
    public void bestBuyTitle() {

        Driver.getDriver().get(ConfigReader.getProperty("bestBuyUrl"));
        String expectedIcerik = "Rest";
        String actualIcerik = Driver.getDriver().getTitle();
        Assert.assertFalse(actualIcerik.contains(expectedIcerik));


    }

    @Test
    public void bestBuyLogo() {

        Driver.getDriver().get(ConfigReader.getProperty("bestBuyUrl"));

        BestBuyPage bestBuyPage = new BestBuyPage();
        bestBuyPage.logo.isDisplayed();



    }
    @Test
    public void bestBuyLink() {

        Driver.getDriver().get(ConfigReader.getProperty("bestBuyUrl"));

        BestBuyPage bestBuyPage = new BestBuyPage();
        bestBuyPage.franızcaLink.click();

        Driver.closeDriver();

    }

}

