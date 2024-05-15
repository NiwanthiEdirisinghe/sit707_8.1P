package web.service;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class LoginServiceTest {
	
	private void sleep(long sec) {
		try {
			Thread.sleep(sec*1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Test
	public void testLoginSuccess() {
	    System.setProperty(
	            "webdriver.chrome.driver", 
	            "E:\\New folder\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
	    
	    WebDriver driver = new ChromeDriver();        
	    System.out.println("Driver info: " + driver);
	    
	    driver.navigate().to("file:///E:/New folder/8.1P-resources/pages/login.html");

	    sleep(5);
	    
	    // Find username element
	    WebElement usernameField = driver.findElement(By.id("username"));
	    usernameField.clear();
	    usernameField.sendKeys("ahsan");
	    
	    // Find password element
	    WebElement passwordField = driver.findElement(By.id("passwd"));
	    passwordField.clear();
	    passwordField.sendKeys("ahsan_pass");
	    
	    // Find dob element
	    WebElement dobField = driver.findElement(By.id("dob"));
	    dobField.clear();
	    dobField.sendKeys("08-10-1995");
	    
	    // Find Submit button, and click on button.
	    WebElement submitButton = driver.findElement(By.cssSelector("[type=submit]"));
	    submitButton.click();
	    
	    sleep(5);
	    
	    // Check the title of the page after login
	    String title = driver.getTitle();
	    System.out.println("Title: " + title);
	    
	    Assert.assertEquals("success", title);
	    
	    driver.close();
	}
	
	@Test
	public void testInvalidPassword() {
	    System.setProperty(
	            "webdriver.chrome.driver", 
	            "E:\\New folder\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
	    
	    WebDriver driver = new ChromeDriver();        
	    System.out.println("Driver info: " + driver);
	    
	    driver.navigate().to("file:///E:/New folder/8.1P-resources/pages/login.html");

	    sleep(5);
	    
	    // Find username element
	    WebElement usernameField = driver.findElement(By.id("username"));
	    usernameField.clear();
	    usernameField.sendKeys("ahsan");
	    
	    // Find password element
	    WebElement passwordField = driver.findElement(By.id("passwd"));
	    passwordField.clear();
	    passwordField.sendKeys("invalidpassword"); // Set an invalid password
	    
	    // Find dob element
	    WebElement dobField = driver.findElement(By.id("dob"));
	    dobField.clear();
	    dobField.sendKeys("1995-10-08");
	    
	    // Find Submit button, and click on button.
	    WebElement submitButton = driver.findElement(By.cssSelector("[type=submit]"));
	    submitButton.click();
	    
	    sleep(5);
	    
	    // Check the title of the page after login
	    String title = driver.getTitle();
	    System.out.println("Title: " + title);
	    
	    Assert.assertNotEquals("success", title); // Assert that the login is not successful
	    
	    driver.close();
	}
	
	@Test
	public void testInvalidUsername() {
	    System.setProperty(
	            "webdriver.chrome.driver", 
	            "E:\\New folder\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
	    
	    WebDriver driver = new ChromeDriver();        
	    System.out.println("Driver info: " + driver);
	    
	    driver.navigate().to("file:///E:/New folder/8.1P-resources/pages/login.html");

	    sleep(5);
	    
	    // Find username element
	    WebElement usernameField = driver.findElement(By.id("username"));
	    usernameField.clear();
	    usernameField.sendKeys("invalidusername"); // Set an invalid username
	    
	    // Find password element
	    WebElement passwordField = driver.findElement(By.id("passwd"));
	    passwordField.clear();
	    passwordField.sendKeys("ahsan_pass");
	    
	    // Find dob element
	    WebElement dobField = driver.findElement(By.id("dob"));
	    dobField.clear();
	    dobField.sendKeys("1995-10-08");
	    
	    // Find Submit button, and click on button.
	    WebElement submitButton = driver.findElement(By.cssSelector("[type=submit]"));
	    submitButton.click();
	    
	    sleep(5);
	    
	    // Check the title of the page after login
	    String title = driver.getTitle();
	    System.out.println("Title: " + title);
	    
	    Assert.assertNotEquals("success", title); // Assert that the login is not successful
	    
	    driver.close();
	}
	
	@Test
	public void testInvalidDOB() {
	    System.setProperty(
	            "webdriver.chrome.driver", 
	            "E:\\New folder\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
	    
	    WebDriver driver = new ChromeDriver();        
	    System.out.println("Driver info: " + driver);
	    
	    driver.navigate().to("file:///E:/New folder/8.1P-resources/pages/login.html");

	    sleep(5);
	    
	    // Find username element
	    WebElement usernameField = driver.findElement(By.id("username"));
	    usernameField.clear();
	    usernameField.sendKeys("ahsan");
	    
	    // Find password element
	    WebElement passwordField = driver.findElement(By.id("passwd"));
	    passwordField.clear();
	    passwordField.sendKeys("ahsan_pass");
	    
	    // Find dob element
	    WebElement dobField = driver.findElement(By.id("dob"));
	    dobField.clear();
	    dobField.sendKeys("invalid_date"); // Set an invalid date of birth
	    
	    // Find Submit button, and click on button.
	    WebElement submitButton = driver.findElement(By.cssSelector("[type=submit]"));
	    submitButton.click();
	    
	    sleep(5);
	    
	    // Check the title of the page after login
	    String title = driver.getTitle();
	    System.out.println("Title: " + title);
	    
	    Assert.assertNotEquals("success", title); // Assert that the login is not successful
	    
	    driver.close();
	}
	
	@Test
	public void testInvalidPasswordAndDOB() {
	    System.setProperty(
	            "webdriver.chrome.driver", 
	            "E:\\New folder\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
	    
	    WebDriver driver = new ChromeDriver();        
	    System.out.println("Driver info: " + driver);
	    
	    driver.navigate().to("file:///E:/New folder/8.1P-resources/pages/login.html");

	    sleep(5);
	    
	    // Find username element
	    WebElement usernameField = driver.findElement(By.id("username"));
	    usernameField.clear();
	    usernameField.sendKeys("ahsan");
	    
	    // Find password element
	    WebElement passwordField = driver.findElement(By.id("passwd"));
	    passwordField.clear();
	    passwordField.sendKeys("invalidpassword"); // Set an invalid password
	    
	    // Find dob element
	    WebElement dobField = driver.findElement(By.id("dob"));
	    dobField.clear();
	    dobField.sendKeys("invalid_date"); // Set an invalid date of birth
	    
	    // Find Submit button, and click on button.
	    WebElement submitButton = driver.findElement(By.cssSelector("[type=submit]"));
	    submitButton.click();
	    
	    sleep(5);
	    
	    // Check the title of the page after login
	    String title = driver.getTitle();
	    System.out.println("Title: " + title);
	    
	    Assert.assertNotEquals("success", title); // Assert that the login is not successful
	    
	    driver.close();
	}
	
	@Test
	public void testInvalidUsernameAndDOB() {
	    System.setProperty(
	            "webdriver.chrome.driver", 
	            "E:\\New folder\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
	    
	    WebDriver driver = new ChromeDriver();        
	    System.out.println("Driver info: " + driver);
	    
	    driver.navigate().to("file:///E:/New folder/8.1P-resources/pages/login.html");

	    sleep(5);
	    
	    // Find username element
	    WebElement usernameField = driver.findElement(By.id("username"));
	    usernameField.clear();
	    usernameField.sendKeys("invalidusername"); // Set an invalid username
	    
	    // Find password element
	    WebElement passwordField = driver.findElement(By.id("passwd"));
	    passwordField.clear();
	    passwordField.sendKeys("ahsan_pass");
	    
	    // Find dob element
	    WebElement dobField = driver.findElement(By.id("dob"));
	    dobField.clear();
	    dobField.sendKeys("invalid_date"); // Set an invalid date of birth
	    
	    // Find Submit button, and click on button.
	    WebElement submitButton = driver.findElement(By.cssSelector("[type=submit]"));
	    submitButton.click();
	    
	    sleep(5);
	    
	    // Check the title of the page after login
	    String title = driver.getTitle();
	    System.out.println("Title: " + title);
	    
	    Assert.assertNotEquals("success", title); // Assert that the login is not successful
	    
	    driver.close();
	}
	
	@Test
	public void testInvalidUsernameAndPassword() {
	    System.setProperty(
	            "webdriver.chrome.driver", 
	            "E:\\New folder\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
	    
	    WebDriver driver = new ChromeDriver();        
	    System.out.println("Driver info: " + driver);
	    
	    driver.navigate().to("file:///E:/New folder/8.1P-resources/pages/login.html");

	    sleep(5);
	    
	    // Find username element
	    WebElement usernameField = driver.findElement(By.id("username"));
	    usernameField.clear();
	    usernameField.sendKeys("invalidusername"); // Set an invalid username
	    
	    // Find password element
	    WebElement passwordField = driver.findElement(By.id("passwd"));
	    passwordField.clear();
	    passwordField.sendKeys("invalidpassword"); // Set an invalid password
	    
	    // Find dob element
	    WebElement dobField = driver.findElement(By.id("dob"));
	    dobField.clear();
	    dobField.sendKeys("1995-10-08"); // Set a valid date of birth
	    
	    // Find Submit button, and click on button.
	    WebElement submitButton = driver.findElement(By.cssSelector("[type=submit]"));
	    submitButton.click();
	    
	    sleep(5);
	    
	    // Check the title of the page after login
	    String title = driver.getTitle();
	    System.out.println("Title: " + title);
	    
	    Assert.assertNotEquals("success", title); // Assert that the login is not successful
	    
	    driver.close();
	}

	@Test
	public void testInvalidUsernameAndPasswordAndDob() {
	    System.setProperty(
	            "webdriver.chrome.driver", 
	            "E:\\New folder\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
	    
	    WebDriver driver = new ChromeDriver();        
	    System.out.println("Driver info: " + driver);
	    
	    driver.navigate().to("file:///E:/New folder/8.1P-resources/pages/login.html");

	    sleep(5);
	    
	    // Find username element
	    WebElement usernameField = driver.findElement(By.id("username"));
	    usernameField.clear();
	    usernameField.sendKeys("invalidusername"); // Set an invalid username
	    
	    // Find password element
	    WebElement passwordField = driver.findElement(By.id("passwd"));
	    passwordField.clear();
	    passwordField.sendKeys("invalidpassword"); // Set an invalid password
	    
	    // Find dob element
	    WebElement dobField = driver.findElement(By.id("dob"));
	    dobField.clear();
	    dobField.sendKeys("2015-10-08"); // Set a valid date of birth
	    
	    // Find Submit button, and click on button.
	    WebElement submitButton = driver.findElement(By.cssSelector("[type=submit]"));
	    submitButton.click();
	    
	    sleep(5);
	    
	    // Check the title of the page after login
	    String title = driver.getTitle();
	    System.out.println("Title: " + title);
	    
	    Assert.assertNotEquals("success", title); // Assert that the login is not successful
	    
	    driver.close();
	}
	
}
