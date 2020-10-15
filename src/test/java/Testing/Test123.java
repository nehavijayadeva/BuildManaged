package Testing;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Test123 {
	
@Test(priority=1)
public void test1() throws InterruptedException {
		// TODO Auto-generated method stub
	
WebDriverManager.chromedriver().setup();	
WebDriver driver=new ChromeDriver();
WebDriverWait wait = new WebDriverWait(driver, 30);
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
driver.get("http://Magento.com");
Thread.sleep(2000);

driver.findElement(By.xpath("//*[@id=\"block-header\"]/ul/li[9]/a/span[1]")).click();
driver.findElement(By.id("email")).sendKeys("nehavijay0@gmail.com");
driver.findElement(By.id("pass")).sendKeys("krishna1");
driver.findElement(By.id("send2")).click();
wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"maincontent\"]/div[2]/div[2]/div/div")));
String error=driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div[2]/div[2]/div/div")).getText();
System.out.println("error:"+error);
if (error.equals("Invalid login or password."))
{
System.out.println("sucess");
}
else
{
	System.out.println("failure");
}
}
	
	}


