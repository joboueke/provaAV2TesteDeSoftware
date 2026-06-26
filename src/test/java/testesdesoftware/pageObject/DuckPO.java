package testesdesoftware.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DuckPO extends BasePO {
	
	//WebElement inputPesquisa = driver.findElement(By.id("searchbox_input"));
	@FindBy(id = "searchbox_input")
	public WebElement inputPesquisa;
	
	//String resultado = driver.findElement(By.cssSelector("span.EKtkFWMYpwzMKOYr0GYm")).getText();
	@FindBy(css = "span.EKtkFWMYpwzMKOYr0GYm")
	public WebElement resultado;

	public DuckPO(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	//** para DuckTestRefatorado3: máximo isolamente **//
	/**
	 *  Método que irá efetuar uma pesquisa baseada no texto
	 *  @param drive (Driver da página do DuckDuckGo)
	 */
	
	//duckPages.inputPesquisa.sendKeys("Cookie"+Keys.ENTER);
	public void pesquisar(String texto) {
		inputPesquisa.sendKeys(texto+ Keys.ENTER);
	}
	//String resultado = duckPages.resultado.getText();
	public String obterResultadoDaPesquisa() {
		return resultado.getText();
	}

}
