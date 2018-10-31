package expensespringApplication;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Scanner;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class getoperations {
	int id;
	float amount;
	String mode;
	String reason;
	float bal;
	getoperations()
	{
		
	}
	
	public getoperations(int id, float amount, String mode, String reason, float bal) {
		super();
		this.id = id;
		this.amount = amount;
		this.mode = mode;
		this.reason = reason;
		this.bal = bal;
	}
	private final String USER_AGENT = "Mozilla/5.0";
	
	String sendGet(String geturl) throws Exception {
		
		int number=0;
		
				String url=geturl;
				
				URL obj = new URL(url);
				HttpURLConnection con = (HttpURLConnection) obj.openConnection();

				
				con.setRequestMethod("GET");

				
				con.setRequestProperty("User-Agent", USER_AGENT);


				

				BufferedReader in = new BufferedReader(
				        new InputStreamReader(con.getInputStream()));
				String inputLine;
				StringBuffer response = new StringBuffer();

				while ((inputLine = in.readLine()) != null) {
					response.append(inputLine);
				}
				in.close();

				
				return (response.toString());

			}
	String sendGetforObject(String geturl) throws Exception {
		int number=0;
		
				String url=geturl;
				
				URL obj = new URL(url);
				HttpURLConnection con = (HttpURLConnection) obj.openConnection();

				
				con.setRequestMethod("GET");

				
				con.setRequestProperty("User-Agent", USER_AGENT);

              Scanner sc=new Scanner(con.getInputStream());
              String str = null;
              sc.useDelimiter("[|{|}|]");
			while(sc.hasNext())
			{    
				str=sc.next();
				  System.out.println(str);
			}
			
           
             
			

				
				return str;

			}
	String sendGetforObjectS(String geturl) throws Exception {
		int number=0;
		
				String url=geturl;
				
				URL obj = new URL(url);
				HttpURLConnection con = (HttpURLConnection) obj.openConnection();

				
				con.setRequestMethod("GET");

				
				con.setRequestProperty("User-Agent", USER_AGENT);
				  
				
				      
				 
				      
              Scanner sc=new Scanner(con.getInputStream());
              String str = null;
             
			while(sc.hasNext())
			{    
			str=sc.next(); 
		    }
			
			sc.close();
			
			GsonBuilder builder = new GsonBuilder(); 
			 
			Gson gson = builder.create();
			viewobjects[] viewobjects = gson.fromJson(str, viewobjects[].class); 
			System.out.println("id       amount         mode                reason       balance");
			int size=viewobjects.length;
		      for(int i=0;i<size;i++)
		    	  
		      {
		  
		    	  System.out.print(viewobjects[i].id+"        ");   
		    	  System.out.print(viewobjects[i].amount+"     ");   
		          System.out.print(viewobjects[i].mode+"     ");   
			      System.out.print(viewobjects[i].reason+"    ");     
			      System.out.print(viewobjects[i].bal+"\n"); 
		  
		     
		      }
			

				
				return "";

			}

	String sendGetforObjectForAccount(String geturl) throws Exception {
		int number=0;
		
				String url=geturl;
				
				URL obj = new URL(url);
				HttpURLConnection con = (HttpURLConnection) obj.openConnection();

				
				con.setRequestMethod("GET");

				
				con.setRequestProperty("User-Agent", USER_AGENT);
				  
				
				      
				 
				      
              Scanner sc=new Scanner(con.getInputStream());
              String str = null;
             
			while(sc.hasNext())
			{    
			str=sc.next(); 
		    }
			
			sc.close();
			
			GsonBuilder builder = new GsonBuilder(); 
			 
			Gson gson = builder.create();
			viewobjects[] viewobjects = gson.fromJson(str, viewobjects[].class); 
			System.out.println("id          name     ");
			int size=viewobjects.length;
		      for(int i=0;i<size;i++)
		    	  
		      {
		  
		    	  System.out.print(viewobjects[i].id+"        ");   
		    	  System.out.print(viewobjects[i].name+"     ");   
		    	  System.out.print("\n");
		     
		      }
			

				
				return "";

			}
}
