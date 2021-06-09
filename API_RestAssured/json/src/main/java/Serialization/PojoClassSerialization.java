package Serialization;


import org.json.JSONArray;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class PojoClassSerialization {
	public static String allJson;
	public static void main(String[] args) throws JsonProcessingException {
		
		SetValuesForJson setvalues = new SetValuesForJson();
		
		ObjectMapper mapper = new ObjectMapper();
		allJson = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(setvalues.setValuesForJson());
		System.out.println(allJson);

//		System.out.println(allEmployeeDetails.get(0).getFirstName());
//			for(EmployeeDetails obj : allEmployeeDetails) {
//				System.out.println(obj.getFirstName());
//				System.out.println(obj.getLastName());
//			}
	}
	
	
}
