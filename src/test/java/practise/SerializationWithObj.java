package practise;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

import pojoClass.EmpDetailsWithObj;
import pojoClass.SpouseObj;

public class SerializationWithObj {

	
public static void main(String[] args) throws JsonGenerationException, JsonMappingException, IOException {

	int [] arr = {1234,4321};
	int [] arr1 = {4321,1234};
	
	SpouseObj aval = new SpouseObj("HumptyDumpty", arr1, "humdum@gmail.com");

	EmpDetailsWithObj e2 =new EmpDetailsWithObj("Prem", aval, arr, "prem@gmail.com");
	ObjectMapper obj = new ObjectMapper();
	obj.writeValue(new File("./SampleWithObj.json"), e2);
	
	
}

}
