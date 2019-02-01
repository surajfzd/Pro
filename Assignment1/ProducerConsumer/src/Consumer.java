
public class Consumer implements Runnable {
	Warehouse wh;
	public Consumer(Warehouse wh)
	{
		this.wh=wh;
	}
	
	@Override
	public void run()
	{
		while(true)
		{
			wh.remItem();
			try
			{
		         Thread.sleep(100);
			}
			catch(InterruptedException ex)
			{
				ex.printStackTrace();
			}
		}
	}

}
