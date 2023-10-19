package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class ForumShiftDeletePage {


    public ForumShiftDeletePage() {
        PageFactory.initElements(Driver.getDriver(), this);}

    @FindBy (xpath = "//iframe[@class='latestVideoEmbed']")
    public WebElement YoutubeIframe;

    @FindBy (xpath = "//button[@aria-label='Oynat']")
    public WebElement paylasButonu;
    @FindBy (xpath = "//a[@class='ytp-watermark yt-uix-sessionlink']")
    public  WebElement YoutubeButonu;

    @FindBy (xpath = "//button[@class='ytp-play-button ytp-button']")
    public WebElement Duraklat;

    @FindBy (xpath = "(//input[@placeholder='Ara...'])[1]")
    public WebElement AraButonu;



}
