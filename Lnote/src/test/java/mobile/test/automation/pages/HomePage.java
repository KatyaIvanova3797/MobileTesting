package mobile.test.automation.pages;

import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {

    private final By addNoteButton = By.id("jp.hrkzwkbys.lockmemo:id/fab");

    private final By noteView = By.id("jp.hrkzwkbys.lockmemo:id/memo");

    public HomePage(WebDriver driver) {
        super(driver);
    }


    public MemoPage addNewMemo() {
        waitForVisibilityOf(addNoteButton);
        driver.findElement(addNoteButton).click();
        return new MemoPage(driver);
    }

    public MemoPage openExistingMemo() {
        waitForClickabilityOf(noteView);
        driver.findElement(noteView).click();
        return new MemoPage(driver);
    }
}
