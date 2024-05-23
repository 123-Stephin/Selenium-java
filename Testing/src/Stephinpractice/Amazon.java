package Stephinpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().getImplicitWaitTimeout();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).click();
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Iphone 15 Pro Max");
		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		driver.findElement(By.xpath("//a[@id='nav-link-accountList']")).click();
		//login with email
		driver.findElement(By.xpath("(//input[@id='ap_email'])[1]")).sendKeys("stephinphilip270@gmail.com");
		driver.findElement(By.xpath("//input[@id='continue']")).click();
		
		//pswd resetting
//		driver.findElement(By.xpath("//a[@id='auth-fpp-link-bottom']")).click();
//		driver.findElement(By.xpath("//input[@id='continue']")).click();
//		driver.findElement(By.xpath("(//input[@id='cvf-input-code'])[1]")).sendKeys("686799");
//		driver.findElement(By.xpath("//input[@aria-label='Verify OTP Button']")).click();
		
		//login with paswd
		driver.findElement(By.xpath("//input[@id='ap_password']")).sendKeys("123456@Stephin");
		driver.findElement(By.xpath("//input[@id='signInSubmit']")).click();
		
		driver.findElement(By.xpath("//a[@aria-label='Go to detail page for \"Apple iPhone 15 Pro Max (256 GB) - Blue Titanium.\" Eligible for Prime.']")).click();
		driver.findElement(By.xpath("(//a[text()= 'Amazon Pay'])[1]")).click();

	}

}
