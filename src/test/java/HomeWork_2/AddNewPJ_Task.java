package HomeWork_2;

import Common.BaseTest;
import HomeWork_1.LocatorsPJ;
import HomeWork_1.LocatorsTask;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;

public class AddNewPJ_Task extends BaseTest {

    public static void login () {
        createDriver();

        driver.get("https://app.hrsale.com/");
        JavascriptExecutor js = (JavascriptExecutor) driver;

        driver.findElement(By.xpath(LocatorsPJ.loginButton_Employee)).click();
        driver.findElement(By.xpath(LocatorsPJ.loginButton_Login)).click();

        sleep(6000);
    }

    public static void createProject (String projectName) {
        // Click Menu
        driver.findElement(By.xpath(LocatorsPJ.homeMenu_Projects)).click();
        // Click AddNew
        driver.findElement(By.xpath(LocatorsPJ.addProjectButton_AddNew)).click();
        // Input Title
        driver.findElement(By.xpath(LocatorsPJ.addProjectTextBox_Title)).sendKeys(projectName);
        // Select Client
        driver.findElement(By.xpath(LocatorsPJ.addProjectComboBox_Client)).click();
        driver.findElement(By.xpath(LocatorsPJ.addProjectTextBox_Client)).sendKeys("a", Keys.ENTER);
        // Input EstimatedHour
        driver.findElement(By.xpath(LocatorsPJ.addProjectTextBox_EstimatedHour)).sendKeys("100");
        // Select Priority
        driver.findElement(By.xpath(LocatorsPJ.addProjectCombobox_Priority)).click();
        driver.findElement(By.xpath(LocatorsPJ.addProjectTextBox_Priority)).sendKeys("Low", Keys.ENTER);
        // Select StartDate
        driver.findElement(By.xpath(LocatorsPJ.addProject_StartDate)).click();
        driver.findElement(By.xpath("(//table[@class='table dtp-picker-days'])[1]//td[@data-date ='10']")).click();
        driver.findElement(By.xpath("(//button[contains(text(),'OK')])[1]")).click();

        // Select EndDate
        LocatorsPJ.selectEndDate("DEC","25");
        driver.findElement(By.xpath("(//button[contains(text(),'OK')])[2]")).click();

        // Input Summary
        driver.findElement(By.xpath(LocatorsPJ.addProjectTextBox_Summary)).sendKeys("eCommerce website");
        // Select Team
        driver.findElement(By.xpath(LocatorsPJ.addProjectBox_Team)).click();
        driver.findElement(By.xpath(LocatorsPJ.addProjectTextBox_Team)).sendKeys("Jo");
        driver.findElement(By.xpath("//ul[@class='select2-results__options']//li[contains(@class,'option--highlighted')]")).click();
        // Input Description
        driver.switchTo().frame(0);
        driver.findElement(By.xpath(LocatorsPJ.addProjectIframe_Description)).sendKeys("food ecommerce website for local customer");
        driver.switchTo().parentFrame();
        // Click Save
        driver.findElement(By.xpath(LocatorsPJ.addProjectButton_Save)).click();

        sleep(2000);
    }

        public static void createTasks(String projectName) {
            // Click menu
            driver.findElement(By.xpath(LocatorsTask.homeMenu_Tasks)).click();
            // Click AddNew
            driver.findElement(By.xpath(LocatorsTask.AddNew)).click();
            // Input Title
            driver.findElement(By.xpath(LocatorsTask.Input_Title)).sendKeys("Task 001");
            // Select StartDate
            driver.findElement(By.xpath(LocatorsTask.Click_StartDate)).click();
            driver.findElement(By.xpath("(//table[@class='table dtp-picker-days'])[1]//td[@data-date ='19']")).click();
            driver.findElement(By.xpath("(//button[contains(text(),'OK')])[1]")).click();
            // Select EndDate
            driver.findElement(By.xpath(LocatorsTask.Click_EndDate)).click();
            driver.findElement(By.xpath("(//a[contains(text(),'20')])[2]")).click();
            driver.findElement(By.xpath("(//button[contains(text(),'OK')])[2]")).click();
            // Input EstimatedHour
            driver.findElement(By.xpath(LocatorsTask.Input_EstimatedHour)).sendKeys("16");
            //Select Project
            driver.findElement(By.xpath(LocatorsTask.Click_Project)).click();
            driver.findElement(By.xpath(LocatorsTask.Input_Project)).sendKeys(projectName);
            driver.findElement(By.xpath(LocatorsTask.Click_ProjectValue)).click();
            // Input Summary
            driver.findElement(By.xpath(LocatorsTask.Input_Summary)).sendKeys("create food order home page and confirmation for eCommerce website");
            // Input Description
            driver.switchTo().frame(0);
            driver.findElement(By.xpath(LocatorsTask.Input_Description)).sendKeys("food ecommerce website for local customer");
            driver.switchTo().parentFrame();
            // Click Save
            driver.findElement(By.xpath(LocatorsTask.Click_Save)).click();
        }

    public static void main(String[] args) {
        login();
        createProject("Project A");
        createTasks("Project A");
        sleep(2000);
        closeDriver();
    }


}
