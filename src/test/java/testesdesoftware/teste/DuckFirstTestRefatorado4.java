package testesdesoftware.teste;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
//import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import testesdesoftware.pageObject.DuckPO;
//import org.openqa.selenium.chrome.ChromeDriver;


@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class DuckFirstTestRefatorado4 extends BaseTest {
	
	private static DuckPO duckPages;
	
	@Before
	public void prepararTestes() {
		driver.get("https://duckduckgo.com");
		duckPages = new DuckPO(driver);
	}
	
	
	@Test
	//public void testPesquisarNoDuckGo2() {
	public void TC001_deveSerPossivelPesquisarNoDuckGoTextoReceitaDeCookie() {
		duckPages.inputPesquisa.sendKeys("Cookie"+Keys.ENTER);
		
		String resultado = duckPages.resultado.getText();	
		
		assertTrue(resultado, resultado.contains("Cookie"));
		
	}
	//public void testPesquisarNoDuckGo3() {
	public void TC002_deveSerPossivelPesquisarNoDuckGoTextoReceitaDeCookie() {
		//duckPages.inputPesquisa.sendKeys("Cookie"+Keys.ENTER);
		duckPages.pesquisar("Cookie"); //mesma coisa da linha acima, porém mais elegante
		
		//String resultado = duckPages.resultado.getText();
		String resultado = duckPages.obterResultadoDaPesquisa(); //mesma coisa da linha acima, porém mais elegante//mesma coisa da linha acima, porém mais elegante
		
		assertTrue(resultado, resultado.contains("Cookie"));
		
	}
}