package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.Wait;

public class HomePage extends BasePage{

    public HomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//input[@class='gLFyf gsfi']")
    private WebElement searchField;

    public ResultsPage findImage(String text) {
        Wait.waitForPageLoadComplete();
        Wait.waitVisibilityOfElement(searchField);
        searchField.click();
        searchField.sendKeys(text);
        searchField.sendKeys(Keys.ENTER);
        return new ResultsPage(driver);
    }

}
