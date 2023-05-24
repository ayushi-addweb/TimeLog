package Steps;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Hooks
{
    private WebDriver driver;
    //WebDriver driver = null;
    @Before(order = 0)
    public void SetUp() throws InterruptedException
    {
        System.out.println("-------------------------");
        System.out.println("Starting Of The Scenario.");
        System.out.println("-------------------------");
        System.setProperty("web-driver.chrome.driver", "/Users/addweb/Downloads/Testing 2 2 2/src/chromedriver");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        //options.setHeadless(true);  //This Method accepts boolean as arg If it's "False" then it will run as a Headed mode means normal and If it's "True" then it will run as a Headless mode
        options.setHeadless(false);
        driver = new ChromeDriver(options);
        //options.addArguments("--headless=new");

        driver.manage().window().maximize();
        driver.get("https://ttstage.addwebprojects.com/");
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/form/section/div/div/div/div/div[1]/input[1]")).sendKeys("saurabhdhariwal.com@gmail.com");
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/form/section/div/div/div/div/div[2]/div[1]/input")).sendKeys("addweb123");
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/form/section/div/div/div/div/div[2]/button")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("/html/body/header/div[1]/div[1]/div/h2")).getText();
        Thread.sleep(3000);
    }

    @After(order = 1)
    public void TearDown() throws InterruptedException
    {
        System.out.println("-----------------------");
        System.out.println("Ending Of The Scenario.");
        System.out.println("-----------------------");
        driver.quit();
        Thread.sleep(2000);
    }
    public WebDriver getDriver()
    {
        return driver;
    }
}
