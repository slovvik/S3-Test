import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static org.junit.Assert.assertTrue;

/**
 * Created by Bartek-PC on 13.11.2016.
 */
public class CareersFindPage extends PageObject {

    @FindBy(id = "search-jobs")
    private WebElement searchJobs;

    @FindBy(xpath = "//button[contains(text(),'Search')]")
    private WebElement searchButton;

    public CareersFindPage(WebDriver driver) {
        super(driver);
        assertTrue(searchJobs.isDisplayed());
        assertTrue(searchButton.isDisplayed());
    }

    public void enterSearchJob(String job) {
        searchJobs.sendKeys(job);
    }

    public AvailableJobsPage searchJob() {
        searchButton.click();
        return new AvailableJobsPage(driver);
    }
}
