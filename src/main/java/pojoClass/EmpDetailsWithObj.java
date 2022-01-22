package pojoClass;

public class EmpDetailsWithObj {

	String name;
	Object spouse;
	int [] phNo;
	String emailId;
	public EmpDetailsWithObj(String name, Object spouse, int[] phNo, String emailId) {
		this.name = name;
		this.spouse = spouse;
		this.phNo = phNo;
		this.emailId = emailId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Object getSpouse() {
		return spouse;
	}
	public void setSpouse(Object spouse) {
		this.spouse = spouse;
	}
	public int [] getPhNo() {
		return phNo;
	}
	public void setPhNo(int [] phNo) {
		this.phNo = phNo;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	
	
}
