package pagesforbcls;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseclass.BaseClass;

public class LoginPage extends BaseClass {
	//this is like dynamic code becouse there is no hard code data so this is dynamic code 
	
	//create a constructor and need to write page factory
	public LoginPage() {
		PageFactory.initElements(driver,this);
		

	}
	@FindBy(name = "email")
	private WebElement txtName;
	
	@FindBy(id = "pass")
	private WebElement txtPass;
	
	@FindBy(name="login")
	private WebElement btn;

	public WebElement getTxtName() {
		return txtName;
	}

	public void setTxtName(WebElement txtName) {
		this.txtName = txtName;
	}

	public WebElement getTxtPass() {
		return txtPass;
	}

	public void setTxtPass(WebElement txtPass) {
		this.txtPass = txtPass;
	}

	public WebElement getBtn() {
		return btn;
	}

	public void setBtn(WebElement btn) {
		this.btn = btn;
	}
	
	//functionalities for methods 
	
	public void functionality(String name, String pass) {
		sendkeys(getTxtName(), name);
		sendkeys(getTxtPass(), pass);
		click(getBtn());
		

	}
	
	
	
	
	
	
}
