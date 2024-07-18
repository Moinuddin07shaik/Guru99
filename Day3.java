package Guru99;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day3 {
	  static String error = "* The maximum quantity allowed for purchase is 500.";
	   static String emt ="You have no items in your shopping cart.";

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("http://live.techpanda.org/index.php/");
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
        driver.findElement(By.xpath("//a[text()='Mobile']")).click();
        driver.findElement(By.xpath("//img[@alt='Xperia']/ancestor::a/following-sibling::div/descendant::button")).click();
        Thread.sleep(2000);
      WebElement update =  driver.findElement(By.xpath("//button[@title='Update']/preceding-sibling::input"));
        update.clear();
        update.sendKeys("1000");
        driver.findElement(By.xpath("//button[@title='Update']")).click();
        
       String errormsg = driver.findElement(By.xpath("//p[@class='item-msg error']")).getText();
       System.out.println(errormsg);
       
       if(errormsg.equals(error)) {
    	   System.out.println("more than 500 product not to allowed for purchase");
    	   
       }
       else {
    	   System.out.println("more than 500 product can allowed for purchase");
       }
       
       driver.findElement(By.xpath("(//a[@class=\"btn-remove btn-remove2\"])[2]")).click();
       driver.findElement(By.xpath("//span[text()='Cart']")).click();
       
     String cartemt =  driver.findElement(By.xpath("//p[@class='block-subtitle']/following-sibling::p")).getText();
     System.out.println(cartemt);
     
     if(cartemt.equals(emt)) {
    	 System.out.println("you have no product in cart");
     }
     else {
    	 System.out.println("you have product in cart");
     }
     driver.close();
	}

}
