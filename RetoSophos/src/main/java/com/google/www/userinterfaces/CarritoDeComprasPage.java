package com.google.www.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class CarritoDeComprasPage {
    public static Target ABRIR_CARRITO = Target.the("Abrir carrito de compra").locatedBy("//*[@class='cart__ico']");
    public static Target CONTINUAR_CARRITO = Target.the("Continual al carrito boton").locatedBy("//*[@class='button istertiary']");

    public static Target VERIFICAR_PRODUCTO(String producto){
        return Target.the("Producto "+producto+" en el carrtio").locatedBy("//*[contains(@id,'product-name') and contains(text(),'"+producto+"')]  ");
    }
}
