package Serialization;

import java.util.List;

public class NestedPojo {
	private String companyName;
	private String companyCity;
	private String companyCeo;
	private List<String> supportedSalaryBanks;
	private List<Integer> pincodeOfCityOffices;
	private List<EmployeeDetails> employee;
	private List<Contractors> contractors;
	CompnayPFDetails pfDetails;
	
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getCompanyCity() {
		return companyCity;
	}
	public void setCompanyCity(String companyCity) {
		this.companyCity = companyCity;
	}
	public String getCompanyCeo() {
		return companyCeo;
	}
	public void setCompanyCeo(String companyCeo) {
		this.companyCeo = companyCeo;
	}
	public List<String> getSupportedSalaryBanks(){
		return supportedSalaryBanks;
	}
	public void setsupportedSalaryBanks(List<String> supportedSalaryBanks) {
		this.supportedSalaryBanks = supportedSalaryBanks;
	}
	public List<Integer> getPincodeOfCityOffices(){
		return pincodeOfCityOffices;
	}
	public void setPincodeOfCityOffices(List<Integer> pincodeOfCityOffices) {
		this.pincodeOfCityOffices = pincodeOfCityOffices;
	}
	public List<EmployeeDetails> getemployee (){
		return employee;
	}
	public void setEmployee(List<EmployeeDetails> employee) {
		this.employee = employee;
	}
	public List<Contractors> getContractors() {
		return contractors;
	}
	public void setContractors(List<Contractors> contractors) {
		this.contractors = contractors;
	}
	public CompnayPFDetails getPfDetails() {
		return pfDetails;
	}
	public void setPfDetails(CompnayPFDetails pfDetails) {
		this.pfDetails = pfDetails;
	}
	

}
