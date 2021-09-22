package week2.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateContact {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver chrom=new ChromeDriver();
		chrom.manage().window().maximize();
		
		chrom.get("http://leaftaps.com/opentaps/control/login");
		
		chrom.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		chrom.findElement(By.xpath("//input[@id='username']")).sendKeys("demosalesmanager");
		chrom.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		WebElement login=chrom.findElement(By.className("decorativeSubmit"));
		login.click();
		WebElement crmsfa=chrom.findElement(By.linkText("CRM/SFA"));
		crmsfa.click();
	
		WebElement contact=chrom.findElement(By.linkText("Create Contact"));
		contact.click();
		chrom.findElement(By.xpath("//input[@id='firstNameField']")).sendKeys("ajay");
		chrom.findElement(By.xpath("//input[@id='lastNameField']")).sendKeys("s");
		chrom.findElement(By.xpath("//input[@id='createContactForm_firstNameLocal']")).sendKeys("ajay");
		chrom.findElement(By.xpath("//input[@id='createContactForm_lastNameLocal']")).sendKeys("s");
		chrom.findElement(By.xpath("//input[@name='birthDate']")).sendKeys("22/02/2002");
		chrom.findElement(By.xpath("//input[@id='createContactForm_generalProfTitle']")).sendKeys("TestLeaf");
		chrom.findElement(By.xpath("//input[@id='createContactForm_departmentName']")).sendKeys("EEE");
		
		//WebElement dropDown1=chrom.findElement(By.id("createContactForm_preferredCurrencyUomId"));
		//Select drop1=new Select(dropDown1);
		//drop1.selectByValue("USD")	;
		
	//	chrom.findElement(By.xpath("//input[@name='description']")).sendKeys("abcdesf");
	//	chrom.findElement(By.xpath("//input[@id='createContactForm_importantNote']")).sendKeys("abcdfrt");
	//	chrom.findElement(By.xpath("//input[@id='createContactForm_primaryEmail']")).sendKeys("abc22@gmail.com");
	//	chrom.findElement(By.xpath("//input[@id='createContactForm_primaryPhoneNumber']")).sendKeys("9874561230");
	//	chrom.findElement(By.xpath("//input[@id='generalToNameField']")).sendKeys("asdfg");
	//	chrom.findElement(By.xpath("//input[@id='createContactForm_generalCity']")).sendKeys("namakkal");
		
	
		
		chrom.findElement(By.name("submitButton")).click();
	}

}
