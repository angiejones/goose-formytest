package tests;

import org.testng.annotations.Test;
import pages.FormPage;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class FormTest extends BaseTest {

    @Test
    public void testFormSubmission() {
        FormPage formPage = new FormPage(driver);
        
        // Navigate to the form
        formPage.navigateToForm();

        // Get current date in required format
        String currentDate = LocalDate.now().format(DateTimeFormatter.ofPattern("MM/dd/yyyy"));

        // Fill and submit the form
        formPage.fillForm(
            "John",
            "Doe",
            "Software Engineer",
            currentDate
        );
        formPage.submitForm();
    }
}