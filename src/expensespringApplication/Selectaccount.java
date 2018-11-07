package expensespringApplication;

import java.io.IOException;

public class Selectaccount extends basicoperations {
	String httpServer="http://localhost:8080/";
	
	public void selectoperation() throws Exception
	
	{
	
	printOut("Enter the option \n 1-DEPOSIT 2-WITHDRAW 3-TRANSFER 4-DELETE 5-UPDATE 6-UNDO 7-BALANCE 8-VIEW TRANSACTION1\n");
	int option=readIntInput();
	gotoOperation(option);
	
	}

	private void gotoOperation(int option) throws Exception {
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

	public void selectAccount() throws Exception
	
	{ 
		int  accountnumber=0;
		try 
		{
		printOut("Enter the number of account");
   accountnumber=readIntInput();
	
		}
		catch(NumberFormatException e)
	
		{
		printOut("Enter a valid Format");
		selectAccount();
	
		}
   
		String url = httpServer+"select?number="+accountnumber;
		getoperations objects=new getoperations();
		String result=objects.sendGet(url);
		printOut(result);
		selectoperation();
	}
	
	public void Deposit() throws Exception
	{
   
		printOut("Enter the amount");
		Double amount=readDoubleInput();
		printOut("Enter the Reason");
		String reason=readStringInput();
		String url = httpServer+"deposit?amount="+amount+"&reason="+reason;
		getoperations objects=new getoperations();
		String result=objects.sendGet(url);
		printOut(result);
		selectoperation();
		
	}
	
	public void Withdraw() throws Exception
	
	{
		   printOut("Enter the amount");
		   Double amount=readDoubleInput();
		   printOut("Enter the Reason");
		   String reason=readStringInput();
		    String url = httpServer+"withdraw?amount="+amount+"&reason="+reason;
		  
		    getoperations objects=new getoperations();
		    String result=objects.sendGet(url);
				printOut(result);
				selectoperation();
	}
	
	public void Transfer() throws Exception
	
	{
		int toaccount=0;
		printOut("Enter the account to transfer");
	  
		try 
		{
		toaccount=readIntInput();
	  
		}
		catch(NumberFormatException e)
	  
		{
		  printOut("enter a valid format");
	  
		}
		
		printOut("Enter the amount");
		  
		Double amount=readDoubleInput();
	    printOut("Enter the Reason");   
	    String reason=readStringInput();   
	    String url = httpServer+"transfer?toaccount="+toaccount+"&amount="+amount+"&reason="+reason;  
		getoperations objects=new getoperations();
		String result=objects.sendGet(url);
	    printOut(result);
		selectoperation();
		
	}
	
	public void Delete() throws Exception
	
	{
		printOut("Enter the id to delete");
		   int idnumber=readIntInput();
		   String url = httpServer+"delete?idnumber="+idnumber;
				  
			    getoperations objects=new getoperations();
			    String result=objects.sendGet(url);
					printOut(result);
					selectoperation();
	}
	
	public void Update() throws Exception
	
	{
		printOut("Enter the id to update");
		   int idnumber=readIntInput();
		   printOut("Enter the amount");
		   Double amount=readDoubleInput();
		   printOut("Enter the Reason");
		   String reason=readStringInput();
		   String url = httpServer+"update?idnumber="+idnumber+"&amount="+amount+"&reason="+reason;
				  
			    getoperations objects=new getoperations();
			    String result=objects.sendGet(url);
					printOut(result);
					selectoperation();
		
	}
	
	public void Undo() throws Exception
	
	{
		 String url = httpServer+"undo";
		   getoperations objects=new getoperations();
		    String result=objects.sendGet(url);
				printOut(result);
				 selectoperation();
		
	}
	
	public void Balance() throws Exception 
	
	{
		 String url = httpServer+"balance";
		   getoperations objects=new getoperations();
		    String result=objects.sendGet(url);
				printOut(result);
				 selectoperation();
	}
	
	public void viewTransaction() throws Exception 
	
	{
		 String url = httpServer+"viewtransaction";
		   getoperations objects=new getoperations();
		    String result=objects.sendGetforObjectS(url);
				printOut(result);
				 selectoperation();
	}

}
