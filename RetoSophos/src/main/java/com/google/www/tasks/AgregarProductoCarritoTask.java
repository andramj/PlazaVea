package com.google.www.tasks;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import static com.google.www.userinterfaces.CarritoDeComprasPage.*;
import static com.google.www.userinterfaces.ListadoDeResultadosPage.AGREGAR_CARRITO;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class AgregarProductoCarritoTask implements Task {

        @Override
        public <T extends Actor> void performAs(T actor) {
            actor.attemptsTo(
                Click.on(AGREGAR_CARRITO),
                    Click.on(ABRIR_CARRITO),
                    Click.on(CONTINUAR_CARRITO)
                );
        }

    public static AgregarProductoCarritoTask on(){
        return instrumented(AgregarProductoCarritoTask.class);
    }
}
