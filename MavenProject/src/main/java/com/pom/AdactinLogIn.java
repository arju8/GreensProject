package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdactinLogIn {
	WebDriver driver;
	
	
	@FindBy(id="username")
	private WebElement username;
	@FindBy(id="password")
	private WebElement password;
	@FindBy(name = "login")
	private WebElement loginBtn;


	public WebElement getUsername() {
		return username;
	}
	public WebElement getPassword() {
		return password;
	}
	public WebElement getLoginBtn() {
		return loginBtn;
	}
	public AdactinLogIn(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	

}
