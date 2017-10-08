package by.htp.news.service.impl;

import java.io.File;
import java.util.concurrent.TimeUnit;

import static org.junit.Assert.*;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestService {
	
	private WebDriver driver;
	private static final String URL = "http://localhost:8080/newsController/news";
	
	@FindBy(xpath="//*[@id=\"str2\"]/a")
	private WebElement addHref;
	
	@FindBy(xpath="//*[@id=\"newscontainer\"]/form/div[1]/a[1]")
	private WebElement viewHref;
	
	@BeforeClass
	public void initServiceNews() {
		File file = new File("c:\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		PageFactory.initElements(driver,this);
	}
	
	@Test(priority=1)
	public void listNewsTestHomepage() throws InterruptedException {
		driver.get(URL);
		assertEquals("News management", driver.getTitle());
	}
	
	@Test(priority=3)
	public void addNewsTest() throws InterruptedException {
		addHref.click();
		assertEquals("Add News Form", driver.getTitle());
	}
	
	@Test(priority=2)
	public void viewPageTest() throws InterruptedException {
		viewHref.click();
		assertEquals("Full News Page", driver.getTitle());
	}
	
	@AfterClass
	public void cleanParam() {
		driver.quit();
	}
}
