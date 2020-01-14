package com.google.www.userinterfaces;


import net.serenitybdd.screenplay.targets.Target;

public class ListadoDeResultadosPage {
    public static Target AGREGAR_CARRITO=Target.the("Boton agregar al carrito").locatedBy("//*[@id='ProductCard__add-to-cart']");
    public static Target SELECCIONAR_PRODUCTO(String producto){
        return Target.the("Boton seleccionar "+producto+" buscado").locatedBy("//*[@class='SuggestionList__group']//*[contains(text(),'"+producto+"')]");
    }

}
