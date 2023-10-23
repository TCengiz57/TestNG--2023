package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.FacebookPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;


@Test
public class E05_RadioButton_Face {
    /*
    a. Verilen web sayfasına gidin.
https://facebook.com
b. Cookies’i kabul edin
c. Create an account buton’una basin
d. Radio button elementlerini locate edin ve size uygun olani secin
e. Sectiginiz radio button’un seçili, ötekilerin seçili olmadigini test edin
  */

    public void RadioButtonTest(){
        Driver.getDriver().get(ConfigReader.getProperty("faceUrl"));
        FacebookPage facePage=new FacebookPage();

        facePage.hesapOlustur.click();
        facePage.maleRadioB.click();
        ReusableMethods.bekle(2);

        Assert.assertTrue(facePage.maleRadioB.isSelected()
                &&!facePage.femaleRadioB.isSelected()
                &&!facePage.customRadioB.isSelected());
        Driver.closeDriver();
    }
}
