import java.io.*; 
public class Main_Adder1 { 
	public static void main(String [] args) throws Exception { 
		try { 
			new Adder1(System.in).Start(); 
			System.out.println("Adder1 operation successful"); 
		}
		catch (Exception e) { 
			System.out.println("Adder1 Error : \n"+ e.toString()); 
			
			} 
		} 
	}