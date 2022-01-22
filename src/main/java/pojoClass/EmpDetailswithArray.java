package pojoClass;

public class EmpDetailswithArray {
	
	String name;
	int [] phNos;
	String emailId;
	public EmpDetailswithArray(String name, int[] phNos, String emailId) {
		this.name = name;
		this.phNos = phNos;
		this.emailId = emailId;
	}
	public EmpDetailswithArray() {

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
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	
	

}
