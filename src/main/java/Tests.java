import org.junit.Test;
import org.openqa.selenium.WebElement;

import java.util.List;

import static org.junit.Assert.assertTrue;

/**
 * Created by Bartek-PC on 13.11.2016.
 */
public class Tests extends DriverSetup {

    private static final String URL = "https://www.s3group.com";
    private static final String JOB = "Automation Test";

    @Test
    public void searchJobTest() {
        DriverSetup.driver.get(URL);


        S3MainPage mainPage = new S3MainPage(driver);
        CareersFindPage careersFindPage = mainPage.findJob();
        careersFindPage.enterSearchJob(JOB);
        AvailableJobsPage availableJobsPage = careersFindPage.searchJob();

        List<WebElement> availableJobs = availableJobsPage.getJobs();
        int availableJobsCounter = 0;
        System.out.println("\n");
        for (int i = 0; i < availableJobs.size(); i++) {
            if (availableJobs.get(i).getText().contains(JOB)) availableJobsCounter++;
        }

        assertTrue(availableJobsCounter > 0);

        System.out.println("Available jobs for : " + JOB + " = " + availableJobsCounter);
    }

}
