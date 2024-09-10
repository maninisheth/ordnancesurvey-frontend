package frontend.ordancesurvey.pages;

import frontend.ordancesurvey.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class DataProducts extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class);


    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Our data products')]")
    WebElement ourdata;

    public void selectOurDataProducts(){
        selectByIndexFromDropDown(ourdata,1);
        log.info("select our data product"+ourdata.toString());
    }


}
