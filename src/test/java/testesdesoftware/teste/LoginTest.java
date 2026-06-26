package testesdesoftware.teste;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import testesdesoftware.pageObject.LoginPO;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class LoginTest extends BaseTest {
	
	private static LoginPO loginPage;
	
	@Before
	public void prepararTestes() {
		//driver.get("https://duckduckgo");
		driver.get("file:///C:/Users/36129382024.2M/Desktop/sistema/sistema/login.html");
		loginPage =new LoginPO(driver);
	}
	@Test
	public void TC001_naoDeveLogarNoSistemaComEmailESenhaVazios() {
		//loginPage.inputEmail.sendKeys("");
		//loginPage.inputSenha.sendKeys("");
		//loginPage.buttonEntrar.click();
		loginPage.executarAcaoDeLogar("", "");
		
		String mensagemModal = loginPage.spanMensagem.getText();
		
		assertEquals(mensagemModal,"Informe usuário e senha, os campos não podem ser brancos.");
	}
	@Test
	public void TC002_naoDeveLogarNoSistemaComEmailErradoESenhaVazia() {
		loginPage.executarAcaoDeLogar("teste", "");
		
		String mensagemModal = loginPage.spanMensagem.getText();
		
		assertEquals(mensagemModal,"Informe usuário e senha, os campos não podem ser brancos.");
	}
	
	@Test
	public void TC003_naoDeveLogarNoSistemaComEmailVazioESenhaErrada() {
		loginPage.executarAcaoDeLogar("", "teste");
		
		String mensagemModal = loginPage.spanMensagem.getText();
		
		assertEquals(mensagemModal,"Informe usuário e senha, os campos não podem ser brancos.");
	}
	
	@Test
	public void TC004_naoDeveLogarNoSistemaComEmaiESenhaInvalidos() {
		loginPage.executarAcaoDeLogar("teste", "teste");
		
		String mensagemModal = loginPage.spanMensagem.getText();
		
		assertEquals(mensagemModal,"E-mail ou senha inválidos");	
	}
	
	@Test
	public void TC007_deveLogarNoSistemaComEmailESenhaCorretos() {
		loginPage.executarAcaoDeLogar("admin@admin.com", "admin@123");
		
		String telaCorreta = loginPage.obterTituloDaPagina();
		
		assertEquals(telaCorreta,"Controle de Produtos");
		
	}

}




