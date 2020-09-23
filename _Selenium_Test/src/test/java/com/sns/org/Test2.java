package com.sns.org;

import java.sql.Driver;
import java.util.ArrayList;
import java.util.List;

import org.omg.CORBA.PUBLIC_MEMBER;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Test2 {
	WebDriver driver;
	JavascriptExecutor js;
	WebElement element;
	Actions builder;
	@BeforeClass
	public void Openclass() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Vijayalakshmi\\selenium\\chromedriver.exe");
		driver=new ChromeDriver();
		 js = (JavascriptExecutor) driver;
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		}
	
	@Test(priority=1)
	public void Task1() {
		System.out.println("\n*****Select 3rd Radio Button*****\n");
		//*****Select 3rd Radio Button*****\
		driver.findElement(By.xpath("//*[@id=\"radio-btn-example\"]/fieldset/label[3]/input")).click();
	}
	
	@Test(priority=2)
	public void Task2() throws InterruptedException {
		driver.findElement(By.xpath("//*[@id=\"autocomplete\"]")).sendKeys("India");
		//Select 3rd Radio Button
		Thread.sleep(1000);
		Actions act = new Actions(driver);
		act.sendKeys(Keys.DOWN).perform();
		act.sendKeys(Keys.DOWN).perform();
	    act.sendKeys(Keys.ENTER).perform();
	    
	    System.out.println("\n****Type and select Country as a India*****\\n");
	//****Type and select Country as a India*****
	    //****Type and select Country as a India
	    
	}
	
	@Test(priority=3)
	public void Task3() {
		 Select DropDownn=new Select(driver.findElement(By.name("dropdown-class-example"))) ;
		    DropDownn.selectByIndex(2);
		   
	}
	
	@Test(priority=4)
	public void Task4() {
		 driver.findElement(By.xpath("//*[@id=\"checkBoxOption1\"]")).click();
		    driver.findElement(By.xpath("//*[@id=\"checkBoxOption2\"]")).click();
		    driver.findElement(By.xpath("//*[@id=\"checkBoxOption3\"]")).click();
		    System.out.println("\n*****\n****Select all checkbox");
		//****Select all checkbox
		   
	}
	
	@Test(priority=5)
	public void Task5() throws Exception{
		  driver.findElement(By.xpath("//*[@id=\"openwindow\"]")).click();
		    String parentwindow=driver.getWindowHandle();
		    for (String childWindow:driver.getWindowHandles()) {
				driver.switchTo().window(childWindow);
				Thread.sleep(3000);
			}
		    driver.switchTo().window(parentwindow);
		    Thread.sleep(2000);
		    
	}
	
	@Test(priority=6)
	public void Task6() throws InterruptedException {
		driver.findElement(By.xpath("//*[@id=\"opentab\"]")).click();
	    System.out.println("\n*****\n****Switch window operation*****\n");
	//****Switch window operation*****
	    ArrayList tabs=new ArrayList(driver.getWindowHandles());
	     driver.switchTo().window((String) tabs.get(1));
	     Thread.sleep(2000);
	     driver.switchTo().window((String) tabs.get(0));
	    
	    
	    System.out.println("\n*****\n****Switch Tab Operation*****\n");
	    
	}
	
	@Test(priority=7)
	public void Task7() throws InterruptedException {
		driver.findElement(By.xpath("//*[@id=\"name\"]")).sendKeys("Sundharalingam");
		driver.findElement(By.xpath("//*[@id=\"alertbtn\"]")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		System.out.println("\n*****Clicking Ok Button");
	//*****Clicking Ok Button
	}
	
	@Test(priority=8)
	public void Task8() throws InterruptedException {
		 driver.findElement(By.xpath("//*[@id=\"name\"]")).sendKeys("Sundharalingam");
			driver.findElement(By.xpath("//*[@id=\"confirmbtn\"]")).click();
			Thread.sleep(2000);
			driver.switchTo().alert().dismiss();
			System.out.println("\n*****Clicking cancel from confirm Button*****\n");
			//*****Clicking cancel from confirm Button*****
	}
	
	@Test(priority=9)
	public void Task9() throws InterruptedException {
		WebElement element1  = driver.findElement(By.xpath("//table[@id='product']"));
		List<WebElement> l = element1.findElements(By.tagName("td"));
		 for (int i = 0; i<l.size(); i++){
				System.out.println("\n*****\n****Printing a Table contant*****\n");
//****Printing a Table contant*****
			 int j=(i+1)%3;
			 System.out.print(" "+l.get(i).getText());

			 switch (j) {
			 case 0:
				 System.out.print("\n");
				 break;
			 case 1:
				 System.out.print("\t");
				 break;
			 case 2:
				 System.out.print("\t");
				 break;
			default:
				System.out.print("\t");
			 break;
			
			 }}}
	@Test(priority=10)
	public void Task10() {
		System.out.println("\n****Type Sundharalingam in Displayed Text*****\n");
		//****Type Sundharalingam in Displayed Text*****\n");
			 driver.findElement(By.xpath("//*[@id=\"displayed-text\"]")).sendKeys("Sundharalingam");
				System.out.println("\n****Hiding*****\n");
//****Hiding*****
	}
	
	@Test(priority=11)
	public void Task11() {
		driver.findElement(By.xpath("//*[@id=\"hide-textbox\"]")).click();
		System.out.println("\n****Showing*****\n");
		//***Showing*****
			 driver.findElement(By.xpath("//*[@id=\"show-textbox\"]")).click();
				System.out.println("\n****Moving curser*****\n");
//****Moving curser*****

	}
	@Test(priority=12)
	public void Task12() {
		WebElement Element = driver.findElement(By.xpath("/html/body/div[4]/div/fieldset/legend"));
			js.executeScript("arguments[0].scrollIntoView();", Element);
			System.out.println("\n*****\n****\n****Mouse Hover Top*****\n");
//****Mouse Hover Top*****
		
			builder = new Actions(driver);
			  element = driver.findElement(By.xpath("//*[@id=\"mousehover\"]"));
			 builder.moveToElement(element).clickAndHold().build().perform();
			 
			 driver.findElement(By.xpath("/html/body/div[4]/div/fieldset/div/div/a[1]")).click();
				

	}
	
	@Test(priority=13)
	public void Task13(){
		//****Mouse Hover Reload*****
		System.out.println("****Mouse Hover Reload*****\n");
		WebElement Element = driver.findElement(By.xpath("/html/body/div[4]/div/fieldset/legend"));
		
			js.executeScript("arguments[0].scrollIntoView();", Element);	
			  element = driver.findElement(By.xpath("//*[@id=\"mousehover\"]"));
				 builder.moveToElement(element).clickAndHold().build().perform();
				 
		 driver.findElement(By.xpath("/html/body/div[4]/div/fieldset/div/div/a[2]")).click();
		
	}
	
	@Test(priority=14)
	public void Task14() {
		WebElement Element = driver.findElement(By.xpath(" /html/body/div[5]/fieldset/legend"));
			js.executeScript("arguments[0].scrollIntoView();", Element);	
			
							    driver.switchTo().frame("courses-iframe"); // Switching to innerframe
							    System.out.println("\n****Switching Frame*****\n");
							    //****Switching Frame*****
							    System.out.println("\n****select About from Inner frame*****\n");
				
	}
	
	@Test(priority=15)
	public void Test15() {
		//****select About from Inner frame*****
	    
	    driver.findElement(By.xpath("/html/body/app-root/div/header/div[2]/div/div/div[2]/nav/div[2]/ul/li[8]/a")).click();

	}
	
	@AfterClass
	public void CloseClass() {
		driver.quit();
	}
	
	
	
}
