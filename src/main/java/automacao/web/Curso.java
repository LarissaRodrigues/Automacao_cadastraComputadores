package automacao.web;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import automacao.web.core.Driver;


public class Curso extends Driver{
	

	

	 
	 //@BeforeClass
	//public static void main(String[] args) {
		//buscando o arquivo do crome driver
		//File arquivo = new File("src/main/resources/driver/chromedriver.exe");
		//carregando o arquivo do chrome driver
	    //System.setProperty("webdriver.chrome.driver",arquivo.getAbsolutePath());
	    
	    //Criando uma instancia de driver pro crome

	    // abrindo o navegador
	
	  // WebDriver driver = new ChromeDriver();
	    
		/*
		 * driver.get("https://computer-database.gatling.io/computers");
		 * driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 * driver.findElement(By.id("add")).click();
		 * driver.findElement(By.id("name")).sendKeys("Computador nome");
		 * driver.findElement(By.id("introduced")).sendKeys("2020-01-01");
		 * driver.findElement(By.name("discontinued")).sendKeys("2020-01-02");
		 * //driver.findElement(By.id("company")).click();
		 * driver.findElement(By.xpath("//select/option[text()='RCA']")).click();
		 * driver.findElement(By.xpath("//*[@id='main']/form/div/input")).click();
		 */
	    
	//}
   
	@Test
	public void preencheCadastro() {
	    driver.findElement(By.id("add")).click();
	    driver.findElement(By.id("name")).sendKeys("Computador nome");
	    driver.findElement(By.id("introduced")).sendKeys("2020-01-01");
	    driver.findElement(By.name("discontinued")).sendKeys("2020-01-02");
	    //driver.findElement(By.id("company")).click();
	    driver.findElement(By.xpath("//select/option[text()='RCA']")).click();
	    driver.findElement(By.xpath("//*[@id='main']/form/div/input")).click();
		
	}
	 
}
