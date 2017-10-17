package mobile.test.automation.scenarios;

import mobile.test.automation.pages.HomePage;
import mobile.test.automation.pages.MemoPage;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class MemoTest extends AndroidSetup {

    private String memoInputExpected = "MemoTest Input";

    @BeforeClass
    public void setUp() throws Exception {
        prepareAndroidForAppium();

    }

    @Test
    public void addAndCheckMemo() {
        MemoPage memo = new MemoPage(driver);
        HomePage home = memo.writeMemo(memoInputExpected);
        memo = home.openExistingMemo();
        String memoActual = memo.readMemo();
        Assert.assertEquals(memoInputExpected, memoActual);
    }

    @AfterClass
    public void tearDown() throws Exception {
        driver.quit();
    }
}
