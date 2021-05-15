import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TestPlan {
    public static final WebDriver driver = new ChromeDriver();

    @BeforeSuite
    public static void main(String [] args) {
        System.setProperty("webdriver.chrome.driver", Utils.CHROME_DRIVER_LOCATION);
    }

    @Test(testName = "Search a url")
    public static void  searchForProduct() {
        driver.get(Utils.BASE_URL);
        MainPage webForm = new MainPage(driver);
        webForm.populateSearchField();
        webForm.populateUrlField();
        webForm.searchItemUsingButton();
    }
    @Test(testName = "ValidateSearchWithoutAnySiteNameAndURL")
    public static void validateSearchWithoutAnuySiteNameAndURL(){
        driver.get(Utils.BASE_URL);
        MainPage webForm = new MainPage(driver);
        webForm.populateSearchField();
        webForm.searchItemUsingButton();
    }
    @Test(testName = "ValidateSearchOnlyAfterSistemName")
    public static void validateSearchOnlyAfterSistemName(){
        driver.get(Utils.BASE_URL);//
    }

    @AfterSuite
    public static void cleanUp() {
        driver.close();
    }

}
