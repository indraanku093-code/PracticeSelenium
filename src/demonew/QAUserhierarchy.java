package demonew;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class QAUserhierarchy {

	
	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./exefiles/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://modusliveqa.azurewebsites.net/Pages/Hierarchy/home.aspx");
		Thread.sleep(3000);
		driver.findElement(By.name("loginfmt")).sendKeys(exceldata.dataread("Sheet1", 1, 0));
		Thread.sleep(4000);
		driver.findElement(By.id("idSIButton9")).click();
		driver.findElement(By.name("passwd")).sendKeys(exceldata.dataread("sheet1", 1, 1));
		Thread.sleep(3000);
		driver.findElement(By.id("idSIButton9")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("idSIButton9")).click();
		Thread.sleep(4000);
		//driver.findElement(By.className("hierarchyIconImg")).click();
	  /* driver.findElement(By.id("MainContent_M_DisplayPageNavigationControl_MoDataList_HyperLink1_0")).click();
		driver.findElement(By.id("MainContent_M_ProductHierarchyControl_btnAddNew")).click();
		Thread.sleep(2000);
		//driver.get("https://modusliveqa.azurewebsites.net/Pages/Hierarchy/ManageProductHierarchy.aspx?productparentID=0&HTypeID=1");
		driver.findElement(By.name("ctl00$MainContent$M_ProductHierarchyControl$txtLHName")).sendKeys(exceldata.dataread("sheet2", 1, 1));
		driver.findElement(By.id("MainContent_M_ProductHierarchyControl_btnInsertProductHierarchy")).click();
		//driver.findElement(By.id("MainContent_M_ProductHierarchyControl_grdProductHierarchy_btnView_0")).click();
		driver.get("https://modusliveqa.azurewebsites.net/Pages/Hierarchy/ManageProductHierarchy.aspx?productparentID=773&HTypeID=2");
		driver.findElement(By.name("ctl00$MainContent$M_ProductHierarchyControl$btnAddNew")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("MainContent_M_ProductHierarchyControl_txtLHName")).sendKeys(exceldata.dataread("sheet2", 2, 1));
		//driver.findElement(By.name("ctl00$MainContent$M_ProductHierarchyControl$ddlParentProcess")).sendKeys(exceldata.dataread("sheet2", 1, 1));
		driver.findElement(By.name("ctl00$MainContent$M_ProductHierarchyControl$btnInsertProductHierarchy")).click();
		//driver.findElement(By.id("MainContent_M_ProductHierarchyControl_grdProductHierarchy_btnView_0")).click();
		driver.get("https://modusliveqa.azurewebsites.net/Pages/Hierarchy/ManageProductHierarchy.aspx?productparentID=778&HTypeID=3");
		driver.findElement(By.id("MainContent_M_ProductHierarchyControl_btnAddNew")).click();
		Thread.sleep(3000);
		driver.findElement(By.name("ctl00$MainContent$M_ProductHierarchyControl$txtLHName")).sendKeys(exceldata.dataread("sheet2", 3, 1));
		driver.findElement(By.id("MainContent_M_ProductHierarchyControl_txtShortDescription")).sendKeys(exceldata.dataread("sheet2", 3, 2));
		driver.findElement(By.id("MainContent_M_ProductHierarchyControl_btnInsertProductHierarchy")).click();
		driver.get("https://modusliveqa.azurewebsites.net/Pages/Hierarchy/ManageProductHierarchy.aspx?productparentID=779&HTypeID=4");
		driver.findElement(By.id("MainContent_M_ProductHierarchyControl_btnAddNew")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("ctl00$MainContent$M_ProductHierarchyControl$txtLHName")).sendKeys(exceldata.dataread("sheet2", 4, 1));
		driver.findElement(By.id("MainContent_M_ProductHierarchyControl_txtShortDescription")).sendKeys(exceldata.dataread("sheet2", 4, 2));
		driver.findElement(By.id("MainContent_M_ProductHierarchyControl_btnInsertProductHierarchy")).click();
		driver.get("https://modusliveqa.azurewebsites.net/Pages/Hierarchy/ManageProductHierarchy.aspx?SPHostUrl=https%3A%2F%2Fmodusliveqa%2Esharepoint%2Ecom%2Fsites%2FModusQA&SPLanguage=en%2DUS&SPClientTag=8&SPProductNumber=16%2E0%2E19506%2E12023&productparentID=780&HTypeID=5&SPHasRedirectedToSharePoint=1");
	driver.findElement(By.id("MainContent_M_ProductHierarchyControl_btnAddNew")).click();
	Thread.sleep(3000);
	driver.findElement(By.name("ctl00$MainContent$M_ProductHierarchyControl$txtLHName")).sendKeys(exceldata.dataread("sheet2", 5, 1));
	driver.findElement(By.id("MainContent_M_ProductHierarchyControl_txtShortDescription")).sendKeys(exceldata.dataread("sheet2", 5, 2));
	driver.findElement(By.id("MainContent_M_ProductHierarchyControl_btnInsertProductHierarchy")).click();*/
	driver.get("https://modusliveqa.azurewebsites.net/Pages/Hierarchy/AdminDashboard.aspx?SubModuleID=23");
	//manage organisation hierarchy
	driver.findElement(By.id("MainContent_M_DisplayPageNavigationControl_MoDataList_HyperLink1_5")).click();
	driver.findElement(By.id("MainContent_M_DisplayPageNavigationControl1_MoDataList_HyperLink1_0")).click();
	driver.findElement(By.id("MainContent_M_Team_btnAddNew")).click();
	Thread.sleep(3000);
	driver.findElement(By.id("MainContent_M_Team_txtTeamName")).sendKeys(exceldata.dataread("sheet2", 1, 5));
	Thread.sleep(3000);
	driver.findElement(By.id("MainContent_M_Team_btnInsertTeam")).click();
	Thread.sleep(5000);
	driver.findElement(By.xpath("//a[contains(text(),'Oragnisation Dashboard')]")).click();
	driver.findElement(By.id("MainContent_M_DisplayPageNavigationControl1_MoDataList_HyperLink1_1")).click();
	driver.findElement(By.id("MainContent_M_Department_btnAddNew")).click();
	Thread.sleep(3000);
	driver.findElement(By.name("ctl00$MainContent$M_Department$txtDepartmentName")).sendKeys(exceldata.dataread("sheet2", 2, 5));
	driver.findElement(By.id("MainContent_M_Department_ddlSelectTeam")).sendKeys(exceldata.dataread("sheet2", 1, 5));
	Thread.sleep(2000);
	driver.findElement(By.id("MainContent_M_Department_btnInsertDepartment")).click();
	driver.findElement(By.xpath("//a[contains(text(),'Oragnisation Dashboard')]")).click();
	driver.findElement(By.id("MainContent_M_DisplayPageNavigationControl1_MoDataList_HyperLink1_2")).click();
	driver.findElement(By.id("MainContent_M_Role_btnAddNew")).click();
	Thread.sleep(2000);
	driver.findElement(By.name("ctl00$MainContent$M_Role$txtRoleName")).sendKeys(exceldata.dataread("sheet2", 3, 5));
	driver.findElement(By.id("MainContent_M_Role_ddlSelectDepartment")).sendKeys(exceldata.dataread("sheet2", 2, 5));
	Thread.sleep(2000);
	driver.findElement(By.id("MainContent_M_Role_btnInsertRole")).click();
	driver.findElement(By.id("MainContent_M_Role_grdRole_btnMapProductHierarchy_0")).click();
	driver.findElement(By.id("773")).click();
	driver.findElement(By.id("btnSaveProductRoleMapping")).click();
	Thread.sleep(4000);
	 driver.switchTo().alert().accept(); 
	  Thread.sleep(5000);
	  driver.navigate().refresh(); 
	driver.findElement(By.xpath("//a[contains(text(),'Admin Dashboard')]")).click();
	//manage group
	driver.findElement(By.id("MainContent_M_DisplayPageNavigationControl_MoDataList_HyperLink1_7")).click();
	driver.findElement(By.id("MainContent_M_ManageGroupControl_btnAddNew")).click();
	Thread.sleep(2000);
	driver.findElement(By.id("MainContent_M_ManageGroupControl_txtGroupName")).sendKeys(exceldata.dataread("sheet2", 1, 7));
	Thread.sleep(2000);
	driver.findElement(By.id("MainContent_M_ManageGroupControl_ddlSelectModule")).sendKeys(exceldata.dataread("sheet2", 2, 7));
	Thread.sleep(4000);
	driver.findElement(By.id("MainContent_M_ManageGroupControl_btnInsertGroup")).click();
	
	Thread.sleep(4000);
	
	driver.findElement(By.xpath("//a[contains(text(),'Admin Dashboard')]")).click();
	//manage user
	driver.findElement(By.id("MainContent_M_DisplayPageNavigationControl_MoDataList_HyperLink1_1")).click();
	driver.findElement(By.id("MainContent_grdManageInternalUsers_btnTeamRoleMapping_8")).click();
	Thread.sleep(4000);
	driver.findElement(By.xpath("//input[@type='checkbox' and @attributetitle='pqr']")).click();
	//driver.findElement(By.id("93")).click();
	Thread.sleep(3000);
	driver.findElement(By.id("MainContent_ButtonMapTeamRoleFoUser")).click();
	Thread.sleep(4000);
	 driver.switchTo().alert().accept(); 
	  Thread.sleep(5000);
     driver.findElement(By.xpath("//a[contains(text(),'Admin Dashboard')]")).click();
     //manage module
     driver.findElement(By.id("MainContent_M_DisplayPageNavigationControl_MoDataList_HyperLink1_2")).click();
     Thread.sleep(2000);
     driver.get("https://modusliveqa.azurewebsites.net/Pages/Hierarchy/SubModule.aspx?ModuleId=2");
     Thread.sleep(2000);
	driver.findElement(By.id("MainContent_ModuleSubModule_btnAddNew")).click();
	Thread.sleep(3000);
	driver.findElement(By.id("MainContent_ModuleSubModule_txtName")).sendKeys(exceldata.dataread("sheet2", 1, 9));
	Thread.sleep(3000);
	driver.findElement(By.id("MainContent_ModuleSubModule_ddlSelectModuleGroup")).sendKeys(exceldata.dataread("sheet2", 1, 7));
	Thread.sleep(4000);
	driver.findElement(By.id("MainContent_ModuleSubModule_btnOkay")).click();
	
	driver.findElement(By.xpath("//input[@type='checkbox' and @parent-id attributetitle='pqr']")).click();
	Thread.sleep(3000);
	driver.findElement(By.id("BtnSave_SubModulePermissionMapping UHAllbuttonColors")).click();
	driver.findElement(By.id("MainContent_ModuleSubModule_grdModule_btnMapFeature_0")).click();
	driver.findElement(By.id("btnSaveSubModuleFeatureMapping")).click();
	Thread.sleep(4000);
	 driver.switchTo().alert().accept(); 
	  Thread.sleep(5000);
	  driver.findElement(By.id("MainContent_ModuleSubModule_grdModule_btnFeatureAccessEdit_0")).click();
	  driver.findElement(By.id("DdlRoleValues")).sendKeys(exceldata.dataread("sheet2", 3, 5));
	  driver.findElement(By.id("btnSaveFeatureRolePermissionMapping")).click();
	  Thread.sleep(4000);
		 driver.switchTo().alert().accept(); 
		  Thread.sleep(5000);
		  driver.findElement(By.id("MainContent_ModuleSubModule_grdModule_lblURL_0")).click();
	
	
	}

}
