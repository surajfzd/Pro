
public class ViewClass {

	public static void main(String[] args) {
		Warehouse wh=new Warehouse();
		
		Producer pro=new Producer(wh);
		Consumer con= new Consumer(wh);
		
		Thread t1=new Thread(pro);
		t1.start();
		Thread t2=new Thread(con);
		t2.start();

	}

}
