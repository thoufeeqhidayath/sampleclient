package expensespringApplication;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class basicoperations {
	public void printOut(String input)
	{
		System.out.println(input);
	}
	
	public String readStringInput() throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String out=br.readLine();
		return out;
		
	}
	
	public int readIntInput() throws IOException
	{int out=0;
		try {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		out=Integer.parseInt(br.readLine());
		
	}catch(NumberFormatException e)
	{
		System.out.println("enter a number value");
		readIntInput();
	}
		return out;
	
	}
	
	public double readDoubleInput() throws IOException
	{
		Double out=0.0;
		try {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		out=Double.parseDouble(br.readLine());
		
	}catch(NumberFormatException e)
	{
		System.out.println("enter a number value");
		readIntInput();
	}
		return out;
	
	}
	

}
