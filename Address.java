public class Address {
	private String name;
	private String hno;
	private String society;
	private String pincode;
	
	public Address(String name,String hno,String society,String pincode) {
		this.name= name;
		this.hno= hno;
		this.society= society;
		this.pincode= pincode;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getHno() {
		return hno;
	}

	public void setHno(String hno) {
		this.hno = hno;
	}

	public String getSociety() {
		return society;
	}

	public void setSociety(String society) {
		this.society = society;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	
	public void displayAddress() {
		System.out.println("The address is: ");
		System.out.println(this.name+", "+this.hno+", "+this.society+", "+this.pincode);
	}
}