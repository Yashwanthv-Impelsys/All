import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Program 
{
	public static void main(String [] args)
	{
//		Account a1;
//		Map<String,Account> map1=new HashMap<>();
//		a1=new Account(1001,"Savings",2000);
//		map1.put("Acc1",a1);
//		a1=new Account(1002,"Savings",3000);
//		map1.put("Acc2",a1);
//		a1=new Account(1003,"Savings",4000);
//		map1.put("Acc3",a1);
//		
//		Account a=map1.get("Acc3");
//		
//		
		Account a1=new Account(1001,"Savings",2000);
		Account a2=new Account(1002,"Savings",3000);
		Account a3=new Account(1003,"Savings",4000);
		Account a4=new Account(1004,"Savings",5000);
		Account a5=new Account(1005,"Current",6000);
		
		Customer c1=new Customer("8951646636","Bangalore",56001,"Yash");
		Customer c2=new Customer("9851646636","Bangalore",56001,"mahes");
		Customer c3=new Customer("7951646636","chennai",60001,"mayur");
		Customer c4=new Customer("6951646636","Bangalore",56001,"Manju");
		
		Map<Account,Customer> mapAccCust=new TreeMap<>();
		mapAccCust.put(a1, c1);
		mapAccCust.put(a2, c2);
		mapAccCust.put(a3, c3);
		mapAccCust.put(a4, c4);
		mapAccCust.put(a5, c4);
		
//		for(int i=0;i<3;i++)
//		{
//		System.out.println("Enter the number to be searched");
//		Scanner scan=new Scanner(System.in);
//		int accno=Integer.parseInt(scan.nextLine());
//		Account searchAccount=new Account(accno, null, 0);
//		
//		Customer cust=mapAccCust.get(1003);
//		if(cust!=null)
//			System.out.println(cust.toString());
//		else
//			System.out.println("Not found");
//		}	
		
		System.out.println("-----------------------------------");
		for(Map.Entry<Account,Customer> entry : mapAccCust.entrySet())
		{
			Account key = entry.getKey();
			Customer value = entry.getValue();
			System.out.println("Account: =>"+key.toString());
			System.out.println("Customer: =>"+value.toString());
			System.out.println("**************************************");
		}
//		Map<Integer,Customer> map=new HashMap<>();
//		
//		map.put(1001, c1);
//		map.put(1002, c2);
//		map.put(1003, c3);
//		map.put(1004, c4);
//		
////		customer a=map.get(c4);
////		System.out.println(a.toString());
//	
//		
//		Customer c=map.get(1006);
//		if(c!=null)
//			System.out.println(c.toString());
//		else
//			System.out.println("Not exist");
//		Account aa1=new Account(1001, "Savings", 2000);
//		Account aa2=new Account(1001, "Savings", 2000);
//		if(aa1==aa2)
//			System.out.println("a");
//		else
//			System.out.println("b");
//		
//		Integer i1=new Integer(100);
//		Integer i2=new Integer(100);
//		if(i1==i2)
//			System.out.println("a");
//		else
//			System.out.println("b");
//		
//		
//		String s1="abc";
//		String s2="abc";
//		String s3=new String("abc");
//		System.out.println(s1.hashCode()+":"+s2.hashCode());
//		if(s1.hashCode()==s2.hashCode()&& s1.equals(s2)==true)
//			System.out.println("a");
//		else
//			System.out.println("b");
//		
	}
	

}
