package expensespringApplication;

import java.io.IOException;

public class manageHome extends basicoperations{
ManageAccount ManageAccount=new ManageAccount();
Selectaccount selectaccount=new Selectaccount();
String httpServer="http://localhost:8080/";
	public int selectoperations() throws Exception
	{
		printOut("Enter the option \n 1-Manage Account 2-Select Account 3-View Account\n");
		int option=readIntInput();
		
		return option;
		
	}
	
	public void viewaccounts() throws Exception
	{String url = httpServer+"viewaccounts";
    getoperations objects=new getoperations();
    String result=objects.sendGetforObject(url);
		printOut(result);
		selectoperations();
		
	}

}
