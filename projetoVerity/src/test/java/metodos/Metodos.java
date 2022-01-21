package metodos;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Metodos {

	WebDriver driver;

	public void acessarSite(String site) throws InterruptedException {
		try {
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			driver = new ChromeDriver();
			driver.get(site);
			driver.manage().window().maximize();
			Thread.sleep(4000);
		} catch (Exception e) {
			System.err.println("***Erro na configuração do navegador***\n" + e.getMessage());
		}

	}

	public void click(By Elementos) throws InterruptedException {
		driver.findElement(Elementos).click();
		Thread.sleep(3000);

	}

	public void validarTexto(String texto, By elemento) {
		String textoEsperado = driver.findElement(elemento).getText();
		assertEquals(texto, textoEsperado);
	}

	public void fecharNavegador() {
		driver.quit();
	}

	public void escrever(String texto, By elemento) {
		try {
			driver.findElement(elemento).sendKeys(texto);
		} catch (Exception e) {
			System.err.println("***Erro ao escrever.***\n" + e.getMessage());
		}

	}
}
