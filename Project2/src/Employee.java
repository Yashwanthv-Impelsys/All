
public class Employee 
{
	int empid;
	String ename;
	float sal;
	char grade;
	static int noe=0;
	final static int nol=21;
	Employee()
	{
		System.out.println("OverLoaded Default cons invoked");
		this.ename="NA";
	}
	Employee(int empno,String ename,float sal)
	{
		this.empid=empno; this.ename=ename; this.sal=sal;
		
	}
	void showData()
	{
		System.out.println(this.empid+":"+this.ename+":"+this.sal);
	}
//	Employee(int empid,String ename,)
//	{
//		System.out.println("OverLoaded Default cons invoked");
//	}
}
