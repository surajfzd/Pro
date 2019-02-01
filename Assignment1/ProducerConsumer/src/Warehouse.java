import java.util.Stack;
public class Warehouse 
{
	private Stack<Integer> goods=new Stack<>();
	
	public synchronized void addItem(int num)
	{
			if(goods.size()==10)
			{
				try
				{
					wait();
				}
				catch(InterruptedException  ex)
				{
					ex.printStackTrace();
				}
				
			}
			System.out.println("Item added: "+goods.push(num));
			notify();
	}
	
	
	public synchronized void remItem()
	{
		if(goods.size()==0)
		{
			try
			{
				wait();
			}
			catch(InterruptedException ex)
			{
				ex.printStackTrace();
			}
		}
		System.out.println("Item removed: "+goods.pop());
		notify();
	}
	
}
	


