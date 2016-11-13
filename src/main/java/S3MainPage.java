import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static org.junit.Assert.assertTrue;

/**
 * Created by Bartek-PC on 13.11.2016.
 */
public class S3MainPage extends PageObject {

    @FindBy(id = "menu-item-401")
    private WebElement careers;

    public S3MainPage(WebDriver driver) {
        super(driver);
        assertTrue(careers.isDisplayed());
    }

    public CareersFindPage findJob() {
        careers.click();
        return new CareersFindPage(driver);
    }
}
