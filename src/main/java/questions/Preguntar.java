package questions;

import model.Data;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import userinterface.texto;

import javax.swing.*;
import java.util.List;

public class Preguntar  implements Question <Boolean>{

    private List<Data> data;



    public static Preguntar toThe(List<Data> data) {
        return new Preguntar(data);
    }
    public Preguntar(List<Data> data) {
        this.data = data;
    }

    @Override
    public Boolean answeredBy(Actor actor) {

        boolean result;
       String finalText= Text.of(texto.texto).answeredBy(actor);

        if(finalText.equals(data.get(0).getTexto())){
            result=true;
        }
        else{
            result=false;
        }
        return result;

    }
}
