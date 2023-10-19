package pages;

import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AutoPage {


    public AutoPage() {
        PageFactory.initElements(Driver.getDriver(),this);    }
}
