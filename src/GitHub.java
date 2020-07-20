import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GitHub {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.get("https://github.com/");
		
		driver.findElement(By.xpath("/html/body/div[1]/header/div/div[2]/div[2]/a[1]")).click();
		
		driver.findElement(By.id("login_field")).sendKeys("ManasaGarreboina");
		
		driver.findElement(By.id("password")).sendKeys("spark@25");
		driver.findElement(By.xpath("//*[@id='login']/form/div[4]/input[9]")).click();
		
		driver.findElement(By.xpath("//*[@id='repos-container']/h2/a")).click();
		
		driver.findElement(By.xpath("//*[@id='repository_name']")).sendKeys("Sampletests1");
		
		driver.findElement(By.id("repository_description")).sendKeys("sample for selenium");
		
		
		WebElement check_box= driver.findElement(By.id("repository_visibility_public"));
		if(!check_box.isSelected())
		    check_box.click();
		
		driver.findElement(By.xpath("//*[@id='repository_auto_init']")).click();
		
		driver.findElement(By.xpath("//*[@class='btn btn-primary first-in-line']")).click();
		
		
		driver.findElement(By.xpath("//*[@class='details-overlay details-reset js-feature-preview-indicator-container']")).click();
		driver.findElement(By.xpath("//*[@class='dropdown-item dropdown-signout']")).click();
	}
}
