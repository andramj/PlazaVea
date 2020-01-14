package com.google.www.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/com.google.www.features/agregar_producto_carrito_compra.feature",
        glue = "com.google.www.stepdefinitions",
        snippets = SnippetType.CAMELCASE)
public class AgregarProductoCarritoCompra {

}



