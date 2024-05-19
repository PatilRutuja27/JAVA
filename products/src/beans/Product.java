package beans;


import java.time.LocalDate;



public class Product implements Comparable<Product> {
	private int id;
	private String name;
	private int price;
	private LocalDate expDate;
	public Product(int id, String name, int price, LocalDate expDate) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.expDate = expDate;
	}
	public boolean equals(Object obj) {
		Product other=((Product)obj);
		System.out.println("in Product equals method"+this.id+"---->"+other.id);
		return this.id==other.id;
	}
	public int getId() {
		return id;
	}
	public Product(int id) {
			super();
			this.id = id;
		}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public LocalDate getExpDate() {
		return expDate;
	}
	public void setExpDate(LocalDate expDate) {
		this.expDate = expDate;
	}
	
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + ", expDate=" + expDate + "]";
	}
	    public int compareTo(Product o) {
			System.out.println("In compareTo"+this.price+"--->"+o.price);
			/*if(this.pid<o.pid) 
				return -1;
			else if (this.pid==o.pid)
				  return 0;
			else 
				return 1;*/
			return this.price-o.price;
			//return this.pid-o.pid; 
			//return this.pname.compareTo(o.pname);
		}
	
	
}
