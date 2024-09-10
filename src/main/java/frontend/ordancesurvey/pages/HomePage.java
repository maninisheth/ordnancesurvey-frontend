package frontend.ordancesurvey.pages;

import frontend.ordancesurvey.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class HomePage extends Utility {

    private static final Logger log = LogManager.getLogger(HomePage.class);

    @CacheLookup
    @FindBy(id = "ccc-notify-accept")
   WebElement cookies;

    public void clickOnCookie(){
       mouseHoverToElementAndClick(cookies);
       log.info("Click on cookies"+cookies.toString());
    }

    @CacheLookup
    @FindBy(id="radix-6-trigger-radix-0")
    WebElement dataproducts;

    public void clickOnDataProducts(){
      mouseHoverToElement(dataproducts);
        log.info("click on data products"+dataproducts.toString());
    }

}
