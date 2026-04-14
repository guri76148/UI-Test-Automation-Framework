package com.ui.tests;


import static com.constants.Browser.*;

import static org.testng.Assert.*;

import org.apache.logging.log4j.Logger;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.ui.pages.HomePage;
import com.ui.pojo.User;
import com.utility.LoggerUtility;



@Listeners({com.ui.listeners.TestListeners.class})
public class LoginTest extends TestBase{

	Logger logger = LoggerUtility.getLogger(this.getClass());
	
	
	@Test (description = "Verify with the valid user is able to login into application", groups = {"e2e", "sanity"}, 
			dataProviderClass = com.ui.dataproviders.LoginDataProvider.class, dataProvider = "LoginTestDataProvider")
	public void loginTest(User user) {
	 
		assertEquals(homePage.goToLoginPage().doLoginWith(user.getEmailAddress(), user.getPassword()).getUserName(), "Guri Singh");
	}

	
	/*
	 * @Test (description =
	 * "Verify with the valid user is able to login into application", groups =
	 * {"e2e", "sanity"}, dataProviderClass =
	 * com.ui.dataproviders.LoginDataProvider.class, dataProvider =
	 * "LoginTestCSVDataProvider", retryAnalyzer=
	 * com.ui.listeners.MyRetryAnalyser.class) public void loginCSVTest(User user) {
	 * assertEquals(homePage.goToLoginPage().doLoginWith(user.getEmailAddress(),
	 * user.getPassword()).getUserName(), "Guri Singh");
	 * 
	 * }
	 * 
	 * @Test (description =
	 * "Verify with the valid user is able to login into application", groups =
	 * {"e2e", "sanity"}, dataProviderClass =
	 * com.ui.dataproviders.LoginDataProvider.class, dataProvider =
	 * "LoginTestExcelDataProvider", retryAnalyzer=
	 * com.ui.listeners.MyRetryAnalyser.class) public void loginExcelTest(User user)
	 * {
	 * 
	 * assertEquals(homePage.goToLoginPage().doLoginWith(user.getEmailAddress(),
	 * user.getPassword()).getUserName(), "Guri Singh"); }
	 */
}











