package elementos;

import org.openqa.selenium.By;

public class Elementos {

	// Elementos dos titulos
	private By botaoFazemos = By.id("comp-kevyodnk1label");
	private By digitalCulture = By.cssSelector("#comp-kx0qtlms > a > div");
	private By digitalTech = By.cssSelector("#comp-kx0qtroo > a > div");
	private By telaInicial = By.xpath("//*[@id=\"img_comp-kevyodng\"]/img");
	private By nossasSolucoes = By.cssSelector("#comp-kwv1yx4h > h1 > span");
	
	//Elementos cadastro 
    private By botaoContato = By.cssSelector("#comp-kevyodnk5label");
	private By digitarName = By.name("nome");
    private By digitarEmail = By.name("email");
	private By digitarCelular = By.name("phone");
	private By digitarResposta = By.id("textarea_comp-kwz6tqfr");
	private By clicarCheckbox = By.cssSelector("#comp-kwz6tqgp > input");
	private By clicarEnviar = By.cssSelector("#comp-kwz6tqhd > button");  
	

	
	public By getBotaoFazemos() {
		return botaoFazemos;
	}

	public By getDigitalCulture() {
		return digitalCulture;
	}

	public By getDigitalTech() {
		return digitalTech;
	}

	public By getNossasSolucoes() {
		return nossasSolucoes;
	}

	public By getBotaoContato() {
		return botaoContato;
	}

	public By getDigitarName() {
		return digitarName;
	}

	public By getDigitarEmail() {
		return digitarEmail;
	}

	public By getDigitarCelular() {
		return digitarCelular;
	}

	public By getDigitarResposta() {
		return digitarResposta;
	}

	public By getClicarCheckbox() {
		return clicarCheckbox;
	}

	public By getClicarEnviar() {
		return clicarEnviar;
	}

	public By getTelaInicial() {
		return telaInicial;
	}

}
