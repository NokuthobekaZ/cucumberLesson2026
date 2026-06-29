package Hooks;

import Base.BaseTest;
import Pages.*;
import Utilities.BrowserFactory;
import Utilities.TakeScreenShots;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;


public class Hooks extends BaseTest {

    @Before
    public void setup() {

        driver = BrowserFactory.startBrowser(
                "chrome",
                "https://ndosisimplifiedautomation.vercel.app/"
        );

        homePage = new HomePage(driver);
        loginPage = new LoginPage(driver);
        dashboardPage = new DashboardPage(driver);
        adminDashboardPage = new AdminDashboardPage(driver);
        createNewGroupPopUpPage = new CreateNewGroupPopUpPage(driver);
        manageGroupsPage = new ManageGroupsPage(driver);
    }

    @After
    public void tearDown(Scenario scenario) {

        TakeScreenShots.takeScreenShots(scenario);

        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }

    }
