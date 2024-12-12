package testCases;

import java.io.IOException;
import org.testng.annotations.Test;
import PageObjects.FBLoginPage;
import testBase.BaseFBPage;
import utilities.FBUtils;

public class FBLoginTest extends BaseFBPage
{	
	@Test
	public void login() throws IOException, InterruptedException
	{		
		FBLoginPage login=new FBLoginPage(driver);
		FBUtils excel=new FBUtils("C:\\Users\\user\\Desktop\\Book.xlsx");
		int rowCount=excel.getRowCount();
		for(int i=1;i<=rowCount;i++)
		{
			String userName=excel.getCellData(i,0);
			System.out.println("Username  ="+userName);
			String passWord=excel.getCellData(i,1);
			System.out.println("Password is "+passWord);
			
			
			login.clearFields();
			login.setUsername(userName);
			login.setPassword(passWord);
			Thread.sleep(2000);
			login.login();				
		}
	}	
}
