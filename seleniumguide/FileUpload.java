import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/home/aditya/Downloads/chromedriver_linux64/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/upload/#google_vignette");
		driver.findElement(By.id("uploadfile_0")).sendKeys("/home/aditya/test.txt");
		driver.findElement(By.id("submitbutton")).click();
		// String result = driver.findElement(By.id("res")).getText();
		List<WebElement> buttons = driver.findElements(By.id("res"));
		for (int i = 0; i < buttons.size(); i++) {
			String string = buttons.get(i).getText();
			System.out.println(string);
		}
		System.out.println("done");
		driver.close();

	}

}
