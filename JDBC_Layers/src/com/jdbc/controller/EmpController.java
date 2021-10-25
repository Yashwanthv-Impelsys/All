package com.jdbc.controller;

import java.util.ArrayList;
import java.util.List;

import com.jdbc.model.Emp;
import com.jdbc.model.EmpOper;
//import com.mysql.jdbc.UpdatableResultSet;

public class EmpController 
{
	public static boolean addEmployee(int eno,String nam,String job,float sal,int dno)
	{
		Emp e=new Emp(eno,nam,job,sal,dno);
		if(EmpOper.addEmployee(e))
			return true;
		return false;
		
	}
	
	public static List<Emp> showAllEmployees()
	{
		List<Emp> arr=new ArrayList<Emp>();
		arr=EmpOper.showAllEmployees();
		return arr;
	}
	
public static boolean updateSalByEmpno(int empno,float newsal)
{
	Emp e=new Emp();
	e.setEmpno(empno);
	e.setSal(newsal);
	if(EmpOper.updateSalByEmpno(e))
		return true;
	else
		return false;
	
}
}
