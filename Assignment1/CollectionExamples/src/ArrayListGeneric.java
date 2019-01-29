import java.util.ArrayList;

public class ArrayListGeneric {

	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add(10);
		al.add("StRiNg");
		al.add("Null");
		al.add(123*456);
		al.add("123%10");
		al.add("ID123");
		
		System.out.println("Elements of ArrayList: "+ al);
		System.out.println(al.size());
		
		al.remove(3);
		//System.out.println("Elements of ArrayList: "+ al);
		//System.out.println(al.size());
		for(int i=0; i<al.size(); i++)
		{
			System.out.print(al.get(i)+" ");
			
		}
		
		
	}

}
