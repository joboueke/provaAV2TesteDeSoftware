package testesdesoftware.teste;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
//import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;

public class DuckFirstTestRefatorado1 extends BaseTest {
	
//	private WebDriver driver;
//	private final String URL_BASE = "https://duckduckgo.com/";
//	private final String PATH_DRIVER = "src/test/resources/chromedriver.exe";
//	
//	
//	// Prepara e abre o navegador Chrome antes dos teste automatizados começarem
//	private void iniciar() {
//		//define onde está o arquivo chromedriver.exe onde é o programa usado pelo
//		System.setProperty("webdriver.chrome.driver", PATH_DRIVER);
//		
//		//cria uma nova instância do navegador em Chrome
//		driver = new ChromeDriver();
//		
//		//abre o navegador em tela maximizada
//		driver.manage().window().maximize();
//		
//		
//		driver.get(URL_BASE);
//	}
	@Test
	public void testPesquisarNoDuckGo() {
		//Montagem de cenário
		//iniciar();
		
		//Preparação
		WebElement inputPesquisa = driver.findElement(By.id("searchbox_input"));
		
		//Execução
		inputPesquisa.sendKeys("Receita de bolo de cenoura"+Keys.ENTER);
		
		String resultado = driver.findElement(By.cssSelector("span.EKtkFWMYpwzMKOYr0GYm")).getText();
		
		System.out.println(resultado);
		
		//Verificação
		assertTrue(resultado, resultado.contains("cenoura"));
		
		//driver.quit();
	}
	
}