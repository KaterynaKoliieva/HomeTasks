package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ResultsPage extends BasePage{

    public ResultsPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//div[@jsname='dTDiAc']//img")
    private List<WebElement> images;


    public boolean areTheImagesDisplayed() {
        if(images.get(0).isDisplayed())
            return true;

        return false;
    }

}
