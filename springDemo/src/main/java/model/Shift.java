package model;
import java.util.List;

public class Shift {
	private String shiftType;
	
	private List<Employee> empList;

	public String getShiftType() {
		return shiftType;
	}

	public void setShiftType(String shiftType) {
		this.shiftType = shiftType;
	}

	public List<Employee> getEmpList() {
		return empList;
	}

	public void setEmpList(List<Employee> empList) {
		this.empList = empList;
	}
	
	

}

