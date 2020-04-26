package pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import wdMethods.ProjectMethods;
public class HPage extends ProjectMethods
{
	public HPage()
	{
		PageFactory.initElements(driver, this);
	}
	@FindBy(how = How.LINK_TEXT,using="CRM/SFA")
	WebElement crmsfa;
	public HPage clickCRMSFA()
	{
		click(crmsfa);
		return new HPage();
	}
}