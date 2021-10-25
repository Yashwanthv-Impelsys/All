
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

class fileReadWrite {

	public static void main(String[] args)
	{


		try {

			
			FileReader fr1 = new FileReader("a.txt");
			FileReader fr2 = new FileReader("b.txt");

			
			FileWriter fw = new FileWriter("c.txt");

			String str1 = "";
			String str2 = "";

			int i,j;

			
			while ((i = fr1.read()) != -1) {

				// Storing every character in the string
				str1 += (char)i;
			}

			
			System.out.println(str1);
			fw.write(str1);

			
			while ((j = fr2.read()) != -1) {

				// Storing every character in the string
				str2 += (char)j;
			}

			
			System.out.println(str2);

			fw.write(str2);
			
			fr1.close();
			fr2.close();
			fw.close();

			// Display message
			System.out.println(
				"File reading and writing both done");
		}

		// Catch block to handle the exception
		catch (IOException e) {

			System.out.println(
				"There are some IOException");
		}
	}
}
