package beans;

public class Customer extends Employe {
	private String creditClass;
	
	private String type;
	private String mono;
	public Customer(int eid, String email,String creditClass,String type) {
		super(eid, email);
		this.creditClass=creditClass;
		this.type = type;
	}
	public Customer(int eid, String email,String creditClass,String type,String mono) {
		super(eid, email);
		this.creditClass=creditClass;
		this.type = type;
		this.mono=mono;
	}
	public String getCreditClass() {
		return creditClass;
	}
	public void setCreditClass(String creditClass) {
		this.creditClass = creditClass;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	@Override
	public String toString() {
		return "Customer "+super.toString()+"[creditClass=" + creditClass + ", type=" + type + "]";
	}
	
}
