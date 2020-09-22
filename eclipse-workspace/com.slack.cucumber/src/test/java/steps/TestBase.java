package steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Page.HomePage;
import Page.PostMessagePage;
import Page.SignInPage;

public class TestBase {
	
    public static WebDriver driver;
	public static SignInPage sip;
	public static HomePage hp;
	public static PostMessagePage pmp;
	
	public static void initialization() {
		System.setProperty("webdriver.chrome.driver","driver/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://qabird.slack.com");
	}
	
	public SignInPage getSignInPage() {
		sip=new SignInPage(driver);
		
		return sip;
	}
	
	public HomePage getHomePage() {
		hp=new HomePage(driver);
		
		return hp;
		
	}
    public PostMessagePage  getPostMessagePage() {
    	pmp=new PostMessagePage(driver);
    	
    	return pmp;
    }}
