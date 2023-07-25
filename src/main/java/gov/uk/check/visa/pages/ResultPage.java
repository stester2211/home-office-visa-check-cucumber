package gov.uk.check.visa.pages;

import gov.uk.check.visa.utilities.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class ResultPage extends Utility
{
    //4.ResultPage - resultMessage locator and create methods 'String getResultMessage()'
    // and 'void confirmResultMessage(String expectedMessage)' (Note Use Assert.assertTrue)

    private static final Logger log = LogManager.getLogger(ResultPage.class.getName());
    @CacheLookup
    @FindBy(xpath = "//h2[contains(text(),'You will not need a visa to come to the UK')]")
    WebElement resultMessage;

    public String confirmResultMessage()
    {
        String result= getTextFromElement(resultMessage);
        log.info("confirm the result message"+ resultMessage.toString());
        return result;
    }

}
