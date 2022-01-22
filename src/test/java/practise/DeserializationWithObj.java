package practise;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

import pojoClass.YJstEmpDetails;

public class DeserializationWithObj {
	
	public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException {
		
		ObjectMapper obj = new ObjectMapper();
		
		YJstEmpDetails e = obj.readValue(new File("./sampleee.json"), YJstEmpDetails.class);
		
		System.out.println(e.getId());
		int[] faxnum = e.getFaxnum();
		System.out.println(faxnum[1]);
		System.out.println(faxnum[0]);
		
		System.out.println(e.getSpouse());
		System.out.println(e.getSpouse2());
		
		
	}

}
