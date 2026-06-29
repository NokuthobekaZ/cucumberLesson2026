package Base;

import Pages.*;
import org.openqa.selenium.WebDriver;

//public class BaseTest {
//
//
//
//    public final WebDriver driver = BrowserFactory.startBrowser("chrome",
//            "https://ndosisimplifiedautomation.vercel.app/");
//
//    public HomePage homePage = PageFactory.initElements(driver, HomePage.class);
//    public LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
//    public DashboardPage dashboardPage = PageFactory.initElements(driver, DashboardPage.class);
//}



public class BaseTest {

    public static WebDriver driver;

    public static HomePage homePage;
    public static LoginPage loginPage;
    public static DashboardPage dashboardPage;
    public static AdminDashboardPage adminDashboardPage;
    public static CreateNewGroupPopUpPage createNewGroupPopUpPage;
    public static ManageGroupsPage manageGroupsPage;
}
