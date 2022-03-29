package CustLogin;
import Database.Databaseoperation;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
public class depositAmt {
    WebDriver driver;
    String depositBtn = "//button[@ng-click='deposit()']";
    String amountBtn = "//input[@ng-model='amount']";
    String submit = "//button[text()='Deposit']";
    String acknowledgement = "//span[text()='Deposit Successful']";
    String userName = "//span[@class='fontBig ng-binding']";
    static Databaseoperation db = new Databaseoperation();

    public depositAmt(WebDriver driver) {
        this.driver = driver;
    }

    public void depositAmount() throws Exception {
        driver.findElement(By.xpath(depositBtn)).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath(amountBtn)).sendKeys("200");
        Thread.sleep(2000);
        driver.findElement(By.xpath(submit)).click();
        Thread.sleep(2000);
        String actualUser = db.FN();
        String expectedUser = driver.findElement(By.xpath(userName)).getText();
        if (expectedUser.equals(actualUser)) {
            Assert.assertEquals(expectedUser, actualUser);
            System.out.println("Correct");
        }
        if (driver.findElement(By.xpath(acknowledgement)).getText().contains("Deposit Successful")) {
            System.out.println("Deposit done Successfully");
            String actualValue = driver.findElement(By.xpath("//strong[text()='200']")).getText();
            Assert.assertEquals(actualValue, "200");
            System.out.println("Deposited Amount is Correct");
        }
        Thread.sleep(2000);
    }
}
