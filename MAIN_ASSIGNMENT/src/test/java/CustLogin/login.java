package CustLogin;
import Database.Databaseoperation;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
public class login {
    static WebDriver driver;
    static String UseSelectBtn ="//select[@id='userSelect']";
    static String SubmitBtn = "//button[@class='btn btn-default']";
    static String yourname ="" ;
    static Databaseoperation db =new Databaseoperation();
    public login(WebDriver driver)
    {
        this.driver=driver;
    }

    public  void yourName() throws Exception {
        WebElement DropDownuserSelect = driver.findElement(By.xpath(UseSelectBtn));
        Select sl = new Select(DropDownuserSelect);
        yourname=db.FullName();
        sl.selectByVisibleText(yourname);
        Thread.sleep(2000);
    }
    public static void login() throws Exception{
        driver.findElement(By.xpath(SubmitBtn)).click();
        Thread.sleep(3000);
    }

}