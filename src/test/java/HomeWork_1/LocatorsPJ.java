package HomeWork_1;

import org.openqa.selenium.By;

import static Common.BaseTest.driver;

public class LocatorsPJ {

    //Rel Xpath 1->5
    // Variable of Login Page
    public static String loginTextBox_UserName = "//input[@id='iusername']";
    public static  String loginTextBox_Password = "//input[@id='ipassword']";
    public static String loginButton_SuperAdmin = "//button[normalize-space()='Super Admin']";
    public static  String loginButton_Employee = "//button[normalize-space()='Employee']";
    public static  String loginButton_Client = "//button[normalize-space()='Client']";
    public static  String loginButton_Login = "//button[@type='submit']";
    public static  String loginLink_ForgotPW = "//a[contains(normalize-space(),'Forgot password')]";

    // Variable of Menu Project
    public static String homeMenu_Projects = "//span[contains(text(),'Projects')]";

    // Variable of Form Add new project
    public static  String addProjectButton_AddNew = "//a[normalize-space()='Add New']";
    public static String addProjectButton_Hide = "//a[contains(normalize-space(),'Hide')]";
    public static String addProjectTextBox_Title = "//input[@name='title']";
    public static  String addProjectComboBox_Client = "//span[contains(@id,'id-container')]";
    public static  String addProjectTextBox_Client = "//input[@class ='select2-search__field' and @aria-controls ='select2-client_id-results']";
    public static String addProjectTextBox_EstimatedHour = "//input[@name='budget_hours']";
    public static String addProjectCombobox_Priority = "//span[starts-with(@id,'select2-priority')]";
    public static  String addProjectTextBox_Priority = "//span[@class='select2-search select2-search--dropdown']//input[@role='searchbox']";
    // ô chọn date phải sử dụng thẻ div vì thẻ input ko work do ko trỏ chuột vào dc
    public static  String addProject_StartDate = "//label[contains(text(),'Start Date')]/following-sibling::div";
    public static String addProject_EndDate = "//label[@for='end_date']/following-sibling::div";
    //Có 2 table calendar cho nên sau khi chọn StartDate cái EndDate phải là div[@class='dtp-date'][2]
    public static  String addProject_EndDateNextbutton = "((//div[@class='dtp-date'])[2]//div[contains(@class, 'right center')])[1]";

    public static void selectEndDate(String monthName, String dayNumber) {
       driver.findElement(By.xpath(LocatorsPJ.addProject_EndDate)).click();
        for (int i = 1; i <= 12; i++) {
            String getMonthName = driver.findElement(By.xpath("(//div[@class='dtp-date']//div[contains(@class, 'dtp-actual-month')])[2]")).getText();
            if (getMonthName.equals(monthName)) {
                //Click chọn Ngày
                driver.findElement(By.xpath("(//a[contains(text(),"+dayNumber+")])[2]")).click();
                break; //Thoát vòng lặp
            }
            driver.findElement(By.xpath(addProject_EndDateNextbutton)).click();
        }
    }

    public static String addProjectTextBox_Summary = "//textarea[@id = 'summary']";
    public static String addProjectBox_Team = "//ul[@class='select2-selection__rendered']";
    public static String addProjectTextBox_Team = "//input[@class='select2-search__field' and @type='search']";
    public static String addProjectIframe_Description = "//body";
    public static String addProjectButton_Reset = "//button[normalize-space()='Reset']";
    public static String addProjectButton_Save = "//div[@class='card-footer text-right']//button[@type='submit']";

    //Rel Xpath 6->10
    // Variable of Menu Project
    public static String homeMenu_Employees = "//a[contains(@href,'https://app.hrsale.com/erp/staff-list')]//child::span[normalize-space()='Employees']";

    // Variable of Form Add new employee
    public static  String addEmployeeButton_AddNew = "//h5[contains(text(),'List All')]/following::a[contains(normalize-space(),'Add New')]";
    public static  String addEmployeeButton_Hide = "//h5[contains(text(),'Add New')]/following::a[contains(normalize-space(),'Hide')]";
    public static String addEmployeeTextBox_FirstName = "//label[contains(normalize-space(),'First Name')]/following::input[@name='first_name']";
    public static String addEmployeeTextBox_LastName = "//h5[contains(text(),'List All')]/preceding::input[@name='last_name']";
    public static  String addEmployeeTextBox_EmployeeID = "//label[normalize-space()='Employee ID']//following-sibling::input[@name='employee_id']";
    public static  String addEmployeeTextBox_ContactNumber = "//label[@for='contact_number']/following-sibling::input[@placeholder='Contact Number']";
    public static  String addEmployeeComboBox_Gender = "//span[@id='select2-gender-cu-container']/following-sibling::span";
    public static  String addEmployeeTextBox_Gender = "//span[@class='select2-search select2-search--dropdown']/child::input";
    public static String addEmployeeTextBox_Email = "//label[@for='email']/following::input[@name='email']";
    public static String addEmployeeTextBox_UserName = "//label[@for='email']/following::input[@name='username']";
    public static String addEmployeeTextBox_PassWord = "//label[@for='website']/following::input[@name='password']";
    public static String addEmployeeComboBox_OfficeShift = "//span[contains(text(),'Office Shift')]/following::span[1]";
    public static String addEmployeeTextBox_OfficeShift = "//ul[contains(@id,'select2-office_shift')]/preceding::input[@class='select2-search__field']";
    public static String addEmployeeComboBox_Designation = "//span[@id='select2-designation_id-ky-container']/following-sibling::span";
    public static String addEmployeeTextBox_Designation = "//ul[@id='select2-designation_id-ly-results']/preceding::input[@class='select2-search__field']";
    public static String addEmployeeTextBox_BasicSalary = "//label[contains(text(),'Basic Salary')]/following::input[@name='basic_salary']";
    public static String addEmployeeTextBox_HourlyRate = "//label[contains(text(),'Hourly Rate')]/following::input[@placeholder='Hourly Rate']";
    public static String addEmployeeComboBox_PayslipType = "//span[@id='select2-salay_type-container']/following-sibling::span";
    public static String addEmployeeTextBox_PayslipType = "//span[@class='select2-dropdown select2-dropdown--below']/descendant::input";
    public static String addEmployeeButton_Reset = "//div[@class='card-footer text-right']/child::button[contains(text(),'Reset')]";
    public static String addEmployeeButton_Save = "//div[@class='card-footer text-right']/child::button[contains(.,'Save')]";
    public static String addEmployee_ProfilePicture = "//div[@class='custom-file']/child::input";


}