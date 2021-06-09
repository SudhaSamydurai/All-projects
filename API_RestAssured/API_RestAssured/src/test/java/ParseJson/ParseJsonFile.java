package ParseJson;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import com.fasterxml.jackson.databind.ObjectMapper;

public class ParseJsonFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		byte[] jsonData = Files.readAllBytes(Paths.get("E:\\Workspace\\API_RestAssured\\API_RestAssured\\import\\simpleJson.json"));
		ObjectMapper mapper = new ObjectMapper();
		Person pojo =mapper.readValue(jsonData, Person.class);
		System.out.println(pojo.getAge());
		System.out.println(pojo.getEmail());
		System.out.println(pojo.getFirstName());
		System.out.println(pojo.getLastName());
		System.err.println(pojo.getAddress().getCity());
		System.err.println(pojo.getAddress().getState().toString());

	}

}
