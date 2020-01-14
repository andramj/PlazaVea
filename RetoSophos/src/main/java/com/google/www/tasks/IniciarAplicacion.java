package com.google.www.tasks;

import com.google.www.userinterfaces.PaginaPrincipalPlazaveaPage;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Step;

public class IniciarAplicacion implements Task {


    private PaginaPrincipalPlazaveaPage pagina;


    @Step("{0} Abre el navegador en la pagina de inicio de plazavea")
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.wasAbleTo(Open.browserOn(pagina));
    }

    public static IniciarAplicacion enLaPagina(){
        return instrumented(IniciarAplicacion.class);
    }
}
