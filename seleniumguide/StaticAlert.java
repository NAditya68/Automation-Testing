import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaticAlert {
	public static void main(String args[]) {
		System.setProperty("webdriver.chrome.driver", "/home/aditya/Downloads/chromedriver_linux64/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.id("name")).sendKeys("aditya");
		driver.findElement(By.id("alertbtn")).click();
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.accept();
		driver.findElement(By.id("name")).sendKeys("aditya");
		driver.findElement(By.id("confirmbtn")).click();
		System.out.println(alert.getText());
		alert.dismiss();

	}

}
