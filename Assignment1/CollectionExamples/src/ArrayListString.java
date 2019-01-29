import java.util.ArrayList;
public class ArrayListString {



	public static void main(String[] args) {
		
		ArrayList<String> al=new ArrayList<String>();
		al.add("10");
		al.add("StRiNg");
		al.add("Null");
		al.add("123*456");
		al.add("123%10");
		
		System.out.println("Elements of ArrayList: "+ al);
		System.out.println(al.size());
		
		al.remove(3);
		System.out.println("Elements of ArrayList: "+ al);
		System.out.println(al.size());
	}

}
