import manager.PageFactoryManager;
import org.testng.Assert;
import org.testng.annotations.Test;


public class FindImageTest extends BaseTest {

    @Test
    public void checkTheSearchOfTheEnteredCategory() {
        String TEXT = "image";
        PageFactoryManager.homePage.findImage(TEXT);
        Assert.assertTrue(PageFactoryManager.resultsPage.areTheImagesDisplayed());
    }
}
