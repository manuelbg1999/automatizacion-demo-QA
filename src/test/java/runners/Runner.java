package runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;



//Aqui se especifica el archivo .feature
// en el glue va el stepdefinitionss
// en el tags especifico que escenario quiero que me ejecute si le paso "" ejecuta todos.
@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/practica.feature",
        glue = "stepdefinitions",
        tags = "",
        snippets = CucumberOptions.SnippetType.CAMELCASE
)

public class Runner {
}

