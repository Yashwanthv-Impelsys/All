
public class Customer 
{
	private String mobileNo;
	private String address;
	private int pincode;
	private String name;
	
	public String getMobileNo() {
		return mobileNo;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	public Customer(String mobileNo, String address, int pincode, String name) {
		super();
		this.mobileNo = mobileNo;
		this.address = address;
		this.pincode = pincode;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Customer [mobileNo=" + mobileNo + ", address=" + address + ", pincode=" + pincode + ", name=" + name
				+ "]";
	}

}
