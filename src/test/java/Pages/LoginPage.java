package Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

 

public class LoginPage {
    WebDriver driver;
    @FindBy(linkText="Log in")
    WebElement lnkLogin;
    
    @FindBy(linkText="user_login")
    WebElement editUsername;
    
    @FindBy(linkText="user_pwd")
    WebElement editPwd;
    
    @FindBy(linkText="remember")
    WebElement chkBox;
    
    @FindBy(linkText="btn_login")
    WebElement btnPwd;
    
    
    public LoginPage(WebDriver testdriver) {
        this.driver= testdriver;
        PageFactory.initElements(driver, this);
    }
    
    public void Login(String Username,String Password) {
        
        WebElement lnkLogin = driver.findElement(By.linkText("Log in"));
        
        lnkLogin.click();
        editUsername.sendKeys(Username);
        editPwd.sendKeys(Password);
        chkBox.click();
        btnPwd.click();
    }
        
}        
        /*WebElement editUsername=driver.findElement(By.name("user_login"));    
        editUsername.sendKeys(Username);
        
        WebElement editPwd =driver.findElement(By.name("user_pwd"));    
        editPwd.sendKeys(Password);
        
        WebElement chkBox =driver.findElement(By.className("rememberMe"));    
        chkBox.click();
        
        WebElement btnPwd =driver.findElement(By.className("btn_login"));
        btnPwd.click();
        WebElement error = driver.findElement(By.id("msg_box"));
        
        String ActError = error.getText();
        
        String ExpError = "The email or password you have entered is invalid.";
        
        if(ActError.equals(ExpError)) {
            
            System.out.println("TC Passed");
            
        }
        else {
            
            System.out.println("TC Failed");
        }     
    }
    /*public void close()
    {
        driver.quit();
    }*/