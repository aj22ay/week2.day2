package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AcmeTest {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver chrom=new ChromeDriver();
		chrom.manage().window().maximize();
		chrom.get("https://acme-test.uipath.com/login");
		chrom.findElement(By.xpath("//input[@id='email']")).sendKeys("kumar.testleaf@gmail.com");
		chrom.findElement(By.xpath("//input[@id='password']")).sendKeys("leaf@12");
		chrom.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		
		String title=chrom.getTitle();
		System.out.println(title);
		
		chrom.findElement(By.xpath("//a[text()='Log Out']")).click();
		
		chrom.close();
	}

}
