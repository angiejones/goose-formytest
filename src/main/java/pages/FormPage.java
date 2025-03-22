package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class FormPage extends BasePage {
    // Page URL
    private static final String PAGE_URL = "https://formy-project.herokuapp.com/form";

    // Locators
    private final By firstNameInput = By.id("first-name");
    private final By lastNameInput = By.id("last-name");
    private final By jobTitleInput = By.id("job-title");
    private final By educationRadio = By.id("radio-button-2"); // College
    private final By sexCheckbox = By.id("checkbox-1");
    private final By experienceSelect = By.id("select-menu");
    private final By datePicker = By.id("datepicker");
    private final By submitButton = By.cssSelector("a.btn.btn-lg.btn-primary");

    public FormPage(WebDriver driver) {
        super(driver);
    }

    public void navigateToForm() {
        driver.get(PAGE_URL);
    }

    public void fillForm(String firstName, String lastName, String jobTitle, String date) {
        enterText(firstNameInput, firstName);
        enterText(lastNameInput, lastName);
        enterText(jobTitleInput, jobTitle);
        
        // Select education level (College)
        clickElement(educationRadio);
        
        // Select sex checkbox
        clickElement(sexCheckbox);
        
        // Select years of experience (2-4)
        clickElement(experienceSelect);
        clickElement(By.cssSelector("option[value='2']"));
        
        // Enter date
        enterText(datePicker, date);
    }

    public void submitForm() {
        clickElement(submitButton);
    }
}