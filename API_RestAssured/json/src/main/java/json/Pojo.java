package json;

import java.util.List;

public class Pojo {
	private  String lastName;
	private  String age;
	private  List<Address> address;
	private  String firstName;
	
	public  String getFirstName() {
		return firstName;
	}
	public  void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public  String getLastName() {
		return lastName;
	}
	public  void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public  String getAge() {
		return age;
	}
	public  void setAge(String age) {
		this.age = age;
	}
	public  List<Address> getAddress() {
		return address;
	}
	public  void setAddress(List<Address> address) {
		this.address = address;
	}
	
}
