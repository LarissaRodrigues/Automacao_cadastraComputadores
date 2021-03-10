package automacao.web.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CadastroPage {

	public void acessaCadastro () {
		/*
		 * driver.findElement(By.id("add")).click();
		 * driver.findElement(By.id("name")).sendKeys("Computador nome");
		 * driver.findElement(By.id("introduced")).sendKeys("2020-01-01");
		 * driver.findElement(By.name("discontinued")).sendKeys("2020-01-02");
		 * //driver.findElement(By.id("company")).click();
		 * driver.findElement(By.xpath("//select/option[text()='RCA']")).click();
		 * driver.findElement(By.xpath("//*[@id='main']/form/div/input")).click();
		 */
	}
	
	@FindBy(id="add")
	public WebElement add;
	
	@FindBy(id="name")
	public WebElement name;
	
	@FindBy(id="introduced")
	public WebElement introduced;
	
	@FindBy (name="discontinued")
	public WebElement discontinued;
	
	@FindBy(id="company")
	public WebElement company;
	
	@FindBy (xpath= "//select/option[text()='RCA']" )
	public WebElement selecionaCombo;
	
	@FindBy (xpath= "//*[@id='main']/form/div/input" )
	public WebElement BTN_confirma;
}
