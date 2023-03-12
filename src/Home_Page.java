import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Home_Page {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\MyChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://saucedemo.com/");
		
		driver.manage().window().maximize();
		
		
		String user_name = "standard_user";
		String password = "secret_sauce";
		
		driver.findElement(By.xpath("//*[@id=\"user-name\"]")).sendKeys(user_name);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys(password);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
		
		String actualTitle = driver.getTitle();
		String expectedTitle = "Abooosek";
		
		Assert.assertEquals(actualTitle, expectedTitle);
		
//		if(actualTitle == expectedTitle) {
//			System.out.println("YES");
//		}
//		else {
//			System.out.println("NO");
//		}
		
		

	}

}
