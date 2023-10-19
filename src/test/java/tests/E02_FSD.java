package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ForumShiftDeletePage;
import utilities.ConfigReader;
import utilities.Driver;

import java.util.Set;

public class E02_FSD {
            // TASK03:

          @Test
    public void forumShiftDelete(){

              // 1- https://forum.shiftdelete.net/ adresine gidin.

              Driver.getDriver().get(ConfigReader.getProperty("forumShiftDelete"));
              // 2- Youtube videosunun ortasındaki play logosuna tıklayın.
              ForumShiftDeletePage forumShiftDeletePage=new ForumShiftDeletePage();
              Driver.getDriver().switchTo().frame(forumShiftDeletePage.YoutubeIframe);
              forumShiftDeletePage.paylasButonu.click();

              //3- videoda sağ alttaki youtube logosuna tıklayın.
              forumShiftDeletePage.YoutubeButonu.click();
              // 4- Yeni sayfa açıldığını test edin

              String fsdWhn=Driver.getDriver().getWindowHandle();

              Set<String> whdSeti = Driver.getDriver().getWindowHandles();

              String youtubeWhd="";

              for (String each: whdSeti
              ) {
                  if (!each.equals(fsdWhn)){
                      youtubeWhd = each;
                  }
              }
              Driver.getDriver().switchTo().window(youtubeWhd);
              forumShiftDeletePage.Duraklat.click();

              String expectedUrl="https://www.youtube.com/watch?v=T9Lo7SNXEL8";
              String actualUrl=Driver.getDriver().getCurrentUrl();

              Assert.assertEquals(actualUrl,expectedUrl);

              //5- İlk Sayfaya dönerek bu sayfada arama kutusunun görünür olduğunu test edin.
              Driver.getDriver().switchTo().window(fsdWhn);
              forumShiftDeletePage.AraButonu.isDisplayed();


            Driver.closeDriver();




          }

}
