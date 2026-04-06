package stepdef;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class TestHook extends TestBase{
    @Before
    public void setup() {
        openBrowser();
    }
    @After
    public void quit() throws InterruptedException {
        Thread.sleep(5000);
        closeBrowser();
    }
}
