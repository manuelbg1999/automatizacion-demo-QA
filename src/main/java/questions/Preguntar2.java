package questions;

import model.Data;
import model.Data2;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import userinterface.Texto2;

import java.util.List;

public class Preguntar2  implements Question<Boolean> {

    private List<Data2> data;



    public static Preguntar2 toThe(List<Data2> data) {
        return new Preguntar2(data);
    }
    public Preguntar2(List<Data2> data) {
        this.data = data;
    }

    @Override
    public Boolean answeredBy(Actor actor) {

        boolean result;
        String finalText= Text.of(Texto2.texto).answeredBy(actor);

        if(finalText.equals(data.get(0).getTexto2())){
            result=true;
        }
        else{
            result=false;
        }
        return result;

    }
}
