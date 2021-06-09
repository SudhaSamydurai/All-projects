package Serialization;

import java.util.ArrayList;
import java.util.List;

public class SetValuesForJson {

	public NestedPojo setValuesForJson() {
		NestedPojo pojoObject = new NestedPojo();
		pojoObject.setCompanyName("Test Automation");
		pojoObject.setCompanyCeo("Sudha");
		pojoObject.setCompanyCity("Hyderabad");

		List<String> setsupportedSalaryBanks = new ArrayList<String>();
		setsupportedSalaryBanks.add("HDFC");
		setsupportedSalaryBanks.add("SCB");
		setsupportedSalaryBanks.add("Citi");
		setsupportedSalaryBanks.add("Axis");
		pojoObject.setsupportedSalaryBanks(setsupportedSalaryBanks);
		
		List<Integer> pincodesOfCityOffices = new ArrayList<Integer>();
		pincodesOfCityOffices.add(12332);
		pincodesOfCityOffices.add(13233);
		pincodesOfCityOffices.add(34324);
		pojoObject.setPincodeOfCityOffices(pincodesOfCityOffices);
		
		//Employee1
		EmployeeDetails employee1 = new EmployeeDetails();
		employee1.setempFirstName("Sudha");
		employee1.setempLastName("Sudha");
		employee1.setGender("female");
		employee1.setAge(30);
		employee1.setSalary(1000.12);
		employee1.setMarried(true);
		//Employee2
		EmployeeDetails employee2 = new EmployeeDetails();
		employee2.setempFirstName("Maheswari");
		employee2.setempLastName("Sudha");
		employee2.setGender("female");
		employee2.setAge(55);
		employee2.setSalary(1023.12);
		employee2.setMarried(true);
		//Employee3
		EmployeeDetails employee3 = new EmployeeDetails();
		employee3.setempFirstName("Samydurai");
		employee3.setempLastName("Sudha");
		employee3.setGender("Male");
		employee3.setAge(63);
		employee3.setSalary(212.12);
		employee3.setMarried(true);
		
		List<EmployeeDetails> setEmployeeDetails = new ArrayList<EmployeeDetails>();
		setEmployeeDetails.add(employee1);
		setEmployeeDetails.add(employee2);
		setEmployeeDetails.add(employee3);
		pojoObject.setEmployee(setEmployeeDetails);
		
		//Contractors 1
		Contractors contractors = new Contractors();
		contractors.setFirstName("vijaya");
		contractors.setLastName("yanala");
		contractors.setContractfrom("01-02-2020");
		contractors.setContractTo("31-12-2022");
		//Contractors 2
		Contractors contractors2 = new Contractors();
		contractors2.setFirstName("sahitya");
		contractors2.setLastName("bukka");
		contractors2.setContractfrom("01-02-2017");
		contractors2.setContractTo("06-12-2022");
		
		List<Contractors> setContractorDetailList = new ArrayList<Contractors>();
		setContractorDetailList.add(contractors);
		setContractorDetailList.add(contractors2);
		pojoObject.setContractors(setContractorDetailList);
		
		CompnayPFDetails setPFDetails = new CompnayPFDetails();
		setPFDetails.setPfName("EMp - 122323");
		setPFDetails.setPfCity("Gurgaon");
		setPFDetails.setPfYear("2012");
		setPFDetails.setNoOfYears(10);
		pojoObject.setPfDetails(setPFDetails);
		
		return pojoObject;
	}
	
	public List<EmployeeDetails> setValuesForEmployeeJson() {
		List<EmployeeDetails> allEmpDetails = new ArrayList<EmployeeDetails>();
		
		
		//Employee1
		EmployeeDetails employee1 = new EmployeeDetails();
		employee1.setempFirstName("Sudha");
		employee1.setempLastName("Sudha");
		employee1.setGender("female");
		employee1.setAge(30);
		employee1.setSalary(1000.12);
		employee1.setMarried(true);
		//Employee2
		EmployeeDetails employee2 = new EmployeeDetails();
		employee2.setempFirstName("Maheswari");
		employee2.setempLastName("Sudha");
		employee2.setGender("female");
		employee2.setAge(55);
		employee2.setSalary(1023.12);
		employee2.setMarried(true);
		//Employee3
		EmployeeDetails employee3 = new EmployeeDetails();
		employee3.setempFirstName("Samydurai");
		employee3.setempLastName("Sudha");
		employee3.setGender("Male");
		employee3.setAge(63);
		employee3.setSalary(212.12);
		employee3.setMarried(true);
		
		allEmpDetails.add(employee1);
		allEmpDetails.add(employee2);
		allEmpDetails.add(employee3);
		
		return allEmpDetails;
	}
}
