package userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Texto {

    public static final Target texto =Target.the("texto").located(By.xpath("//*[@id=\"app\"]/div/div/div[1]/div"));

}
