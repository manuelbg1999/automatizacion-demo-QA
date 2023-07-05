package task;

import model.Data;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.util.List;

import static userinterface.interfaz.*;

public class diligenciar implements Task {



    private List<Data> data;

    public diligenciar(List<Data> data) {
        this.data = data;
    }

    public static diligenciar llenar(List<Data> data) {

        return  Tasks.instrumented(diligenciar.class,data);
    }

///Aqui van las acciones llenar, clickear etc.
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(

                Enter.keyValues(data.get(0).getFullname()).into(Fullname),
                Enter.keyValues(data.get(0).getEmail()).into(Email),
                Enter.keyValues(data.get(0).getEmail()).into(Address),
                Enter.keyValues(data.get(0).getEmail()).into(PAddress),
                Click.on(boton)
        );
    }


}
