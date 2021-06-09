package CreateJsonWithPojo;

public class Address {
	
	private String flatno;
	private String streetName;
	private String City;
	private String pinCode;
	
	public Address(String flatno, String streetName, String City, String pincode) {
		this.flatno = flatno;
		this.streetName = streetName;
		this.City = City;
		this.pinCode = pincode;
	}
	
	public String getFlatno() {
		return flatno;
	}
	public void setFlatno(String flatno) {
		this.flatno = flatno;
	}
	public String getStreetName() {
		return streetName;
	}
	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	public String getPinCode() {
		return pinCode;
	}
	public void setPinCode(String pinCode) {
		this.pinCode = pinCode;
	}
	
	

}
