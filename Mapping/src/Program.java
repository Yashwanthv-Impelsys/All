import java.util.List;
public class Program 
{

	public static void main(string[] args)
	{
		Student s1=new Student(1001,"Ajay");
		Student s1=new Student(1001,"Ajay");
		Student s1=new Student(1001,"Ajay");
		Student s1=new Student(1001,"Ajay");
		Student s1=new Student(1001,"Ajay");
		
		Faculty f1=new Faculty(2001,"Blake","CSE");
		Faculty f1=new Faculty(2001,"Blake","CSE");
		Faculty f1=new Faculty(2001,"Blake","CSE");
		List<Faculty> fc = new ArrayList<Faculty>();
		fc.add(f1);
		fc.add(f2);
		
		Student s1=new Student()
	}
}

class Student
{
	int roll;
	String name;
	List<Faculty> faculties;
	Student(int roll,String name,List<Faculty> fac)
	{
		this.roll=roll;
		this.name=name;
		this.faculties=fac;
	}
}
class  Faculty
{
	int empid;
	String name;
	String dept;
	List<Student> students;
	Faculty(int empid,String name,String dept)
	{
		this.dept=dept;
		this.empid=empid;
		this.name=name;
	}
	
}