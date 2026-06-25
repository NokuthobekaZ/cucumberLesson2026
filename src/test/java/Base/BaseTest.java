package Base;

import Pages.DashboardPage;
import Pages.HomePage;
import Pages.LoginPage;
import Utilities.BrowserFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BaseTest {



    public final WebDriver driver = BrowserFactory.startBrowser("chrome",
            "https://ndosisimplifiedautomation.vercel.app/");

    public HomePage homePage = PageFactory.initElements(driver, HomePage.class);
    public LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
    public DashboardPage dashboardPage = PageFactory.initElements(driver, DashboardPage.class);
}
