package json;

import java.util.ArrayList;

import org.json.JSONArray;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Serialization {

	public static void main(String[] args) throws JsonProcessingException {
		// TODO Auto-generated method stub
		Pojo pojo = new Pojo();
		pojo.setFirstName("Sudha");
		pojo.setLastName("Shivaani");
		pojo.setAge("30");
		
		Address address = new Address();
		address.setFlatno("30");
		address.setStreetName("Sai Nager");
		address.setCity("Chennai");
		ArrayList<Address> addressList = new ArrayList<Address>();
		addressList.add(address);
		addressList.add(address);
		pojo.setAddress(addressList);
		JSONArray array = new JSONArray();
		array.put(pojo);
		array.put(pojo);
		ObjectMapper mapper = new ObjectMapper();
		String json = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(pojo);
		System.out.println(json);
			}

}
