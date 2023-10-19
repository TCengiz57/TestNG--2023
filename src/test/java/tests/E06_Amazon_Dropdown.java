package tests;

import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class E06_Amazon_Dropdown {


    //"https://www.amazon.com" adresine git

    // 1.adim : dropdown webelementini locate et

    // 2.adim locate ettigimiz webelementi parametre olarak yazip select objesi olustur

    // 3.adim select objesi ile istenen islemi yap

        @Test
        public void amazonDropdownTest(){
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));

        AmazonPage amazonPage=new AmazonPage();


        Select select=new Select(amazonPage.AllDropdown);

            select.selectByVisibleText("Computers");
            ReusableMethods.bekle(3);




        Driver.closeDriver();

}

}
