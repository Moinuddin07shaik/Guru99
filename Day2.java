package Guru99;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("http://live.techpanda.org/index.php/");
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
        driver.findElement(By.xpath("//a[text()='Mobile']")).click();
        
       String data = driver.findElement(By.xpath("//span[text()='$100.00']")).getText();
       System.out.println(data);
       
       driver.findElement(By.xpath("//a[@title='Sony Xperia']")).click();
       Thread.sleep(2000);
       
       String data1 = driver.findElement(By.xpath("//span[text()='$100.00']")).getText();
       
       System.out.println(data1);
       
       if(data.equals(data1)) {
    	   
    	   System.out.println("sony mobile cost is matched ");
       }
       else {
    	   System.out.println("sony mobile cost didno't matched");
    	   }
       driver.close();
       }
}


       
