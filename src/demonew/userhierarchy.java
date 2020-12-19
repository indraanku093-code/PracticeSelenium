package demonew;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class userhierarchy {
	public static WebDriver driver;

	
	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./exefiles/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://modusliveqa.azurewebsites.net/Pages/Hierarchy/home.aspx");
		Thread.sleep(6000);
		driver.findElement(By.id("i0116")).sendKeys(exceldata.dataread("sheet1", 1, 0));
		Thread.sleep(4000);
		driver.findElement(By.id("idSIButton9")).click();
		driver.findElement(By.name("passwd")).sendKeys(exceldata.dataread("sheet1", 1, 1));
		Thread.sleep(3000);
		driver.findElement(By.id("idSIButton9")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("idSIButton9")).click();
		Thread.sleep(4000);
		driver.findElement(By.className("hierarchyIconImg")).click();
		Thread.sleep(3000);
	     //MH();
	     //MO();
		//MOH();
		//MG();
		//MU();
		//MM();
		//MLH();
		//a();
	    //OMD();
		//MB();
	}
	    public static void MH() throws Throwable
	{
		  driver.findElement(By.id("MainContent_M_DisplayPageNavigationControl_MoDataList_HyperLink1_0")).click();
		  Thread.sleep(3000);
			driver.findElement(By.id("MainContent_M_ProductHierarchyControl_btnAddNew")).click();
			Thread.sleep(2000);
			driver.findElement(By.id("MainContent_M_ProductHierarchyControl_txtLHName")).sendKeys(exceldata.dataread("sheet2", 1, 1));
			Thread.sleep(3000);
			driver.findElement(By.id("MainContent_M_ProductHierarchyControl_btnInsertProductHierarchy")).click();
			Thread.sleep(6000);
			driver.findElement(By.id("MainContent_M_ProductHierarchyControl_grdProductHierarchy_btnView_2")).click();
			Thread.sleep(5000);
			//driver.get("https://modusliveqa.azurewebsites.net/Pages/Hierarchy/ManageProductHierarchy.aspx?productparentID=773&HTypeID=2");
			driver.findElement(By.name("ctl00$MainContent$M_ProductHierarchyControl$btnAddNew")).click();
			Thread.sleep(3000);
			driver.findElement(By.id("MainContent_M_ProductHierarchyControl_txtLHName")).sendKeys(exceldata.dataread("sheet2", 2, 1));
			//driver.findElement(By.name("ctl00$MainContent$M_ProductHierarchyControl$ddlParentProcess")).sendKeys(exceldata.dataread("sheet2", 1, 1));
			driver.findElement(By.name("ctl00$MainContent$M_ProductHierarchyControl$btnInsertProductHierarchy")).click();
			Thread.sleep(7000);
			driver.findElement(By.id("MainContent_M_ProductHierarchyControl_grdProductHierarchy_btnView_0")).click();
			Thread.sleep(5000);
			//driver.get("https://modusliveqa.azurewebsites.net/Pages/Hierarchy/ManageProductHierarchy.aspx?productparentID=778&HTypeID=3");
			driver.findElement(By.id("MainContent_M_ProductHierarchyControl_btnAddNew")).click();
			Thread.sleep(3000);
			driver.findElement(By.name("ctl00$MainContent$M_ProductHierarchyControl$txtLHName")).sendKeys(exceldata.dataread("sheet2", 3, 1));
			driver.findElement(By.id("MainContent_M_ProductHierarchyControl_txtShortDescription")).sendKeys(exceldata.dataread("sheet2", 2, 1));
			driver.findElement(By.id("MainContent_M_ProductHierarchyControl_btnInsertProductHierarchy")).click();
			Thread.sleep(6000);
			driver.findElement(By.id("MainContent_M_ProductHierarchyControl_grdProductHierarchy_btnView_0")).click();
			Thread.sleep(4000);
			
			//driver.get("https://modusliveqa.azurewebsites.net/Pages/Hierarchy/ManageProductHierarchy.aspx?productparentID=779&HTypeID=4");
			driver.findElement(By.id("MainContent_M_ProductHierarchyControl_btnAddNew")).click();
			Thread.sleep(2000);
			driver.findElement(By.name("ctl00$MainContent$M_ProductHierarchyControl$txtLHName")).sendKeys(exceldata.dataread("sheet2", 4, 1));
			driver.findElement(By.id("MainContent_M_ProductHierarchyControl_txtShortDescription")).sendKeys(exceldata.dataread("sheet2", 3, 1));
			driver.findElement(By.id("MainContent_M_ProductHierarchyControl_btnInsertProductHierarchy")).click();
			Thread.sleep(6000);
			driver.findElement(By.id("MainContent_M_ProductHierarchyControl_grdProductHierarchy_btnView_0")).click();
			Thread.sleep(5000);
			//driver.get("https://modusliveqa.azurewebsites.net/Pages/Hierarchy/ManageProductHierarchy.aspx?SPHostUrl=https%3A%2F%2Fmodusliveqa%2Esharepoint%2Ecom%2Fsites%2FModusQA&SPLanguage=en%2DUS&SPClientTag=8&SPProductNumber=16%2E0%2E19506%2E12023&productparentID=780&HTypeID=5&SPHasRedirectedToSharePoint=1");
		driver.findElement(By.id("MainContent_M_ProductHierarchyControl_btnAddNew")).click();
		Thread.sleep(3000);
		driver.findElement(By.name("ctl00$MainContent$M_ProductHierarchyControl$txtLHName")).sendKeys(exceldata.dataread("sheet2", 5, 1));
		driver.findElement(By.id("MainContent_M_ProductHierarchyControl_txtShortDescription")).sendKeys(exceldata.dataread("sheet2", 4, 1));
		driver.findElement(By.id("MainContent_M_ProductHierarchyControl_btnInsertProductHierarchy")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[contains(text(),'Admin Dashboard')]")).click();
	}
		public static void MG() throws Throwable
		{

			driver.findElement(By.id("MainContent_M_DisplayPageNavigationControl_MoDataList_HyperLink1_7")).click();
			driver.findElement(By.id("MainContent_M_ManageGroupControl_btnAddNew")).click();
			Thread.sleep(2000);
			driver.findElement(By.id("MainContent_M_ManageGroupControl_txtGroupName")).sendKeys(exceldata.dataread("sheet2", 1, 6));
			Thread.sleep(2000);
			driver.findElement(By.id("MainContent_M_ManageGroupControl_ddlSelectModule")).sendKeys(exceldata.dataread("sheet2", 2, 6));
			Thread.sleep(4000);
			driver.findElement(By.id("MainContent_M_ManageGroupControl_btnInsertGroup")).click();
			Thread.sleep(4000);
			
			driver.findElement(By.xpath("//a[contains(text(),'Admin Dashboard')]")).click();
		}
		public static void MO() throws Throwable
		{
			driver.findElement(By.id("MainContent_M_DisplayPageNavigationControl_MoDataList_HyperLink1_5")).click();
			driver.findElement(By.id("MainContent_M_DisplayPageNavigationControl1_MoDataList_HyperLink1_0")).click();
			driver.findElement(By.id("MainContent_M_Team_btnAddNew")).click();
			Thread.sleep(3000);
			driver.findElement(By.id("MainContent_M_Team_txtTeamName")).sendKeys(exceldata.dataread("sheet2", 1, 4));
			Thread.sleep(3000);
			driver.findElement(By.id("MainContent_M_Team_btnInsertTeam")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("//a[contains(text(),'Oragnisation Dashboard')]")).click();
			driver.findElement(By.id("MainContent_M_DisplayPageNavigationControl1_MoDataList_HyperLink1_1")).click();
			driver.findElement(By.id("MainContent_M_Department_btnAddNew")).click();
			Thread.sleep(3000);
			driver.findElement(By.name("ctl00$MainContent$M_Department$txtDepartmentName")).sendKeys(exceldata.dataread("sheet2", 2, 4));
			driver.findElement(By.id("MainContent_M_Department_ddlSelectTeam")).sendKeys(exceldata.dataread("sheet2", 1, 4));
			Thread.sleep(2000);
			driver.findElement(By.id("MainContent_M_Department_btnInsertDepartment")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//a[contains(text(),'Oragnisation Dashboard')]")).click();
			driver.findElement(By.id("MainContent_M_DisplayPageNavigationControl1_MoDataList_HyperLink1_2")).click();
			driver.findElement(By.id("MainContent_M_Role_btnAddNew")).click();
			Thread.sleep(2000);
			driver.findElement(By.name("ctl00$MainContent$M_Role$txtRoleName")).sendKeys(exceldata.dataread("sheet2", 3, 4));
			driver.findElement(By.id("MainContent_M_Role_ddlSelectDepartment")).sendKeys(exceldata.dataread("sheet2", 2, 4));
			Thread.sleep(2000);
			driver.findElement(By.id("MainContent_M_Role_btnInsertRole")).click();
			Thread.sleep(3000);
			driver.findElement(By.id("MainContent_M_Role_grdRole_btnMapProductHierarchy_0")).click();
			driver.findElement(By.id("773")).click();
			driver.findElement(By.id("btnSaveProductRoleMapping")).click();
			Thread.sleep(4000);
			 driver.switchTo().alert().accept(); 
			  Thread.sleep(5000);
			  driver.navigate().refresh(); 
			driver.findElement(By.xpath("//a[contains(text(),'Admin Dashboard')]")).click();
		}
		public static void MOH() throws Throwable
		{
			driver.findElement(By.id("MainContent_M_DisplayPageNavigationControl_MoDataList_HyperLink1_5")).click();
			driver.findElement(By.id("MainContent_M_DisplayPageNavigationControl1_MoDataList_HyperLink1_0")).click();
			driver.findElement(By.id("MainContent_M_Team_btnAddNew")).click();
			Thread.sleep(3000);
			//driver.findElement(By.id("MainContent_M_Team_txtTeamName")).sendKeys(exceldata.dataread("sheet2", 1, 4));
			  List<WebElement> et2 = driver.findElements(By.xpath("//span[contains(@id, 'MainContent_M_Team_grdTeam_lblName')]"));
			   int k=0;
			   
			  for (int i = 0; i < et2.size(); i++) {
				  //List<WebElement> nextele = driver.findElements(By.xpath("//*[@id='MainContent_M_Team_grdTeam']/tbody/tr[12]/td/table/tbody/tr/td/a"));
				  if((et2.get(i).getText().equalsIgnoreCase(exceldata.dataread("sheet2",1, 4))))
				  {
					  k++;
				
					  System.out.println("Team name ="+et2.get(i).getText());
				  }
				  else
				  {
//					  System.out.println("page = "+i);
//					  driver.findElement(By.xpath("//td["+(i+2)+"]//a")).click();
//					  //nextele.get(i).click();
//					  et2=driver.findElements(By.xpath("//span[contains(@id, 'MainContent_M_Team_grdTeam_lblName')]"));
				  }
			  }
			  
//			  WebElement dropele = driver.findElement(By.id("MainContent_M_Team_ddlSearch"));
//			  Select sc = new Select(dropele);
//			  sc.selectByVisibleText("Name");
//			  Thread.sleep(3000);
//			  driver.findElement(By.id("MainContent_M_Team_txtSearch")).sendKeys(exceldata.dataread("sheet2",1, 4));
//			  Thread.sleep(3000);
//			  driver.findElement(By.id("MainContent_M_Team_btnSearch")).click();
//			  
//			  if(driver.findElements(By.id("//td[2]//span")).getSize())
			  if(k>=1)
			  {
				  System.out.println("team already exist");
			  }
			  else {
					//driver.findElement(By.id("MainContent_M_Team_btnAddNew")).click();
					Thread.sleep(5000);
					System.out.println("k ="+k);
				  driver.findElement(By.id("MainContent_M_Team_txtTeamName")).sendKeys(exceldata.dataread("sheet2", 1, 4));
				  driver.findElement(By.id("MainContent_M_Team_btnInsertTeam")).click();
					driver.findElement(By.xpath("//a[contains(text(),'Oragnisation Dashboard')]")).click();
					driver.findElement(By.id("MainContent_M_DisplayPageNavigationControl1_MoDataList_HyperLink1_1")).click();
					driver.findElement(By.id("MainContent_M_Department_btnAddNew")).click();
					Thread.sleep(3000);
					driver.findElement(By.name("ctl00$MainContent$M_Department$txtDepartmentName")).sendKeys(exceldata.dataread("sheet2", 2, 4));
					driver.findElement(By.id("MainContent_M_Department_ddlSelectTeam")).sendKeys(exceldata.dataread("sheet2", 1, 4));
					Thread.sleep(2000);
					driver.findElement(By.id("MainContent_M_Department_btnInsertDepartment")).click();
					Thread.sleep(4000);
					driver.findElement(By.xpath("//a[contains(text(),'Oragnisation Dashboard')]")).click();
					driver.findElement(By.id("MainContent_M_DisplayPageNavigationControl1_MoDataList_HyperLink1_2")).click();
					driver.findElement(By.id("MainContent_M_Role_btnAddNew")).click();
					Thread.sleep(2000);
					driver.findElement(By.name("ctl00$MainContent$M_Role$txtRoleName")).sendKeys(exceldata.dataread("sheet2", 3, 4));
					driver.findElement(By.id("MainContent_M_Role_ddlSelectDepartment")).sendKeys(exceldata.dataread("sheet2", 2, 4));
					Thread.sleep(2000);
					driver.findElement(By.id("MainContent_M_Role_btnInsertRole")).click();
					Thread.sleep(4000);
					driver.findElement(By.id("MainContent_M_Role_grdRole_btnMapProductHierarchy_0")).click();
					driver.findElement(By.id("773")).click();
					driver.findElement(By.id("btnSaveProductRoleMapping")).click();
					Thread.sleep(4000);
					 driver.switchTo().alert().accept(); 
					  Thread.sleep(5000);
					  driver.navigate().refresh(); 
					driver.findElement(By.xpath("//a[contains(text(),'Admin Dashboard')]")).click();
				  
			  }
			Thread.sleep(3000);
			
			//driver.findElement(By.id("MainContent_M_Team_btnInsertTeam")).click();
//			Thread.sleep(5000);

		}
		public static void MU() throws InterruptedException
		{
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
		}
		public static void MM() throws Throwable
		{
			   
		     driver.findElement(By.id("MainContent_M_DisplayPageNavigationControl_MoDataList_HyperLink1_2")).click();
		     Thread.sleep(2000);
		     driver.get("https://modusliveqa.azurewebsites.net/Pages/Hierarchy/SubModule.aspx?ModuleId=2");
		     Thread.sleep(2000);
			/*driver.findElement(By.id("MainContent_ModuleSubModule_btnAddNew")).click();
			Thread.sleep(3000);
			driver.findElement(By.id("MainContent_ModuleSubModule_txtName")).sendKeys(exceldata.dataread("sheet2", 1, 8));
			Thread.sleep(3000);
			driver.findElement(By.id("MainContent_ModuleSubModule_ddlSelectModuleGroup")).sendKeys(exceldata.dataread("sheet2", 1, 6));
			Thread.sleep(4000);
			driver.findElement(By.id("MainContent_ModuleSubModule_btnOkay")).click();
		     driver.findElement(By.id("MainContent_ModuleSubModule_grdModule_btnAssignUser_4")).click();
		     Thread.sleep(3000);
			driver.findElement(By.xpath("//label[contains(text(),' BEAUTY')]")).click();
			
			driver.findElement(By.id("BtnSave_SubModulePermissionMapping UHAllbuttonColors")).click();
			Thread.sleep(6000);
			
			 driver.switchTo().alert().accept(); 
			
			//driver.findElement(By.xpath("//label[contains(text(),' pqr')]")).click();
			Thread.sleep(4000);
			driver.findElement(By.id("MainContent_ModuleSubModule_grdModule_btnMapFeature_4")).click();
			driver.findElement(By.xpath("//input[@attributetitle='Swimlanes']")).click();
			driver.findElement(By.xpath("//input[@attributetitle='Print']")).click();
			driver.findElement(By.xpath("//input[@attributetitle='OverlayReport']")).click();
			driver.findElement(By.xpath("//input[@attributetitle='Overlay']")).click();
			driver.findElement(By.xpath("//input[@attributetitle='DashboardReport']")).click();
			Thread.sleep(4000);
			//driver.findElement(By.id("MainContent_ModuleSubModule_grdModule_btnMapFeature_0")).click();
			driver.findElement(By.id("btnSaveSubModuleFeatureMapping")).click();
			Thread.sleep(6000);
			 driver.switchTo().alert().accept(); 
			  Thread.sleep(5000);*/
			  driver.findElement(By.id("MainContent_ModuleSubModule_grdModule_btnFeatureAccessEdit_4")).click();
			 // driver.findElement(By.id("MainContent_ModuleSubModule_grdModule_btnFeatureAccessEdit_0")).click();
			  driver.findElement(By.id("DdlRoleValues")).click();
			  driver.findElement(By.id("DdlRoleValues")).sendKeys(exceldata.dataread("sheet2", 3, 4));
			 driver.findElement(By.id("btnSaveFeatureRolePermissionMapping")).click();
			  Thread.sleep(4000);
				 driver.switchTo().alert().accept(); 
				  Thread.sleep(5000);
				 // driver.findElement(By.id("MainContent_ModuleSubModule_grdModule_lblURL_4")).click();	
				  driver.findElement(By.xpath("//a[contains(text(),'Admin Dashboard')]")).click();
		}
		public static void MLH() throws Throwable
		{
			driver.findElement(By.id("MainContent_M_DisplayPageNavigationControl_MoDataList_HyperLink1_3")).click();
			driver.findElement(By.id("MainContent_LocationHierarchyControl_btnAddNew")).click();
			Thread.sleep(3000);
			driver.findElement(By.id("MainContent_LocationHierarchyControl_txtLHName")).sendKeys(exceldata.dataread("sheet2", 1, 11));
			driver.findElement(By.id("MainContent_LocationHierarchyControl_btnInsertLocationHierarchy")).click();
			
			Thread.sleep(5000);
			driver.findElement(By.id("MainContent_LocationHierarchyControl_grdLocationHierarchy_btnView_1")).click();;
			//driver.get("https://modusliveqa.azurewebsites.net/Pages/Hierarchy/ManageLocationHiearchy.aspx?parentID=28&HTypeID=2");
			Thread.sleep(3000);
			driver.findElement(By.name("ctl00$MainContent$LocationHierarchyControl$btnAddNew")).click();
			Thread.sleep(3000);
			driver.findElement(By.id("MainContent_LocationHierarchyControl_txtLHName")).sendKeys(exceldata.dataread("sheet2", 2, 11));
			
			//driver.findElement(By.id("MainContent_LocationHierarchyControl_ddlParentProcess")).sendKeys(exceldata.dataread("sheet2", 1, 11));
			//Thread.sleep(5000);
			//driver.findElement(By.id("MainContent_M_ProductHierarchyControl_grdProductHierarchy_btnView_0")).click();
			driver.findElement(By.xpath("//input[@value='Save And Close']")).click();
			Thread.sleep(5000);
			driver.findElement(By.id("MainContent_LocationHierarchyControl_grdLocationHierarchy_btnView_0")).click();;
			//driver.get("https://modusliveqa.azurewebsites.net/Pages/Hierarchy/ManageLocationHiearchy.aspx?parentID=61&HTypeID=3");
             Thread.sleep(5000);
			driver.findElement(By.id("MainContent_LocationHierarchyControl_btnAddNew")).click();
			Thread.sleep(3000);
			driver.findElement(By.id("MainContent_LocationHierarchyControl_txtLHName")).sendKeys(exceldata.dataread("sheet2", 3, 11));
			//Thread.sleep(3000);
			driver.findElement(By.id("MainContent_LocationHierarchyControl_btnInsertLocationHierarchy")).click();
			Thread.sleep(4000);
			driver.findElement(By.xpath("//a[contains(text(),'Admin Dashboard')]")).click();
		
		
				
		}
	    public static void OMD() throws Throwable
{
			driver.findElement(By.id("MainContent_M_DisplayPageNavigationControl_MoDataList_HyperLink1_4")).click();
			driver.findElement(By.xpath("//a[@href='OverLayTypes?IsOverlay=True&SubModuleID=23']")).click();
			//driver.findElement(By.id("AddButtonOverlayType")).click();
			//driver.findElement(By.id("txtName-OverlayType")).sendKeys(exceldata.dataread("sheet2", 1, 14));
			//driver.findElement(By.id("btnSaveOverlayType")).click();
			Thread.sleep(4000);
			driver.findElement(By.xpath("//a[contains(text(),'OverlayDashBoard')]")).click();
			driver.findElement(By.xpath("//a[@href='OverlayTypeValues?IsOverlay=True&SubModuleID=23']")).click();
			//driver.findElement(By.id("AddButtonOverlayTypevalue")).click();
			//driver.findElement(By.id("txtTitle-OverlayTypevalue")).sendKeys(exceldata.dataread("sheet2", 2, 14));
			Thread.sleep(3000);
			//driver.findElement(By.id("dropdownOverlayTypes")).sendKeys(exceldata.dataread("sheet2", 1, 14));
			//driver.findElement(By.id("txtTitle-OverlayShortDescription")).sendKeys(exceldata.dataread("sheet2", 3, 14));
			//driver.findElement(By.id("btnSaveOverlayValue")).click();
			Thread.sleep(4000);
			driver.findElement(By.xpath("//a[contains(text(),'Admin Dashboard')]")).click();
			
}
		public static void MB() throws InterruptedException
		{
		driver.findElement(By.id("MainContent_M_DisplayPageNavigationControl_MoDataList_HyperLink1_8")).click();
		driver.findElement(By.id("MainContent_M_ManageGroupControl_grdBranding_btnEdit_5")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//input[@value='#30a2b9'])[1]")).clear();
		//driver.findElement(By.id("MainContent_M_ManageGroupControl_txtBC")).clear();
		Thread.sleep(4000);
		driver.findElement(By.id("MainContent_M_ManageGroupControl_txtBC")).sendKeys("red");
		driver.findElement(By.id("MainContent_M_ManageGroupControl_btnUpdateRecord")).click();
		}
		public static void a() throws Throwable
		
		{
			driver.findElement(By.id("MainContent_M_DisplayPageNavigationControl_MoDataList_HyperLink1_0")).click();
			  Thread.sleep(3000);
				driver.findElement(By.id("MainContent_M_ProductHierarchyControl_btnAddNew")).click();
				Thread.sleep(2000);
				driver.findElement(By.id("MainContent_M_ProductHierarchyControl_txtLHName")).sendKeys(exceldata.dataread("sheet2", 1, 1));
				Thread.sleep(3000);
				driver.findElement(By.id("MainContent_M_ProductHierarchyControl_btnInsertProductHierarchy")).click();
				
				List<WebElement> ele = driver.findElements(By.xpath("//table[@id='MainContent_M_ProductHierarchyControl_grdProductHierarchy']//tr//td[2]"));
				List<WebElement> ele1 = driver.findElements(By.xpath("//table[@id='MainContent_M_ProductHierarchyControl_grdProductHierarchy']//tr//td[4]//input"));
				for (int i = 0; i < ele.size(); i++) 
	            {
				
	            	System.out.println("name = "+ele.get(i).getText());
	            	if(ele.get(i).getText().equalsIgnoreCase("karnataka"))
	            	{
	            	   //String data = "//table[@id='MainContent_M_ProductHierarchyControl_grdProductHierarchy']//tr"+(i+1)+"//td[4]";
                      //driver.findElement(By.xpath(data)).click();
                      ele1.get(i).click();
                      break;
                      
	            	}
				}
		}
}
