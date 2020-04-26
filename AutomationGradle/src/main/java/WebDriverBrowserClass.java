import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class WebDriverBrowserClass
{
public static void main(String hd[])
{
	System.out.println("Lord Balaji");
	System.setProperty("webdriver.gecko.driver", "C:\\Users\\HARISH\\Downloads\\geckodriver-v0.26.0-win64\\geckodriver.exe");
	WebDriver driver = new FirefoxDriver();
	driver.get("https://www.google.co.in/search?q=lord+balaji+with+mother&source=lnms&tbm=isch&sa=X&ved=2ahUKEwi7wqO0s-fnAhXZSH0KHUaeB4UQ_AUoAXoECA4QAw&biw=1366&bih=657");
	driver.close();
}
}