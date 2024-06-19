package Rahulshetty;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class loginPage {

	public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.get("https://rahulshettyacademy.com/locatorspractice/");
	driver.manage().window().maximize();
	System.out.println(driver.getTitle());
	driver.findElement(By.id("inputUsername")).sendKeys("rahulshettyacademy");
	driver.findElement(By.name("inputPassword")).sendKeys("rahulshettyacademy");
	driver.findElement(By.cssSelector("input[value='rmbrUsername']")).click();
	driver.findElement(By.cssSelector("input[value='agreeTerms']")).click();
	driver.findElement(By.linkText("Forgot your password?")).click();
	driver.findElement(By.cssSelector("input[placeholder='Name']")).sendKeys("Vidhya");
	driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("123Happy");
	driver.findElement(By.xpath("//form/input[3]")).sendKeys("0123456789");
	Thread.sleep(3000);
	driver.findElement(By.cssSelector(".go-to-login-btn")).click();
	System.out.println("Done");
	//driver.quit();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//*[text()='Sign In']")).click();
	Thread.sleep(2000);
	System.out.println(driver.findElement(By.xpath("//div/h1")).getText());
	System.out.println(driver.findElement(By.xpath("//*[text()='You are successfully logged in.']")).getText());
	driver.findElement(By.className("logout-btn")).click();
	driver.quit();
	}

}
