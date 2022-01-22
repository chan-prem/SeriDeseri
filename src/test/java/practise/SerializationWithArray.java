package practise;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

import pojoClass.EmpDetailswithArray;

public class SerializationWithArray {

	
	public static void main(String[] args) throws JsonGenerationException, JsonMappingException, IOException {
		int [] arr = {1234, 4321};
		EmpDetailswithArray e2 = new EmpDetailswithArray("prem", arr, "prem@gmail.com");
		ObjectMapper obj = new ObjectMapper();
		obj.writeValue(new File("./SampleWithArray.json"), e2);
		
	}
	
}
