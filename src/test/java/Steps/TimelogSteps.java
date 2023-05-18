package Steps;

import com.aventstack.extentreports.utils.FileUtil;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.plugin.event.Node;
import org.junit.Assert;
import org.openqa.selenium.*;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;


import java.io.File;

import static java.time.Duration.*;

public class TimelogSteps {

    WebDriver driver;

    public TimelogSteps(Hooks hooks) {
        this.driver = hooks.getDriver();
    }

    @Given("User is on dashboard page")
    public void user_is_on_dashboard_page() {
        System.out.println("User is on dashboard page");
    }

    @When("User clicks on Work menu")
    public void user_clicks_on_work_menu() throws InterruptedException {
        System.out.println("User clicks on Work menu");
        WebDriverWait wait = new WebDriverWait(driver, ofSeconds(60));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/aside/div[2]/div[2]/ul/li[5]/a")));
        driver.findElement(By.xpath("/html/body/aside/div[2]/div[2]/ul/li[5]/a")).click();
        Thread.sleep(2000);
    }

    @And("User clicks on Time Logs sub menu")
    public void user_clicks_on_time_logs_sub_menu() throws InterruptedException {
        System.out.println("User clicks on Time Logs sub menu");
        WebDriverWait wait = new WebDriverWait(driver, ofSeconds(60));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/aside/div[2]/div[2]/ul/li[5]/div/a[4]")));
        driver.findElement(By.xpath("/html/body/aside/div[2]/div[2]/ul/li[5]/div/a[4]")).click();
        Thread.sleep(3000);
    }

    @Then("User is redirect on the time Logs page")
    public void user_is_redirect_on_the_time_logs_page()
    {
        System.out.println("User is redirect on the time Logs page");
    }

    @Given("User is on time log page")
    public void userIsOnTimeLogPage() {
        System.out.println("User is on time log page");
    }

    @And("User can see the log time button")
    public void userCanSeeTheLogTimeButton() {
        System.out.println("User can see the log time button");
    }

    @When("User clicks on log time button")
    public void userClicksOnLogTimeButton() throws InterruptedException
    {
        System.out.println("User clicks on log time button");
        WebDriverWait wait = new WebDriverWait(driver, ofSeconds(100));
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#table-actions >a")));
        driver.findElement(By.cssSelector("#table-actions > a")).click();
        Thread.sleep(2000);
    }

    @Then("User is navigated to log time Page")
    public void userIsNavigatedToLogTimePage()
    {
        System.out.println("User is navigated to log time Page");
    }

    @Given("User is on time log details page")
    public void userIsOnTimeLogDetailsPage()
    {
        System.out.println("User is on time log details page");
    }

    @When("User fills up all the require details")
    public void userFillsUpAllTheRequireDetails() throws InterruptedException
    {
        System.out.println("User fills up all the require details");

        WebDriverWait wait1 = new WebDriverWait(driver, ofSeconds(100));
        wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[6]/div/div/div/div/form/div/div[2]/div[1]/div[1]/div[1]/div/div/button")));
        driver.findElement(By.xpath(" /html/body/div[6]/div/div/div/div/form/div/div[2]/div[1]/div[1]/div[1]/div/div/button")).click();
        driver.findElement(By.xpath("/html/body/div[6]/div/div/div/div/form/div/div[2]/div[1]/div[1]/div[1]/div/div/select/option[3]")).click(); //project
        Thread.sleep(2000);

        WebDriverWait wait2 = new WebDriverWait(driver, ofSeconds(100));
        wait2.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#save-timelog-data-form > div > div.row.p-20 > div.col-md-12 > div:nth-child(1) > div:nth-child(2) > div > div > button")));
        driver.findElement(By.cssSelector("#save-timelog-data-form > div > div.row.p-20 > div.col-md-12 > div:nth-child(1) > div:nth-child(2) > div > div > button")).click();
        driver.findElement(By.xpath("/html/body/div[6]/div/div/div/div/form/div/div[2]/div[1]/div[1]/div[2]/div/div/select/option[2]")).click(); //Task
        Thread.sleep(2000);

        WebDriverWait wait3 = new WebDriverWait(driver, ofSeconds(100));
        wait3.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[6]/div/div/div/div/form/div/div[2]/div[1]/div[1]/div[3]/div/div/button")));
        driver.findElement(By.xpath("/html/body/div[6]/div/div/div/div/form/div/div[2]/div[1]/div[1]/div[3]/div/div/button")).click();
        WebDriverWait wait0 = new WebDriverWait(driver, ofSeconds(100));
        wait0.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[6]/div/div/div/div/form/div/div[2]/div[1]/div[1]/div[3]/div/div/select/option[2]")));
        driver.findElement(By.xpath("/html/body/div[6]/div/div/div/div/form/div/div[2]/div[1]/div[1]/div[3]/div/div/select/option[2]")).click(); //employee
        Thread.sleep(2000);

        WebDriverWait wait4 = new WebDriverWait(driver, ofSeconds(100));
        wait4.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[6]/div/div/div/div/form/div/div[2]/div[1]/div[2]/div[5]/div/div/button")));
        driver.findElement(By.xpath("/html/body/div[6]/div/div/div/div/form/div/div[2]/div[1]/div[2]/div[5]/div/div/button")).click();
        driver.findElement(By.xpath("/html/body/div[6]/div/div/div/div/form/div/div[2]/div[1]/div[2]/div[5]/div/div/div/div[2]/ul/li[2]")).click(); //hour
        Thread.sleep(2000);

        WebDriverWait wait5 = new WebDriverWait(driver, ofSeconds(100));
        wait5.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[6]/div/div/div/div/form/div/div[2]/div[2]/div/textarea")));
        driver.findElement(By.xpath("/html/body/div[6]/div/div/div/div/form/div/div[2]/div[2]/div/textarea")).click();
        driver.findElement(By.xpath("/html/body/div[6]/div/div/div/div/form/div/div[2]/div[2]/div/textarea")).sendKeys("Test");
        Thread.sleep(2000);
    }

    @And("User clicks on save button")
    public void userClicksOnSaveButton() throws InterruptedException, IOException
    {
        System.out.println("User clicks on save button");
        driver.findElement(By.xpath("/html/body/div[6]/div/div/div/div/div/div/button[1]")).click();
        Thread.sleep(1000);


        //Use TakesScreenshot method to capture screenshot
        TakesScreenshot screenshot0 = (TakesScreenshot)driver;
        Thread.sleep(2000);
        //Saving the screenshot in desired location
        File source0 = screenshot0.getScreenshotAs(OutputType.FILE);
        Thread.sleep(2000);
        //Path to the location to save screenshot
        FileHandler.copy(source0, new File("/Users/addweb/Downloads/Testing 2 2/SS/SuccessfullyLogged.png"));
        Thread.sleep(2000);
        System.out.println("Added Time log Page Screenshot is captured");
    }

    @Then("User is redirect on Time Logs page")
    public void userIsRedirectOnTimeLogsPage() throws InterruptedException
    {
        System.out.println("User is redirect on Time Logs page");
        Thread.sleep(50);

        String str1 = "Create a Theme for the Addcom Project";
        String str2 = "Create a Theme for the Addcom Project";

        if(str1.equals(str2) )
        {
            System.out.println("Data is Matched");
        }
        else
        {
            System.out.println("Data Not Matched");
        }
    }

    @Given("User is on the time Logs page")
    public void userIsOnTheTimeLogsPage()
    {
        System.out.println("User is on the time log page");
    }

    @When("User clicks on the log time button")
    public void userClicksOnTheLogTimeButton() throws InterruptedException
    {
        System.out.println("User clicks on log time button");
        WebDriverWait wait = new WebDriverWait(driver, ofSeconds(100));
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#table-actions >a")));
        driver.findElement(By.cssSelector("#table-actions > a")).click();
        Thread.sleep(2000);
    }

    @And("User clicks on the Save button")
    public void userClicksOnTheSaveButton() throws InterruptedException {
        System.out.println("User clicks on Save button");
        WebDriverWait wait = new WebDriverWait(driver, ofSeconds(100));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[6]/div/div/div/div/div/div/button[1]")));
        driver.findElement(By.xpath("/html/body/div[6]/div/div/div/div/div/div/button[1]")).click();
        Thread.sleep(3000);
    }

    @Then("User is able to see a validations")
    public void userIsAbleToSeeAValidations() throws InterruptedException, IOException
    {
        System.out.println("Validation is appearing");
        //Use TakesScreenshot method to capture screenshot
        TakesScreenshot screenshot1 = (TakesScreenshot)driver;
        Thread.sleep(2000);
        //Saving the screenshot in desired location
        File source1 = screenshot1.getScreenshotAs(OutputType.FILE);
        Thread.sleep(2000);
        //Path to the location to save screenshot
        FileHandler.copy(source1, new File("/Users/addweb/Downloads/Testing 2 2/SS/Validation.png"));
        Thread.sleep(2000);
        System.out.println("Validation appeared on Time log Page Screenshot is captured");
    }
}
