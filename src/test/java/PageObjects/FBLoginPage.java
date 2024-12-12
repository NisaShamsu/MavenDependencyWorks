package PageObjects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import testBase.BaseFBPage;
public class FBLoginPage extends BaseFBPage
{
	WebDriver driver;
	public FBLoginPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}		
	@FindBy(xpath ="//*[@id=\"email\"]")
	WebElement txt_Email;
	
	@FindBy(xpath ="//*[@id=\"pass\"]")
	WebElement txt_Password;
	
	@FindBy(name ="login")
	WebElement btn_Login;	
	
	public void clearFields()
	{
		txt_Email.clear();
		txt_Password.clear();
	}	
	public void setUsername(String uname)
	{
		txt_Email.sendKeys(uname);
	}	
	
	public void setPassword(String pswd)
	{
		txt_Password.sendKeys(pswd);
	}
	
	public void login()
	{
		btn_Login.click();
	}	
	
}
