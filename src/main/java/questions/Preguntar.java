package questions;

import model.Data;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import userinterface.Texto;

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
       String finalText= Text.of(Texto.texto).answeredBy(actor);

        if(finalText.equals(data.get(0).getTexto())){
            result=true;
        }
        else{
            result=false;
        }
        return result;

    }
}
