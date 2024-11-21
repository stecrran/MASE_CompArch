import java.io.*; 
public class Main_Adder { 
	public static void main(String [] args) throws Exception { 
		try { 
			new Adder(System.in).Start(); 
			System.out.println("Adder operation successful"); 
		}
		catch (Exception e) { 
			System.out.println("Adder Error : \n"+ e.toString()); 
			
			} 
		} 
	}