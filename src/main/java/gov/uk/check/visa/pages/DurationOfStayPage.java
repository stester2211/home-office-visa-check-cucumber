package gov.uk.check.visa.pages;

import gov.uk.check.visa.utilities.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class DurationOfStayPage extends Utility
{
    //7.DurationOfStayPage - nextStepButton, lessThanSixMonths, moreThanSixMonths locators and create methods
    //  'void selectLengthOfStay(String moreOrLess)' (Note: use switch statement for select moreOrLess stay) and
    //  'void clickNextStepButton()'

    private static final Logger log = LogManager.getLogger(DurationOfStayPage.class.getName());
    @CacheLookup
    @FindBy(xpath = "//input[@id='response-0']")
    WebElement lessThanSixMonths;
    @CacheLookup
    @FindBy(xpath = "//input[@id='response-1']")
    WebElement moreThanSixMonths;
    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Continue')]")
    WebElement nextStepButton;

    public void selectLengthOfStay(String moreOrLess)
    {
        switch (moreOrLess)
        {
            case "lessThanSix":
                clickOnElement(lessThanSixMonths);
                break;
            case "moreThanSix":
                clickOnElement(moreThanSixMonths);
                break;
        }
        log.info("select the length of Stay"+ lessThanSixMonths.toString());
        log.info("select the length of Stay"+ moreThanSixMonths.toString());
    }
    public void clickNextStepButton()
    {
        clickOnElement(nextStepButton);
        log.info("click on the next step button"+ nextStepButton.toString());
    }

}
