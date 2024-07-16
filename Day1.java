package Guru99;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Day1 {
	static String namelist1;
	static String namelist2;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("http://live.techpanda.org/index.php/");
		driver.manage().window().maximize();
		if(driver.getTitle().equals("Home page")) {
			System.out.println("Home page title was matched");
		}
		else {
			System.out.println("Home page title was not matched");
		}
		
		Thread.sleep(3000);
        driver.findElement(By.xpath("//a[text()='Mobile']")).click();
        if(driver.getTitle().equals("Mobile")) {
        	System.out.println("Mobile title is matched");
        }
        else {
        	System.out.println("Mobile title was not matched");
        }
        List<WebElement> blist1 = driver.findElements(By.xpath("//h2[@class='product-name']"));
        System.out.println("size"+blist1.size());
        for(int l=0; l<blist1.size();l++) {
        	WebElement data1 = blist1.get(l);
        	 namelist1 = data1.getText();
        	System.out.println(namelist1);
        }
       WebElement sort = driver.findElement(By.xpath("(//select[@title='Sort By'])[1]"));
        Select sel = new Select(sort);
        sel.selectByIndex(1);
        Thread.sleep(2000);
        
        List<WebElement> blist2 = driver.findElements(By.xpath("//h2[@class='product-name']"));
        System.out.println("size"+blist2.size());
        for(int j=0; j<blist2.size();j++) {
        	Thread.sleep(2000);
        	WebElement data2 = blist2.get(j);
        	 namelist2 = data2.getText();
        	System.out.println(namelist2);
        }  	
        if(namelist1==namelist2) {
        	System.out.println("Mobile sort was not done, fail");
        	
        }
        else {
        	System.out.println("Mobile sort was  done, pass");
        }
       driver.close();
	}

}

