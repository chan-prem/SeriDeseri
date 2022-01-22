package practise;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

import pojoClass.Spouse;
import pojoClass.Spouse2;
import pojoClass.YJstEmpDetails;

public class YJstSerialization {
	
	public static void main(String[] args) throws JsonGenerationException, JsonMappingException, IOException {
		
			
		int [] arr = {1323,1231};
		Spouse obj1 = new Spouse(9876, "HumPty");
		Spouse2 obj2 = new Spouse2(234, "Dumpty");
		
		YJstEmpDetails e =  new YJstEmpDetails(13, "Prem", 987, arr, obj1, obj2);
		ObjectMapper obj = new ObjectMapper();
		obj.writeValue(new File("./sampleee.json"), e);
		
		
	}

}
