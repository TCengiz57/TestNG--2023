package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HerokuAppPage;
import utilities.ConfigReader;
import utilities.Driver;

public class E04_Checkbox_heroku {
    /* a. Verilen web sayfasına gidin.
     https://the-internet.herokuapp.com/checkboxes
     b. Checkbox1 ve checkbox2 elementlerini locate edin.
     c. Checkbox1 seçili değilse onay kutusunu tıklayın
     d. Checkbox2 seçili değilse onay kutusunu tıklayın
     e. Checkbox1ve Checkbox2’nin seçili olduğunu test edin

     */
    @Test
    public void CheckBox() {

        Driver.getDriver().get(ConfigReader.getProperty("ihoCheckboxUrl"));

        HerokuAppPage intherokuPage = new HerokuAppPage();

        if (!intherokuPage.checkbox1.isSelected()) {
            intherokuPage.checkbox1.click();
        }
        if (!intherokuPage.checkbox2.isSelected()) {
            intherokuPage.checkbox2.click();

            Assert.assertTrue(intherokuPage.checkbox1.isSelected() && intherokuPage.checkbox2.isSelected());


        }
        Driver.closeDriver();
    }
}
