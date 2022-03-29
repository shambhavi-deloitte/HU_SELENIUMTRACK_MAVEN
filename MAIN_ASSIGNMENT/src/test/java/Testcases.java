import CustLogin.depositAmt;
import CustomerOperations.AddCustomer;
import CustomerOperations.AccountOpen;
import CustLogin.login;
import RelXpath.Xpath;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
public class Testcases {
    public static WebDriver driver;
    Xpath xPaths = new Xpath();

    @BeforeTest
    public void OpenBrowser() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\shampriya\\Downloads\\Driver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.globalsqa.com/angularJs-protractor/BankingProject/#/login");
        Thread.sleep(2000);
        //log.info("Browser started and URL has launched successfully");
    }

    /* @AfterTest
     void CloseBrowser() {
         driver.close();
         //log.info("Browser closed successfully");
     }*/
    @Test(priority = 1)
    public void AddCustomerTest() throws Exception {
        driver.findElement(By.xpath(Xpath.BankManagerLoginBtn)).click();
        Thread.sleep(2000);
        AddCustomer ac=new AddCustomer(driver);
        ac.addingCustomer();
        Thread.sleep(2000);
    }
    @Test(priority=2)
    public void OpenAccountTest() throws Exception{
        driver.findElement(By.xpath(Xpath.HomeBtn)).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath(Xpath.BankManagerLoginBtn)).click();
        driver.findElement(By.xpath(Xpath.OpenAccBtn)).click();
        Thread.sleep(2000);
        AccountOpen oa= new AccountOpen(driver);
        oa.selectCustomerName();
        oa.selectCurrency();
        oa.clickProcessBtn();
        driver.findElement(By.xpath(Xpath.HomeBtn)).click();
        Thread.sleep(3000);
    }
    @Test(priority = 3)
    public void CustomerLogin() throws Exception{
        driver.findElement(By.xpath(Xpath.CustomerLoginBtn)).click();
        Thread.sleep(2000);
        login cl=new login(driver);
        cl.yourName();
        cl.login();
    }
    @Test(priority = 4)
    public void deposit()throws Exception{
        depositAmt dp = new depositAmt(driver);
        dp.depositAmount();
    }

}


















   /*
    @Test(priority=3)
    public void CustomerLogin() throws Exception{
        driver.findElement(By.xpath(Path.CustomerBtn)).click();
        System.out.println("Customer button -Clicked");
        Thread.sleep(2000);
        customer=new Customer(driver);
        Thread.sleep(2000);
        customer.yourName();
        Thread.sleep(2000);
        customer.login();
        Thread.sleep(2000);
    }
    @Test(dependsOnMethods = {"CustomerLogin"})
    public void deposit() throws Exception {
        customerDeposit = new CustomerDeposit(driver);
        customerDeposit.depositAmount();
        Thread.sleep(2000);
    }



}
}

        }*/