package testesdesoftware.teste;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
//import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import testesdesoftware.pageObject.DuckPO;
//import org.openqa.selenium.chrome.ChromeDriver;

public class DuckFirstTestRefatorado2 extends BaseTest {
	
	private static DuckPO duckPages;
	
	@Before
	public void prepararTestes() {
		driver.get("https://duckduckgo.com");
		duckPages = new DuckPO(driver);
	}
	
	@Test
	public void testPesquisarNoDuckGo() {
		//Montagem de cenário
		//iniciar();
		
		//Preparação
		//WebElement inputPesquisa = driver.findElement(By.id("searchbox_input"));
		
		//Execução
		//inputPesquisa.sendKeys("Receita de bolo de cenoura"+Keys.ENTER);
		duckPages.inputPesquisa.sendKeys("Cookie"+Keys.ENTER);
		
		//String resultado = driver.findElement(By.cssSelector("span.EKtkFWMYpwzMKOYr0GYm")).getText();
		String resultado = duckPages.resultado.getText();
		
		System.out.println(resultado);
		
		//Verificação
		assertTrue(resultado, resultado.contains("Cookie"));
		
		//driver.quit();
	}
	@Test
	public void testPesquisarNoDuckGo2() {
		duckPages.inputPesquisa.sendKeys("Cookie"+Keys.ENTER);
		
		String resultado = duckPages.resultado.getText();	
		
		assertTrue(resultado, resultado.contains("Cookie"));
		
	}
	
}