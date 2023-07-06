package userinterface;

import io.cucumber.core.backend.Located;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Interfaz {

    ///aqui se Mapean  los elementos


    public static final Target Fullname =Target.the("Input del nombre").located(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/form/div[1]/div[2]/input"));
    public static final Target Email =Target.the("Input del correo").located(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/form/div[2]/div[2]/input"));
    public static final Target Address =Target.the("Input del adrres").located(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/form/div[3]/div[2]/textarea"));
    public static final Target PAddress =Target.the("Input del adrees2").located(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/form/div[4]/div[2]/textarea"));
    public static final Target boton =Target.the("boton").located(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/form/div[5]/div/button"));

}
