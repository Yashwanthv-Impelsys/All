import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Descending {

	public static void main(String[] args) {
		Integer a[] =new Integer[]{ 8, 27, 64, 125, 256 };
		Arrays.sort(a, Collections.reverseOrder());
		System.out.println("The sorted array are:-");
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]+"");
		}


	}

}

// Integer[] cubes = new Integer[] { 8, 27, 64, 125, 256 }; 
// Arrays.sort(cubes, Collections.reverseOrder());

