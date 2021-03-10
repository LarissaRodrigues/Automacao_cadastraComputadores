package automacao.web.core;

import java.io.File;
import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;


public class Driver {
	protected static WebDriver driver;
	
	@BeforeClass 
	 public static void inicializa() {
		//buscando o arquivo do crome driver
		File arquivo = new File("src/main/resources/driver/chromedriver.exe");
		//carregando o arquivo do chrome driver
	    System.setProperty("webdriver.chrome.driver",arquivo.getAbsolutePath());
	    
	    //Criando uma instancia de driver pro crome

	    // abrindo o navegador
	
	      driver = new ChromeDriver();
	      
	      driver.get("https://computer-database.gatling.io/computers");
	      driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	 }
	
	
}
