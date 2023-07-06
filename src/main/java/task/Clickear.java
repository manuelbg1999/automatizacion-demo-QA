package task;

import interactions.Wait;
import model.Data;
import model.Data2;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;


import static userinterface.Texto2.boton;

public class Clickear implements Task {

    public static Clickear clickear() {

        return  Tasks.instrumented(Clickear.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Wait.just(6000),
                Click.on(boton)
        );
    }
}
