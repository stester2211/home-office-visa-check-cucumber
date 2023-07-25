package gov.uk.check.visa;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import gov.uk.check.visa.propertyreader.PropertyReader;
import gov.uk.check.visa.utilities.Utility;


public class Hooks extends Utility
{
    @Before
    public void setUp()
    {
        selectBrowser(PropertyReader.getInstance().getProperty("browser"));
    }
    @After
    public void tearDown()
    {
        closeBrowser();
    }
}
