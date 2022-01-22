package practise;

import pojoClass.Battery1Earphone;
import pojoClass.Battery2Earphone;
import pojoClass.EarPhone;
import pojoClass.ParentCompanyEarphone;

public class EarPhoneSerialization {
	
	public static void main(String[] args) {
		
		String [] model = {"OnePlus","ZBass"};
		int[] companyPhNo = {1234,4321};
		Battery1Earphone ba1 = new Battery1Earphone("Lithium", 3);
		Battery2Earphone ba2 = new Battery2Earphone("Cadmium", 3);
	    Object [] battery = {ba1, ba2};
	    ParentCompanyEarphone pobj = new ParentCompanyEarphone("Parent",7, "ads@gmail.com");
	    
	    EarPhone e = new EarPhone(model, companyPhNo, "OP1234", "blue", "OnePlus", true, null, 5, battery, pobj);
		
	}

}
