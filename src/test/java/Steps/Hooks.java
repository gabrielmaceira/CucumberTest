package Steps;

import Base.BaseUtil;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hooks extends BaseUtil {

    private BaseUtil base;

    public Hooks(BaseUtil base) {
        this.base = base;
    }

    @Before
    public void InitializeTest() throws InterruptedException {

        System.out.println("Abriendo browser: Chrome");
        System.setProperty("webdriver.chrome.driver","C:\\DESCARGAS\\chromedriver.exe");

        base.Driver = new ChromeDriver();
    }

    @After
    public void TearDownTest(Scenario scenario) {
        if (scenario.isFailed()) {
            System.out.println("Cerrando browser despues de fallo " + scenario.getName());
        }
        else {
            System.out.println("Cerrando browser sin fallo " + scenario.getName());
        }
    }

}
