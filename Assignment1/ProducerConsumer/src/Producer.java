
public class Producer implements Runnable
{
	Warehouse wh;
	
	
	public Producer(Warehouse wh) {
		this.wh = wh;
	}
	@Override
	public void run()
	{
		while(true)
		{
			int num=(int)(Math.random()*100);
			wh.addItem(num);
			try
			{
				Thread.sleep(100);
			}
			catch(InterruptedException ex)
			{
				ex.printStackTrace();			}
		}
	}


}
