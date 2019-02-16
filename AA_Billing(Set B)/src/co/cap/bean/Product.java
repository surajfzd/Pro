package co.cap.bean;

public class Product 
{
	private int prodId;
	private String prodCat;
	private String prodName;
	private int prodPrice;
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Product(int prodId, String prodCat, String prodName, int prodPrice) {
		super();
		this.prodId = prodId;
		this.prodCat = prodCat;
		this.prodName = prodName;
		this.prodPrice = prodPrice;
	}
	public int getProdId() {
		return prodId;
	}
	public void setProdId(int prodId) {
		this.prodId = prodId;
	}
	public String getProdCat() {
		return prodCat;
	}
	public void setProdCat(String prodCat) {
		this.prodCat = prodCat;
	}
	public String getProdName() {
		return prodName;
	}
	public void setProdName(String prodName) {
		this.prodName = prodName;
	}
	public int getProdPrice() {
		return prodPrice;
	}
	public void setProdPrice(int prodPrice) {
		this.prodPrice = prodPrice;
	}
	@Override
	public String toString() {
		return "Product [prodId=" + prodId + ", prodCat=" + prodCat + ", prodName=" + prodName + ", prodPrice="
				+ prodPrice + "]";
	}
	
	

}
