package HomeWork_1;

public class LocatorsTask {
    public static String homeMenu_Tasks = "//span[contains(text(),'Tasks')]";

    // Variable of Form Add new Tasks
    public static String AddNew = "//a[normalize-space()='Add New']";
    public static String Input_Title = "//input[@name='task_name']";
    public static  String Click_StartDate = "//label[contains(text(),'Start Date')]/following-sibling::div";
    public static  String Click_EndDate = "//label[contains(text(),'End Date')]/following-sibling::div";
    public static String Input_EstimatedHour = "//input[@name='task_hour']";
    public static String Click_Project = "//span[contains(@id,'select2-project')]/following-sibling::span";
    public static String Input_Project = "//span[@class='select2-search select2-search--dropdown']//input[@role='searchbox']";
    public static String Click_ProjectValue = "//ul[contains(@id,'select2-project')]//li[contains(@class,'option--highlighted')]";
    public static String Input_Summary = "//textarea[@id='summary']";
    public static String Input_Description = "//body";
    public static String Click_Reset = "//button[normalize-space()='Reset']";
    public static String Click_Save = "//button[normalize-space()='Save']";
}
