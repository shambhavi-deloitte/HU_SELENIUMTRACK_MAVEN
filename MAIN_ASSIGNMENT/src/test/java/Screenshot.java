import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import java.io.File;
import java.io.IOException;
public class Screenshot {
    static WebDriver driver;
    public Screenshot(WebDriver driver){
        this.driver=driver;
    }
    public static void getNegativeScreenShot() throws IOException {
        int num=0;
        String ss = "ScreenShot"+ "-"+num +".jpg";
        TakesScreenshot takesScreenshot=(TakesScreenshot)driver;
        File src=takesScreenshot.getScreenshotAs(OutputType.FILE);
        File des=new File(System.getProperty("user.dir")+"/NegativeScreenshot/"+ss);
        FileUtils.copyFile(src,des);
    }
    public static  void getPositiveScreenShot() throws IOException {
        int num=0;
        String ss = "ScreenShot"+ "-"+num +".jpg";
        TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
        File src = takesScreenshot.getScreenshotAs(OutputType.FILE);
        File des = new File(System.getProperty("user.dir")+"/PassedScreenShot/"+ss);//change the image name
        FileUtils.copyFile(src,des);
        num=num+1;
    }
}