
public class NestedTry {

	public static void main(String[] args) {
		int a = 1234;
		int b = 10;

		try 
		{
			int c = a / b;
			System.out.println("Value of c: "+c);
			try 
			{
				int d=c/0;
				System.out.println("Value of d: "+ d);
			}
			catch(ArithmeticException ex)
			{
				System.out.println("Excep.: "+ ex.getMessage());
			}
			
		} 
		catch (ArithmeticException e) {
			System.out.println("Exceptione: "+ e.getMessage());

		}
	}

}
