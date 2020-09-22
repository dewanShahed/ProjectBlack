package Model;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class HomeModel extends ModelBase {

	public HomeModel(WebDriver d) {
		super(d);
		
	}
	    //User name validation
		public WebElement getUserValidation() {
			WebElement user=driver.findElement(By.xpath("//*[@class='p-ia__main_menu__user__name_container']/span"));
			return user;
		}
		
	public WebElement clickOnChannels() {
		WebElement random=driver.findElement(By.xpath("//*[@class='p-top_nav__right']/button/div/span"));
		return random;
	}
	
	public WebElement goGetChannels() {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Channels']")));
		WebElement medium=driver.findElement(By.xpath("//*[text()='Channels']"));
		return medium;
	}	
	
	public WebElement goAddChannels() {
		WebElement plus=driver.findElement(By.xpath("(//*[@class='p-channel_sidebar__section_heading_right'])[1]"));
		return plus;
	}
	 //
	 public List<WebElement> getAllchannel(){
	    	List<WebElement> netChannel=driver.findElements(By.xpath("//*[@class='p-channel_sidebar__name']"));
	    	return netChannel;
	    }
	
    public WebElement  goCreateChannel(){
	WebElement status=driver.findElement(By.xpath("//div[contains(text(),'Create a channel')]"));
	return status;

    }
    public WebElement contextClickButton() {
	      //*[text()='sunlight']
		  wait.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath("//*[text()='stardust']"),"stardust"));
		  WebElement rightClick=driver.findElement(By.xpath("//*[text()='stardust']"));
		  
	       return rightClick;
 }	
    }





