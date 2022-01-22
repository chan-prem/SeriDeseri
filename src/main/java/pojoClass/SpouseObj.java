package pojoClass;

public class SpouseObj {
	
	String name;
	int [] phNos;
	String emailid;
	public SpouseObj(String name, int[] phNos, String emailid) {
		this.name = name;
		this.phNos = phNos;
		this.emailid = emailid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int[] getPhNos() {
		return phNos;
	}
	public void setPhNos(int[] phNos) {
		this.phNos = phNos;
	}
	public String getEmailid() {
		return emailid;
	}
	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
	
	

}
