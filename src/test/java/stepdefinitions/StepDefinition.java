package stepdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import model.Data;
import model.Data2;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import questions.Preguntar;
import questions.Preguntar2;
import task.Clickear;
import task.Diligenciar;

import java.util.List;

public class StepDefinition {

    ///Se  nombra el actor
    @Before
    public void setThestage() {

        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("Manuel");
    }
    @Given("que estoy en la pagina de QA")
    public void queEstoyEnLaPaginaDeQA() {
        OnStage.theActorInTheSpotlight().wasAbleTo(Open.url("https://demoqa.com/text-box"));
    }
    @When("llene el formulario con los siguientes datos")
    public void lleneElFormularioConLosSiguientesDatos(List<Data> data) {
        OnStage.theActorInTheSpotlight().attemptsTo(Diligenciar.llenar(data));
    }
    @Then("se me lista los datos ingresados en la pagina con el texto")
    public void seMeListaLosDatosIngresadosEnLaPaginaConElTexto(List<Data> data) {


        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Preguntar.toThe(data)));
    }


    @Given("Dado que ingreso al enlace")
    public void dadoQueIngresoAlEnlace() {
        OnStage.theActorInTheSpotlight().wasAbleTo(Open.url("https://demoqa.com/elements"));
    }

    @When("le doy click en el boton text box")
    public void leDoyClickEnElBotonTextBox() {
        OnStage.theActorInTheSpotlight().attemptsTo(Clickear.clickear());

    }
    @Then("veo el siguiente texto")
    public void veoElSiguienteTexto(List<Data2> data) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Preguntar2.toThe(data)));

    }


}
