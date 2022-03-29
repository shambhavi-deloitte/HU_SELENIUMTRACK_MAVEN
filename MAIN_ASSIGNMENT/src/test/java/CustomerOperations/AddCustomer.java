package CustomerOperations;
import Database.Databaseoperation;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class AddCustomer {
    String AddCustomerBtn="//button[@ng-class='btnClass1']";
    String FirstName = "//input[@ng-model='fName']";
    String LastName = "//input[@ng-model='lName']";
    String PostCode = "//input[@placeholder='Post Code']";
    String Submit = "//button[text()='Add Customer']";
    WebDriver driver;
    Databaseoperation DB=new Databaseoperation();
    public AddCustomer(WebDriver driver){
        this.driver=driver;
    }
    public void addingCustomer() throws Exception{
        driver.findElement(By.xpath(AddCustomerBtn)).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath(FirstName)).sendKeys(DB.FN());
        driver.findElement(By.xpath(LastName)).sendKeys(DB.SN());
        driver.findElement(By.xpath(PostCode)).sendKeys(DB.PC());
        driver.findElement(By.xpath(Submit)).click();
        Thread.sleep(2000);
        driver.switchTo().alert().accept();
        Thread.sleep(2000);
    }

}
