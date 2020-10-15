package Testing;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class medical {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.get("http:\\demo.openemr.io/a/openemr");
	driver.findElement(By.id("authUser")).sendKeys("admin");
	driver.findElement(By.id("clearPass")).sendKeys("pass");
	driver.findElement(By.xpath("//*[@id=\"login_form\"]/div[3]/div[1]/div[5]/button")).click();
	Actions act=new Actions(driver);
	act.moveToElement(driver.findElement(By.xpath("//*[@id=\"menu_logo\"]/div/div/span[5]/div/div"))).perform();
	driver.findElement(By.xpath("//*[@id=\"menu_logo\"]/div/div/span[5]/div/ul/li[2]/div")).click();
	Thread.sleep(3000);
	driver.switchTo().frame(driver.findElement(By.name("pat")));
	driver.findElement(By.id("form_fname")).sendKeys("neha");
	driver.findElement(By.id("form_lname")).sendKeys("vijay");
	driver.findElement(By.id("form_DOB")).click();
	Thread.sleep(3000);
	driver.findElement(By.className("xdsoft_today")).click();
	driver.findElement(By.id("form_pubpid")).sendKeys("123");
	Select gender=new Select(driver.findElement(By.id("form_sex")));
	gender.selectByVisibleText("Female");
	driver.findElement(By.id("form_drivers_license")).sendKeys("1234567");
	Select maritalstatus=new Select(driver.findElement(By.id("form_status")));
	maritalstatus.selectByVisibleText("Married");
	driver.findElement(By.id("create")).click();
	driver.switchTo().defaultContent();
	
	driver.switchTo().frame(driver.findElement(By.id("modalframe")));
	driver.findElement(By.xpath("/html/body/center/input")).click();
	driver.switchTo().defaultContent();
	
	driver.findElement(By.name("bdayreminder"));
	System.out.println(driver.switchTo().alert().getText());
	driver.switchTo().alert().accept();
	
	driver.findElement(By.className("closeDlgIframe")).click();
	
	act.moveToElement(driver.findElement(By.id("username"))).perform();
	driver.findElement(By.xpath("//*[@id=\"username\"]/div/ul/li[4]")).click();
	driver.quit();
	
	
	
	
	
	
	}}
	
	
	

		


