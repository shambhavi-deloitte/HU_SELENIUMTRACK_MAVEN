package CustomerOperations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.ui.Select;
import static Database.Databaseoperation.customerName;
public class AccountOpen {
    WebDriver driver;
    String OpenAccountBtn="//button[@ng-click='openAccount()']";
    String usernameSelect = "//select[@id='userSelect']";
    String currency="//select[@id='currency']";
    String process ="//button[text()='Process']";
    public AccountOpen(WebDriver driver){
        this.driver=driver;
    }
    public void selectCustomerName() throws Exception{
        driver.findElement(By.xpath(OpenAccountBtn)).click();
        WebElement dropDownName=driver.findElement(By.xpath(usernameSelect));
        Select sl=new Select(dropDownName);
        sl.selectByVisibleText(customerName);
        Thread.sleep(3000);
    }
    public void selectCurrency() throws Exception{
        WebElement dropDownCurrency=driver.findElement(By.xpath(currency));
        Select selectCurrency=new Select(dropDownCurrency);
        selectCurrency.selectByVisibleText("Rupee");
        Thread.sleep(3000);
    }
    public void clickProcessBtn() throws Exception{
        driver.findElement(By.xpath(process)).click();
        Thread.sleep(2000);
        driver.switchTo().alert().accept();

    }
}
