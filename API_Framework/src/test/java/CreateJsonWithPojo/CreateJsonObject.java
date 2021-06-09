package CreateJsonWithPojo;

import java.util.ArrayList;
import java.util.List;

public class CreateJsonObject {
	
	private String firstName;
	private String lastName;
	private String email;
	private List<String> technologies;
	private Address address;
	
	public CreateJsonObject(String firstName, String lastName, String email) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		technologies = new ArrayList<String>();

	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public List<String> getTechnologies(){
		return this.technologies;
	}
	
	public void setTechnologies(List<String> technologies) {
		this.technologies=technologies;
	}
	public void addTechnologies(String technology) {
		this.technologies.add(technology);
	}
	
	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
}
