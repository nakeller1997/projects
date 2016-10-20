/*
Nick Keller
Midterm coding reverse palindrome
*/
import java.util.*;
import java.io.*;
public class test{


	public static void main(String[] args){
		File f = new File(args[0]);
		try{
			Scanner in = new Scanner(f);
			while(in.hasNext()){
				String s = (in.nextLine());
				if(s.equals(reverse(s)))
					System.out.println(s + " is a palindrome");
				else 
					System.out.println(s + " is not a palindrome, reversed " + s + " is " 
					+ reverse(s)); 
			}//while	
			in.close();
		}//try
			
		catch(IOException e){
		}
	}	
	public static String reverse(String s){
		if(s.length() <= 1)
			return s;
		else{
			return (s.charAt(s.length()-1) 
			+ reverse(s.substring(0,s.length()-1)));	
			}			
	}
}	

/*lithium is not a palindrome, reversed lithium is muihtil
evitative is a palindrome
kayak is a palindrome
noon is a palindrome
basics is not a palindrome, reversed basics is scisab
backwards is not a palindrome, reversed backwards is sdrawkcab
*/
