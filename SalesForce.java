package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SalesForce {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver chrom=new ChromeDriver();
		chrom.manage().window().maximize();
		
		chrom.get("https://www.salesforce.com/in/form/signup/freetrial-sales/?d=70130000000Enyk");
		
		chrom.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		chrom.findElement(By.xpath("//input[@name='UserFirstName']")).sendKeys("Ajay");
		chrom.findElement(By.xpath("//input[@name='UserLastName']")).sendKeys("Sekar");
		chrom.findElement(By.xpath("//input[@name='UserEmail']")).sendKeys("abc123@gmail.com");
		chrom.findElement(By.xpath("//input[@name='CompanyName']")).sendKeys("TestLeaf");
		chrom.findElement(By.xpath("//input[@name='UserPhone']")).sendKeys("9874561230");
		
		WebElement dropDown1=chrom.findElement(By.name("UserTitle"));
		Select drop1=new Select(dropDown1);
		drop1.selectByIndex(2);
		
		WebElement dropDown2=chrom.findElement(By.name("CompanyEmployees"));
		Select drop2=new Select(dropDown2);
		drop2.selectByIndex(2);
		

		WebElement dropDown3=chrom.findElement(By.name("CompanyCountry"));
		Select drop3=new Select(dropDown3);
		drop3.selectByIndex(40);
		
		chrom.close();
	}

}
