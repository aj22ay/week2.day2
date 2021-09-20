package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FaceBookLaunch {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver chrom=new ChromeDriver();
		chrom.manage().window().maximize();
		chrom.get( "https://en-gb.facebook.com/");
		chrom.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		chrom.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
		chrom.findElement(By.xpath("//input[@name='firstname']")).sendKeys("ajay");
		chrom.findElement(By.xpath("//input[@name='lastname']")).sendKeys("sekar");
		chrom.findElement(By.xpath("//input[@aria-label='Mobile number or email address']")).sendKeys("9874561239");
		chrom.findElement(By.xpath("//input[@id='password_step_input']")).sendKeys("aaa@1234");
		
		WebElement dropDown1=chrom.findElement(By.name("birthday_day"));
		Select drop1=new Select(dropDown1);
		drop1.selectByIndex(5);
		WebElement dropDown2=chrom.findElement(By.name("birthday_month"));
		Select drop2=new Select(dropDown2);
		drop2.selectByIndex(6);
		WebElement dropDown3=chrom.findElement(By.name("birthday_year"));
		Select drop3=new Select(dropDown3);
		drop3.selectByIndex(22);
		
		chrom.findElement(By.xpath("//label[text()='Male']")).click();
		
		
	}

}
