
package javaanddsa;
import java.io.*;
public class CheckedException {
	public static void main(String[] args) {
		try {
			File fos = new File("fos.txt");
			
			BufferedReader br = new BufferedReader(new FileReader(fos));
			
			String str;
			while((str = br.readLine()) != null) {
				System.out.println(str);
			}
			
		}
		catch(IOException ioe)
		{
			System.out.println("exception occured: " + ioe);
		}
	}

}

