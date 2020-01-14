package com.google.www.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://www.plazavea.com.pe/") // pagina que abre por defecto
public class PaginaPrincipalPlazaveaPage extends PageObject {
    public static Target BUSCADOR= Target.the("Buscador de productos").locatedBy("//input[@id='search_box']");
    public static Target POP_UP=Target.the("Opcion negativa de la ventana emergente").locatedBy("//*[@class='align-right secondary popover-button']");

}
