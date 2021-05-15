import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPage extends PageObject{
    // Clas constructor
    public MainPage(WebDriver driver) {
        super(driver);
    }
    private final String SITE_NAME ="Youtube";
    private final  String VALID_URL ="www.youtube.com";

    @FindBy(xpath = "//*[@id=\"siteName\"]")
    private WebElement siteName;
    @FindBy(xpath = "//*[@id=\"urlName\"]")
    private WebElement urlName;
    @FindBy(xpath = "//*[@id=\"myForm\"]/button")
    private WebElement button;



    public void populateSearchField() {
        this.siteName.sendKeys(SITE_NAME);
    }
    public void populateUrlField() {
        this.urlName.sendKeys(VALID_URL);
    }
    public void searchItemUsingButton() {
        this.button.click();
    }





}
