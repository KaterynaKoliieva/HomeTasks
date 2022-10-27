package manager;

import pages.HomePage;
import pages.ResultsPage;
import utils.DriverSingleton;


public class PageFactoryManager {

    public static final ResultsPage resultsPage = new ResultsPage(DriverSingleton.getDriver());
    public static final HomePage homePage = new HomePage(DriverSingleton.getDriver());

}
