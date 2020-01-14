package com.google.www.stepdefinitions;

import com.google.www.questions.VerificarProducto;
import com.google.www.tasks.AgregarProductoCarritoTask;
import com.google.www.tasks.BuscarProductoTask;
import com.google.www.tasks.IniciarAplicacion;
import com.google.www.userinterfaces.PaginaPrincipalPlazaveaPage;
import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import static org.hamcrest.CoreMatchers.containsString;
import org.openqa.selenium.WebDriver;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class AgregarProductoCarritoCompraStepDefinition {

    @Managed(driver = "chrome")
    private WebDriver driver;
    private PaginaPrincipalPlazaveaPage paginaPrincipalPlazaveaPage;

    @Before
    public void before() {
        OnStage.setTheStage(new OnlineCast());
        andres.can(BrowseTheWeb.with(driver));
    }

    private Actor andres = Actor.named("Andres");
    @Dado("que el usuario se encuentra en la pagina plazavea")
    public void queElUsuarioSeEncuentraEnLaPaginaPlazavea() {
        andres.wasAbleTo(IniciarAplicacion.enLaPagina());
    }


    @Cuando("en el buscador busca '(.*)'")
    public void enElBuscadorBuscaProducto(String producto) {
        andres.attemptsTo(BuscarProductoTask.producto(producto));

    }

    @Cuando("agrega el producto al carrito de compra")
    public void agregaElProductoAlCarritoDeCompra() {
        andres.attemptsTo(AgregarProductoCarritoTask.on());
    }

    @Entonces("se visualiza el producto '(.*)' en el carrito de compra$")
    public void seVisualizaElProductoEnElCarritoDeCompra(String producto) {
        andres.should(seeThat(VerificarProducto.queSeAgregoAlCarrito(producto), containsString(producto)));
    }

}
