package expensespringApplication;

import java.io.IOException;



public class ManageAccount extends basicoperations {
	
	
	public void selectMode() throws Exception
	
	{
		printOut("Enter the option \n 1-Create Account 2-Delete Account 3-Back to Home\n");
		//int option=readIntInput();
		//gotoOperation(option);
		//
	}
	
	
	/*public void gotoOperation(int option) throws Exception
	
	{
		manageHome object=new manageHome();
		
		switch(option)
		
		{
		
		case 1:createAccount();
		        break;
			
		case 2:deleteAccount();
		        break;
			 
		case 3:object.selectoperations();
		        break;
			 
		 default:System.out.println("Enter a valid option");
		
		}
	}
	*/
	
	
   
	public void createAccount() throws Exception
    
	
	{
		printOut("Enter the name of account");
		String accountname=readStringInput();
		String url = "http://localhost:8080/createaccount?names="+accountname;
		getoperations objects=new getoperations();
		String result=objects.sendGet(url);
		printOut(result);
		
    }
	
    public void deleteAccount() throws Exception
    
    {
    	printOut("Enter the nmber of account to delete");
        int accountnumber=readIntInput();
        String url = "http://localhost:8080/deleteaccounts?number="+accountnumber;
        getoperations objects=new getoperations();
        String result=objects.sendGet(url);
   		printOut(result);
  
    }
    
    public void backToHome()
    {
    	
    }


	public void viewaccount() throws Exception 
	{
        String url = "http://localhost:8080/viewaccounts";
        getoperations objects=new getoperations();
        String result=objects.sendGetforObjectForAccount(url);
   		printOut(result);
   		
	}
}
