package expensespringApplication;

public class accountProxy extends basicoperations {
	
	manageHome manageHome=new manageHome();
	ManageAccount ManageAccount=new ManageAccount();
	Selectaccount selectAccount=new Selectaccount();
	
	public void accountProxy() throws Exception
	{
	
	int option=manageHome.selectoperations();
	gotoOperation(option);
	
	}
	
	public void gotoOperation(int option) throws Exception
	{
		switch(option)
		
		{
		
		 case 1:selectMode();
			
		 case 2:selectAccount();
			 
		 case 3:viewaccount();
		        accountProxy();
			 
		 default:
		
		}
	}

	private void viewaccount() throws Exception 
	{
		ManageAccount.viewaccount();
		
	}

	public void selectMode() throws Exception
	
	{
		ManageAccount.selectMode();
		int option=readIntInput();
		gotoManageOperations(option);
	}
	
public void gotoManageOperations(int option) throws Exception
	
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
   public void createAccount() throws Exception


  {
	ManageAccount.createAccount();
	selectMode();
  }

  public void deleteAccount() throws Exception


  {
	ManageAccount.deleteAccount();
	selectMode();
  }
	
	


 public void selectAccount() throws Exception
	
	{
		selectAccount.selectAccount();
		int option=readIntInput();
		gotoaccountOperation(option);
	}
 public void gotoaccountOperation(int option) throws Exception {
		switch(option)
		{case 1:Deposit();
		        break;
			
		 case 2:Withdraw();
		        break;
			 
		 case 3:Transfer();
		        break;
		 case 4:Delete();
		        break;
		 case 5:Update();
		        break;
		 case 6:Undo();
		        break;
		 case 7:Balance();
		        break;
		 case 8:viewTransaction();
             break;		      
		 default:printOut("Enter a valid option");
			 
		}
	}
 public void Deposit() throws Exception
 {
	 selectAccount.Deposit();
 }
 
 public void Withdraw() throws Exception
 {
	 selectAccount.Withdraw();
	 
 }
 public void Transfer() throws Exception
 {
	 selectAccount.Transfer();
	 
 }
 
 public void Delete() throws Exception
 {
	 selectAccount.Delete();
 }
 public void Undo() throws Exception
 {
	 selectAccount.Undo();
 }
 
 public void Update() throws Exception

{
	 selectAccount.Update();
	 
 }

 public void Balance() throws Exception
 {
	 selectAccount.Balance();
 }
 
 
 
 public void viewTransaction() throws Exception
 {
	 selectAccount.viewTransaction();
 }
 
 
 
 
 
 
 
	
	public void viewaccounts() throws Exception
	
	{
		manageHome.viewaccounts();
	}
	
}
