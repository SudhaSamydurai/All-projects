package Serialization;

import java.util.List;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import io.restassured.path.json.JsonPath;

public class Deserialize  {

	public static void main(String[] args) throws JsonMappingException, JsonProcessingException {
		//Set the values first to serialize
		SetValuesForJson setvalues = new SetValuesForJson();
		ObjectMapper mapper = new ObjectMapper();
		String allEmloyees = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(setvalues.setValuesForEmployeeJson());
		System.out.println(allEmloyees);
		//then get the value to deserialize
		//1. Deserialize with mapper
		List<EmployeeDetails> allEmployeeDetails = mapper.readValue(allEmloyees, new TypeReference<List<EmployeeDetails>>() {
		});
		EmployeeDetails allEmployeeDetail = mapper.readValue(allEmloyees, EmployeeDetails.class);
		System.out.println("Emp First Name "+allEmployeeDetail.getempFirstName());
		for(EmployeeDetails employeeDetails: allEmployeeDetails) {
			
			System.out.println("================");
			System.out.println("Emp firstname is:" +employeeDetails.getempFirstName());
			System.out.println("Emp LastName is:" +employeeDetails.getempLastName());
			System.out.println("Emp Gender is:" +employeeDetails.getGender());
			System.out.println("Emp Salary is:" +employeeDetails.getSalary());

		}
		
		//2. Deserialize with JsonPath
		JsonPath path = new JsonPath(allEmloyees);
		List<String> companyName = path.getList("empFirstName");
		System.out.println(companyName.get(0));
		
		//3. deserialize from file
//		byte[] deserializeDataStream = allEmloyees.
		
	}

}
