package beans;

import java.util.Arrays;

public class Vendor extends Employe {
private String moNo;
private String[] product;
public Vendor(int eid, String email,String moNo,String[] product) {
	super(eid, email);
	this.moNo = moNo;
	this.product=product;
}
public String getMoNo() {
	return moNo;
}
public void setMoNo(String moNo) {
	this.moNo = moNo;
}
public String[] getProduct() {
	return product;
}
public void setProduct(String[] product) {
	this.product = product;
}
@Override
public String toString() {
	return "Vendor"+super.toString()+"[moNo=" + moNo + ", product=" + Arrays.toString(product) + "]";
}


}
