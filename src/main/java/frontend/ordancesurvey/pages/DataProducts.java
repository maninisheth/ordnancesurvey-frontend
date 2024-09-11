package frontend.ordancesurvey.pages;

import frontend.ordancesurvey.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class DataProducts extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class);


    @CacheLookup
   // @FindBy(xpath = "//header/div[2]/div[2]/nav[1]/div[1]")
            @FindBy(xpath="//a[contains(text(),'Our data products')]")
    WebElement ourdata;

    public void selectOurDataProducts(){
      mouseHoverToElementAndClick(ourdata);
        log.info("select our data product"+ourdata.toString());
    }

    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'Data Products')]")
    WebElement dataproductBreadCrumb;

    public void verifyDataProduct(){
        String expected = "Data Products";
        String actual = dataproductBreadCrumb.getText();
        Assert.assertEquals(expected,actual,"user is not nevigate on data product ");
    }


}
