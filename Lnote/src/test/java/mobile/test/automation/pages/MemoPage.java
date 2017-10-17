package mobile.test.automation.pages;

import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MemoPage extends BasePage {

    private final By noteInput = By.xpath("//android.widget.EditText");

    private final By saveButton = By.xpath("//android.widget.TextView[contains(@index, '2')]");

    private final By navigateUpButton = By.xpath("//android.widget.ImageButton");

    public MemoPage(WebDriver driver) {
        super(driver);
    }


    public HomePage leaveMemo() {
        waitForVisibilityOf(noteInput);
        driver.findElement(noteInput).click();
        waitForVisibilityOf(navigateUpButton);
        driver.findElement(navigateUpButton).click();
        return new HomePage(driver);
    }

    public HomePage writeMemo(String memoInput) {
        waitForVisibilityOf(noteInput);
        driver.findElement(noteInput).click();
        driver.findElement(noteInput).sendKeys(memoInput);
        waitForVisibilityOf(saveButton);
        driver.findElement(saveButton).click();
        return new HomePage(driver);
    }

    public String readMemo() {
        waitForVisibilityOf(noteInput);
        driver.findElement(noteInput).click();
        String memoText = driver.findElement(noteInput).getText();
        waitForVisibilityOf(navigateUpButton);
        driver.findElement(navigateUpButton).click();
        return memoText;
    }

}
