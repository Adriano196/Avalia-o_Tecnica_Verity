package steps;

import elementos.Elementos;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import metodos.Metodos;

public class Teste {

	Metodos met = new Metodos();
	Elementos ele = new Elementos();

	@Given("que acesse o site {string}")
	public void que_acesse_o_site(String site) throws InterruptedException {
		met.acessarSite(site);

	}

	@When("clicar no menu o que fazemos")
	public void clicar_no_menu_o_que_fazemos() throws InterruptedException {
		met.click(ele.getBotaoFazemos());
	}

	@Then("validar {string}")
	public void validar(String texto) throws InterruptedException {
		met.validarTexto(texto, ele.getDigitalCulture());
	}

	@Then("depois {string}")
	public void depois(String texto) throws InterruptedException {
		met.validarTexto(texto, ele.getDigitalTech());
	}

	@Then("e voltar a tela inicial e validar {string}")
	public void e_voltar_a_tela_inicial_e_validar(String string) throws InterruptedException {
		met.click(ele.getTelaInicial());
		met.fecharNavegador();
	}


	@When("clicar no menu contato")
	public void cliclar_no_menu_contato() throws InterruptedException {
        met.click(ele.getBotaoContato());
	}

	@When("preencher o campo nome com {string}")
	public void preencher_o_campo_nome_com(String nome) {
        met.escrever(nome, ele.getDigitarName());
	}

	@When("o campo Email com {string}")
	public void o_campo_email_com(String email) {
        met.escrever(email, ele.getDigitarEmail());
	}

	@When("o campo Telefone Celular com {string}")
	public void o_campo_telefone_celular_com(String celular) {
        met.escrever(celular, ele.getDigitarCelular());
	}

	@When("quando inserir a resposta {string}")
	public void quando_inserir_a_resposta(String resposta) {
        met.escrever(resposta, ele.getDigitarResposta());
	}

	@Then("vou clicar no checkbox")
	public void vou_clicar_no_checkbox() throws InterruptedException {
        met.click(ele.getClicarCheckbox());
	}

	@Then("enviar")
	public void enviar() throws InterruptedException {
        met.click(ele.getClicarEnviar());
        met.fecharNavegador();
	}

}
