
public class NestedTryInsideCatch {

	public static void main(String[] args) {
		int a = 1234;
		int b = 10;
		int c=0,d=0;

		try {
			c = a / b;
			System.out.println("Value of c: " + c);
			
		} 
		catch (ArithmeticException e) 
		{
			System.out.println("Exceptione: " + e.getMessage());
			
		}
	}

}
