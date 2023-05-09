package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;




public class DashboardPage {
 
	WebDriver driver;
	
	public DashboardPage(WebDriver driver) {
		this.driver = driver;
	}
	//WebElement
	@FindBy(how = How.XPATH, using = "//h2[text()= ' Dashboard ']") WebElement DASHBOARD_HEADER_ELEMENT;
	@FindBy(how = How.XPATH, using = "//span[contains(text(), 'Customers')]") WebElement CUSTOMER_MENU_ELEMENT;
	@FindBy(how = How.XPATH, using = "//a[contains(text(), 'Add Customer')]") WebElement ADD_CUSTOMER_MENU_ELEMENT;
	@FindBy(how = How.XPATH, using = "//*[@id=\"side-menu\"]/li[3]/ul/li[2]/a") WebElement LIST_CUSTOMER_MENU_ELEMENT;
	//Intractable Methods
	public void validateDashboardPage() {

     Assert.assertEquals(DASHBOARD_HEADER_ELEMENT.getText(), "Dashboard", "Dashboard page not found");	
	 

	}
	public void clickOnCustomerMenuElement() {
		CUSTOMER_MENU_ELEMENT.click();
	}
	
	public void clickOnAddCustomerMenuElement() {
		ADD_CUSTOMER_MENU_ELEMENT.click();
	}
	
	public void clickOnListCustomerMenuElement() throws InterruptedException {
		Thread.sleep(2000);
		LIST_CUSTOMER_MENU_ELEMENT.click();
	}
	
}
