package Steps;

import Base.BaseUtil;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.openqa.selenium.By;

public class MyStepdefs extends BaseUtil  {

    private BaseUtil base;

    public MyStepdefs(BaseUtil base) {
        this.base = base;
    }

    @Given("^navego a google\\.com$")
    public void navegoAGoogleCom() {
        base.Driver.get("https://www.google.com");
    }

    @And("^busco Margarina$")
    public void busco() throws InterruptedException {
        Thread.sleep(3000);
        base.Driver.findElement(By.name("q")).sendKeys("Margarina");
        Thread.sleep(3000);
        base.Driver.findElement(By.name("btnK")).click();
        Thread.sleep(2000);
    }

    @Then("^veo los resultados$")
    public void veoLosResultados() {
    }

    @And("^busco el texto ([^\"]*)$")
    public void buscoTexto(String texto) throws InterruptedException {
        Thread.sleep(3000);
        base.Driver.findElement(By.name("q")).sendKeys(texto);
        Thread.sleep(3000);
        base.Driver.findElement(By.name("btnK")).click();
        Thread.sleep(2000);
    }
}
