package com.google.www.questions;

import com.google.www.userinterfaces.CarritoDeComprasPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.targets.Target;

public class VerificarProducto implements Question<String> {

    String producto;
    public VerificarProducto(String producto) {
        this.producto = producto;
    }

    @Override
    public String answeredBy(Actor actor) {
        String texto=Text.of(CarritoDeComprasPage.VERIFICAR_PRODUCTO(producto)).viewedBy(actor).value();
         return texto;
    }


    public static VerificarProducto queSeAgregoAlCarrito(String producto) {
            return new VerificarProducto(producto);
    }
}
