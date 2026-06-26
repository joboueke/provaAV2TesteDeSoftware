package testesdesoftware.teste;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {
	protected static WebDriver driver;
	private static final String URL_BASE = "https://duckduckgo.com/";
	private static final String PATH_DRIVER = "src/test/resources/chromedriver.exe";
	
	
	// Prepara e abre o navegador Chrome antes dos teste automatizados começarem
	@BeforeClass
	public static void iniciar() {
		//define onde está o arquivo chromedriver.exe onde é o programa usado pelo
		System.setProperty("webdriver.chrome.driver", PATH_DRIVER);
		
		//cria uma nova instância do navegador em Chrome
		driver = new ChromeDriver();
		
		//abre o navegador em tela maximizada
		driver.manage().window().maximize();
		
		
		driver.get(URL_BASE);
	}
	@AfterClass
	public static void finalizar() throws InterruptedException {
		Thread.sleep(5000); // espera 5 segundos
		driver.quit();
	}
}
