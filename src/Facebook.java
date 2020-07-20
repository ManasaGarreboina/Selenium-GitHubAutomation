import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		System.out.println(driver.getTitle());
	
		System.out.println(driver.getCurrentUrl());
		//  driver.navigate().to("https://www.youtube.com/");
		driver.findElement(By.cssSelector("input#email")).sendKeys("");
		driver.findElement(By.cssSelector("input#pass")).sendKeys("");
		driver.findElement(By.cssSelector("[value='Log In']")).click();

		driver.findElement(By.xpath("//*[@id='fbDockChatBuddylistNub']/a")).click();
		driver.findElement(By.xpath("//*[@id='chatsearch']/div[1]/span/label/input")).sendKeys("",Keys.ENTER);


		 driver.close();
		
	}

}
