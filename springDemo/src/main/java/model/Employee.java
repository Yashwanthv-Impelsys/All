package model;

public class Employee {
	private String name;
	private String empId;
	private Device laptopDevice;
	
	 Employee(){
		
	}
	
	Employee(String name,Device device){
		this.name = name;
		this.laptopDevice=device;
	}

	public Device getDevice() {
		return laptopDevice;
	}

	public void setDevice(Device device) {
		this.laptopDevice = device;
	}

	public String getEmpId() {
		return empId;
	}

	public void setEmpId(String empid) {
		this.empId = empid;
		System.out.println("");
	}

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name=name;
		System.out.println("Emp name:"+ name);
	}

}
