import java.util.ArrayList;

public class ArrayList1 {
	
	public static void main(string [] args)
	{
		ArrayList arr=new ArrayList();
		arr.add("Java");
		arr.add(123);
		arr.add(45,56f);
		Employee e1=new Employee();
		e1.setEmpno(1001);e1.setName("Jack");
		arr.add(e1);
		arr.add(45.56f);
		System.out.println("No of elements in arrayList:"+arr.size());
		for( Object obj : arr)
		{
			System.out.println(obj.toString());
		}
		
	}

}
//class  Employee
//{
//	
//}