package com.qa.tests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.qa.base.BaseTest;
import com.qa.utils.CSVUtil;

public class LoginPageNegativeTest extends BaseTest{
	
	
	@DataProvider
	public Object[][] invalidLoginData() {
		return CSVUtil.csvData("login");
	}
		
	
	@Test(dataProvider = "invalidLoginData")
	public void invalidLoginTest(String username, String password) {
		Assert.assertTrue(loginPage.doInvalidLogin(username, password));
	}
	

}
