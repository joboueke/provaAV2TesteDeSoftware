package testesdesoftware.pageObject;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CadastroPO extends BasePO {

	public CadastroPO(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	/**
	 * Identificador de elementos da pagina de cadastro
	 * @author João e Leo
	 */
	@FindBy(id="btn-adicionar")
	public WebElement buttonAdicionar;
	
	@FindBy(id="btn-salvar")
	public WebElement buttonSalvar;
	
	@FindBy(id="btn-sair")
	public WebElement buttonSair;
	
	@FindBy(className="nav-link")
	public WebElement buttonVoltar;
	
	@FindBy(id="mensagem")
	public WebElement spanMensagem;
	
	@FindBy(id="codigo")
	public WebElement inputCodigo;
	
	@FindBy(id="nome")
	public WebElement inputNome;
	
	@FindBy(id="quantidade")
	public WebElement inputQuantidade;
	
	@FindBy(id="valor")
	public WebElement inputValor;
	
	@FindBy(id="data")
	public WebElement inputData;
	
	public void escrever(WebElement input, String texto) {
		input.clear();
		input.sendKeys(texto, Keys.TAB);
	}
	/**
	 * Metodo de cadastro de um produto
	 * @author João e Leo	
	 * @param codigo
	 * @param nome
	 * @param quantidade
	 * @param Valor
	 * @param data
	 */
	public void executarCadastroProduto(String codigo,String nome, String quantidade, String Valor, String data) {
		buttonAdicionar.click();
		buttonAdicionar.click();
		escrever(inputCodigo, codigo);
		escrever(inputNome, nome);
		escrever(inputQuantidade, quantidade);
		escrever(inputValor, Valor);
		escrever(inputData, data);
		buttonSalvar.click();
	}
	/**
	 * Metodo para clicar no botão "voltar"
	 * @author João e Leo
	 */
	public void clicarBotaoVoltar() {
		buttonVoltar.click();
	}
	/**
	 * Metodo para captar a mensagem de erro
	 * @author João e Leo
	 * @return
	 */
	public String obterMensagem() {
		return this.spanMensagem.getText();
	}
	/**
	 * Metodo para capturar o titula da pagina web
	 * @author João e Leo
	 * @return
	 */
	public String obterTituloDaPagina() {
		return driver.getTitle();
	}
}
