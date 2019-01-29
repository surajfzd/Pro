//import java.util.Scanner;
public class Conversions {

	public static void main(String[] args) 
	{
		String s1="java";
		String s2="";
		char[] c2= {'a','b','c','d'};
		
		
//CharArray to String
		s2=String.valueOf(c2);
		System.out.println(s2);
//String to CharArray
		char c1[]=s1.toCharArray();	
		for(char out:c1)
		{
			System.out.println(out);
		}
	}
}
