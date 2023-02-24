package ejecuciones;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class gherkin extends objetos{
	

	@Given("^ingresamos el usuario \"(.*?)\" y la contraseña \"(.*?)\"$")
	public void ingresamos_el_usuario_y_la_contraseña(String user, String pass) throws Throwable {
		login.login(user, pass);
	}

	@Then("^Ingresamos a la pagina principal$")
	public void ingresamos_a_la_pagina_principal() throws Throwable {
		login.validarPage();
	}
	
	@Given("^Ingresamos a la pagina eccomerce y agregamos todos los productos al carro$")
	public void ingresamos_a_la_pagina_eccomerce_y_agregamos_todos_los_productos_al_carro() throws Throwable {
		ecommerce.selecProduct();
	}

	@When("^ingresamos al carro de compras$")
	public void ingresamos_al_carro_de_compras() throws Throwable {
		ecommerce.cartProducts();
	}
	
	@When("^ingresamos el nombre \"(.*?)\", el ultimo nombre \"(.*?)\" y el codigo postal \"(.*?)\"$")
	public void ingresamos_el_nombre_el_ultimo_nombre_y_el_codigo_postal(String fName, String lName, String cPostal) throws Throwable {
		cartPage.datosCart(fName, lName, cPostal);
	}
	
	@Then("^paganos los productos$")
	public void paganos_los_productos() throws Throwable {
		cartPage.btnFinish();
		cartPage.btnVolver();
	}
	
	@Then("^reseteamos los datos del carro y nos deslogueamos$")
	public void reseteamos_los_datos_del_carro_y_nos_deslogueamos() throws Throwable {
		ecommerce.logout();
	}
	
}
