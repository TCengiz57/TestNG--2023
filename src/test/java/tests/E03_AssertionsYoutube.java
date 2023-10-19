package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.YoutubePage;
import utilities.ConfigReader;
import utilities.Driver;

public class E03_AssertionsYoutube {
    YoutubePage youtubePage;


    //2) https://www.youtube.com adresine gidin
    @Test
    public void assertions() {
        Driver.getDriver().get(ConfigReader.getProperty("youtubeUrl"));

    }

    //3) Aşağıdaki adları kullanarak 4 test metodu oluşturun
    //   ve gerekli testleri yapin
    //  ○ titleTest   => Sayfa başlığının “YouTube” oldugunu test edin
    @Test
        public void titleTest(){

        String expectedTitle=ConfigReader.getProperty("youtubeTitle");
        String actualTitle=Driver.getDriver().getTitle();
        Assert.assertEquals(actualTitle,expectedTitle);
    }
    //  ○ imageTest   => YouTube resminin görüntülendiğini (isDisplayed()) test edin

    @Test
    public void imageTest(){
        youtubePage=new YoutubePage();
        Assert.assertTrue(youtubePage.YoutubeLogo.isDisplayed());
    }
    //  ○ Search Box 'in erisilebilir oldugunu test edin (isEnabled())

    @Test
    public void searchBox(){
        youtubePage=new YoutubePage();
        Assert.assertTrue(youtubePage.SearchBox.isEnabled());
    }
    //  ○ wrongTitleTest => Sayfa basliginin “youtube” olmadigini dogrulayin

    @Test
    public void wrongTitleTest(){
        String wrongTitle=ConfigReader.getProperty("youtubeWrongTitle");
        String actualTitle=Driver.getDriver().getTitle();

        Assert.assertNotEquals(actualTitle,wrongTitle);

        Driver.closeDriver();

    }
}
