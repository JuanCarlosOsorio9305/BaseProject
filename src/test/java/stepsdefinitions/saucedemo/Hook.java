package stepsdefinitions.saucedemo;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.webdriver.ThucydidesWebDriverSupport;

public class Hook {

    @Before
    public void setTheStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Before
    public void abrirNavegador(Scenario scenario){
        OnStage.theActorCalled("Juan Carlos").can(BrowseTheWeb.with(ThucydidesWebDriverSupport.getDriver()));

    }

    @After
    public void cerrarNavegador(Scenario scenario){
        if(scenario.isFailed()){
            Serenity.takeScreenshot();
        }
        OnStage.drawTheCurtain();
    }

}
