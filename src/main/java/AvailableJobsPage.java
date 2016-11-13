import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.Iterator;
import java.util.List;

import static org.junit.Assert.assertTrue;

/**
 * Created by Bartek-PC on 13.11.2016.
 */
public class AvailableJobsPage extends PageObject {

    @FindBy(tagName = "tr")
    private List<WebElement> availableJobs;

    public AvailableJobsPage(WebDriver driver) {
        super(driver);
    }

    public List<WebElement> getJobs() {
        return availableJobs;
    }
}
