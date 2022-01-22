package pojoClass;

public class YJstEmpDetails {

	
	int id;
	String name;
	int phone;	
	int[] faxnum;
	Object spouse;
	Object spouse2;
	public YJstEmpDetails(int id, String name, int phone, int[] faxnum, Object spouse, Object spouse2) {
		this.id = id;
		this.name = name;
		this.phone = phone;
		this.faxnum = faxnum;
		this.spouse = spouse;
		this.spouse2 = spouse2;
	}
	
	public Object getSpouse2() {
		return spouse2;
	}

	public void setSpouse2(Object spouse2) {
		this.spouse2 = spouse2;
	}

	public Object getSpouse() {
		return spouse;
	}

	public void setSpouse(Object spouse) {
		this.spouse = spouse;
	}

	public YJstEmpDetails() {
		
	}

	public int getId() {
		return id;
	}
	
	public int[] getFaxnum() {
		return faxnum;
	}

	public void setFaxnum(int[] faxnum) {
		this.faxnum = faxnum;
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

	public int getPhone() {
		return phone;
	}

	public void setPhone(int phone) {
		this.phone = phone;
	}
	
}

