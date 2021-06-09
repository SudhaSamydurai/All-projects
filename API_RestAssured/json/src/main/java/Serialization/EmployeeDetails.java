package Serialization;

public class EmployeeDetails {
	
	private String empFirstName;
	private String empLastName;
	private String gender;
	private int age;
	private Double salary;
	private boolean isMarried;
	
	public String getempFirstName() {
		return empFirstName;
	}
	public void setempFirstName(String firstName) {
		this.empFirstName = firstName;
	}
	public String getempLastName() {
		return empLastName;
	}
	public void setempLastName(String lastName) {
		this.empLastName = lastName;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	public boolean isMarried() {
		return isMarried;
	}
	public void setMarried(boolean isMarried) {
		this.isMarried = isMarried;
	}
	
	

}
