package com.jdbc.model;

import java.util.ArrayList;
import java.util.List;

import com.jdbc.dao.EmpDAO;

public class EmpOper {

	public static boolean addEmployee(Emp obj)
	{
		if(obj.getSal()>10000 && obj.getSal()<500000)
		{
			
		}
		if(obj.getDepno()==10 || obj.getDepno()==20 || obj.getDepno()==30 || obj.getDepno()==40)
		{
			
		}
		if(EmpDAO.addEmployee(obj))
			return true;
		return false;
		
	}
	public static List<Emp> showAllEmployees()
	{
		List<Emp> arr= EmpDAO.showAllEmployees();
		return arr;
	}
	public static boolean updateSalByEmpno(Emp obj)
	{
		if(EmpDAO.updateSalByEmpno(obj))
			return true;
		else
			return false;
	}
}
