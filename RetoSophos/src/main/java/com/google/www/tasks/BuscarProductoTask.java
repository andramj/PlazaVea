package com.google.www.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;
import static com.google.www.userinterfaces.PaginaPrincipalPlazaveaPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static com.google.www.userinterfaces.ListadoDeResultadosPage.SELECCIONAR_PRODUCTO;


public class BuscarProductoTask implements Task {
    private String producto;

    public BuscarProductoTask(String producto) {
        this.producto = producto;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(producto).into(BUSCADOR),
                Click.on(SELECCIONAR_PRODUCTO(producto)));
    }

    public static BuscarProductoTask producto(String producto){
        return instrumented(BuscarProductoTask.class,producto);
    }
}
