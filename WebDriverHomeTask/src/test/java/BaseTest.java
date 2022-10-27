import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import utils.DriverSingleton;

public class BaseTest {

    private static final String GOOGLE_URL = "http://www.google.com";

    @BeforeTest
    public void profileSetUp() {
        DriverSingleton.getDriver();
    }

    @BeforeMethod
    public void testsSetUp() {
        DriverSingleton.openUrl(GOOGLE_URL);
    }

    @AfterTest
    public void tearDown() {
        DriverSingleton.quitDriver();
    }

}
