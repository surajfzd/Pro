class A
{
									int x=5;
	public void show()
	{
									System.out.println("Hi");
	}
	
}
public class B extends A
{
									int x=10;
	public void show()
	{
									System.out.println("Hello");
	}

	public static void main(String[] args) 
	{
		 /*A a=new A();
		System.out.println(a.x);            // 5
		a.show();*/							// hi
		
		A a=new B();
		System.out.println(a.x);            // 5
		a.show();							// hello
		
		/*B a=new B();
		System.out.println(a.x);            // 5
		a.show();*/							// hello
		
		/*B a=new A();						// Error: Type Mismatch
		System.out.println(a.x);            
		a.show();*/							
	}

}
