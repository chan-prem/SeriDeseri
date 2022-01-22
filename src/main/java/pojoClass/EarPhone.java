package pojoClass;

public class EarPhone {
	
	String [] model;
	int [] companyPhNo;
	String modelNo;
	String color;
	String designedBy;
	Boolean waterResistance;
	String extraBattery;
	int noOfItems;
	Object [] batteries;
	Object parentCompany;
	public EarPhone(String[] model, int[] companyPhNo, String modelNo, String color, String designedBy,
			Boolean waterResistance, String extraBattery, int noOfItems, Object[] batteries, Object parentCompany) {
		this.model = model;
		this.companyPhNo = companyPhNo;
		this.modelNo = modelNo;
		this.color = color;
		this.designedBy = designedBy;
		this.waterResistance = waterResistance;
		this.extraBattery = extraBattery;
		this.noOfItems = noOfItems;
		this.batteries = batteries;
		this.parentCompany = parentCompany;
	}
	public String[] getModel() {
		return model;
	}
	public void setModel(String[] model) {
		this.model = model;
	}
	public int[] getCompanyPhNo() {
		return companyPhNo;
	}
	public void setCompanyPhNo(int[] companyPhNo) {
		this.companyPhNo = companyPhNo;
	}
	public String getModelNo() {
		return modelNo;
	}
	public void setModelNo(String modelNo) {
		this.modelNo = modelNo;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getDesignedBy() {
		return designedBy;
	}
	public void setDesignedBy(String designedBy) {
		this.designedBy = designedBy;
	}
	public Boolean getWaterResistance() {
		return waterResistance;
	}
	public void setWaterResistance(Boolean waterResistance) {
		this.waterResistance = waterResistance;
	}
	public String getExtraBattery() {
		return extraBattery;
	}
	public void setExtraBattery(String extraBattery) {
		this.extraBattery = extraBattery;
	}
	public int getNoOfItems() {
		return noOfItems;
	}
	public void setNoOfItems(int noOfItems) {
		this.noOfItems = noOfItems;
	}
	public Object getBatteries() {
		return batteries;
	}
	public void setBatteries(Object[] batteries) {
		this.batteries = batteries;
	}
	public Object getParentCompany() {
		return parentCompany;
	}
	public void setParentCompany(Object parentCompany) {
		this.parentCompany = parentCompany;
	}
	
	
	
	
}
