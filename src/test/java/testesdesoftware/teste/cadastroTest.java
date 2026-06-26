package testesdesoftware.teste;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import testesdesoftware.pageObject.CadastroPO;

public class cadastroTest extends BaseTest {

	private static CadastroPO cadastroPage;
	/**
	 * Montagem do cenário
	 * @author João e Leo
	 */
	@Before
	public void prepararTestes() {
		driver.get("file:///C:/Users/36129382024.2M/Desktop/selenium-lab-main/sistema/produtos.html");
		cadastroPage= new CadastroPO(driver);
	}
	@Test
	public void TC006_deveCadastarOProdutoAposPreencherTodosOsCampos() throws InterruptedException {
		cadastroPage.executarCadastroProduto("123", "pudim", "10g", "200", "15062026");
		Thread.sleep(5000);
		
		String campoCadastro = cadastroPage.inputCodigo.getAttribute("value");

		assertEquals("", campoCadastro);
	}
	@Test
	public void TC007_naoPreencherOCampoDaDataEAparecerMensagemDeErro() {
		cadastroPage.executarCadastroProduto("456", "ervilha", "500g", "5", "");
		
		String mensagemModal=cadastroPage.spanMensagem.getText();
		
		assertEquals(mensagemModal, "Todos os campos são obrigatórios para o cadastro!");
	}
	@Test
	public void TC001_naoTrocarDeTelaAoClicarNoBotaoVoltar() {
		cadastroPage.clicarBotaoVoltar();
		
		String telaCadastro = cadastroPage.obterTituloDaPagina();
		
		assertEquals(telaCadastro, "Controle de Produtos");
	}
}
