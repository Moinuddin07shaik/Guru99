package Guru99;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day5 {
	
	 static  String firstName = "Moinuddin";
	 static  String lastName =   "Shaik";

	public static void main(String[] args) throws InterruptedException {
        
		WebDriver driver = new ChromeDriver();
		driver.get("http://live.techpanda.org/index.php/");
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("(//a[@title='My Account'])[2]")).click();
		
		driver.findElement(By.xpath("//span[text()='Create an Account']")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='firstname']")).sendKeys(firstName);
		driver.findElement(By.xpath("//input[@id='lastname']")).sendKeys(lastName);
		
		driver.findElement(By.xpath("//input[@id='email_address']")).sendKeys("moinuddinshaik7089@gmail.com");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Shaik@7089");
		driver.findElement(By.xpath("//input[@id='confirmation']")).sendKeys("Shaik@7089");
		
		driver.findElement(By.xpath("//button[@title='Register']")).click();
		
	    String vWelcome = ("WELCOME, " + firstName + " " + lastName + "!");

		String welcomemessg = driver.findElement(By.xpath("//p[@class='welcome-msg']")).getText();
		
		System.out.println(welcomemessg);
		
		if(vWelcome.equals(welcomemessg)) {
			
			System.out.println("verify Registration is done");
		}
		else {
			System.out.println("Not register");
		}
		driver.findElement(By.xpath("//a[text()='TV']")).click();
		
		driver.findElement(By.xpath("(//a[text()='Add to Wishlist'])[1]")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@title='Share Wishlist']")).click();
		
		driver.findElement(By.xpath("//textarea[@id='email_address']")).sendKeys("moinuddinshaik7089@gmail.com");
		
		driver.findElement(By.xpath("//textarea[@id='message']")).sendKeys("Hey Moin !! this LCD TV looks ok, check it out !!..");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//span[text()='Share Wishlist']")).click();
		
	    String vWishList = "Your Wishlist has been shared.";
	    String Wishlist = driver.findElement(By.xpath("//span[text()='Your Wishlist has been shared.']")).getText();
	    
	    System.out.println(Wishlist);
	    
	    if(vWishList.equals(Wishlist)) {
	    	System.out.println("your wishlist has been shared");
	    	
	    }
	    else {
	    	System.out.println("your wishlist not been shared");
	    }
	    
	    driver.close();

		
	}

}
