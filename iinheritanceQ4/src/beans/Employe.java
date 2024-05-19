package beans;

public class Employe {
  private int eid;
  private String email;
public Employe(int eid, String email) {
	super();
	this.eid = eid;
	this.email = email;
}
public int getEid() {
	return eid;
}
public void setEid(int eid) {
	this.eid = eid;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
@Override
public String toString() {
	return "Employe [eid=" + eid + ", email=" + email + "]";
}
}
