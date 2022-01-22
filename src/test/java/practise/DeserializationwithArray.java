package practise;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

import pojoClass.EmpDetailswithArray;

public class DeserializationwithArray {
	
	public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException {
		
		ObjectMapper obj = new ObjectMapper();
		EmpDetailswithArray e2 = obj.readValue(new File("./SampleWithArray.json"), EmpDetailswithArray.class);
	
		int[] i = e2.getPhNos();
		
		
		System.out.println(i[1]);

		System.out.println(i[0]);
/*
		for(int count = 0; count < 2; count++)
		{
			System.out.println(i[count]);
		}*/
	}
}


