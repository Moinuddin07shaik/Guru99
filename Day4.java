package Guru99;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day4 {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("http://live.techpanda.org/index.php/");
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
        driver.findElement(By.xpath("//a[text()='Mobile']")).click();
        
        driver.findElement(By.xpath("(//a[text()='Add to Compare'])[1]")).click();
        
      String mainmobile1 =  driver.findElement(By.xpath("//h2/a[@title='IPhone']")).getText();
      
      System.out.println(mainmobile1);
      
      driver.findElement(By.xpath("(//a[text()='Add to Compare'])[2]")).click();

      String mainmobile2 =  driver.findElement(By.xpath("//h2/a[@title='Samsung Galaxy']")).getText();
      
      System.out.println(mainmobile2);
      driver.findElement(By.xpath("//button[@title='Compare']")).click();
        
      for(String handle:driver.getWindowHandles()){
    	  driver.switchTo().window(handle);
    	  
      }
        String hed = "COMPARE PRODUCTS";
        String tophed = driver.findElement(By.xpath("//h1[text()='Compare Products']")).getText();
        System.out.println(tophed);
        
        String compmobile1 =  driver.findElement(By.xpath("//h2/a[@title='IPhone']")).getText();
        
        System.out.println(compmobile1);
        String compmobile2 =  driver.findElement(By.xpath("//h2/a[@title='Samsung Galaxy']")).getText();
        
        System.out.println(compmobile2);
        
        if(hed.equals(tophed)) {
        	System.out.println("The two products was compare done");
        }
        else {
        	System.out.println("The two products was not compare");
        }
        
        if(mainmobile1.equals(compmobile1)) {
        	System.out.println("IPHONE products are compare");
        }
        else {
        	System.out.println("products are  not compare");
        }
        if(mainmobile2.equals(compmobile2)) {
        	System.out.println("SAMSUNG GALAXY products are compare");
        }
        else {
        	System.out.println("both products are  not compare");
        }
        driver.findElement(By.xpath("//span[text()='Close Window']")).click();
        
        for(String handle:driver.getWindowHandles()){
      	  driver.switchTo().window(handle);
      	  
        }
        driver.close();
	}

}
