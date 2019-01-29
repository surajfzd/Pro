import java.util.*;
public class ArrayListExample {

	public static void main(String[] args) {
		
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(10);
		al.add(675);
		al.add(-5646);
		al.add(10000*10000*100000*10000);
		al.add(123%10);
		
		System.out.println("Elements of ArrayList: "+ al);
		System.out.println(al.size());
		
		al.remove(3);
		System.out.println("Elements of ArrayList: "+ al);
		System.out.println(al.size());
	}

}
