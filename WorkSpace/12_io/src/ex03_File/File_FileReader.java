package ex03_File;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class File_FileReader {

	public static void main(String[] args) {
		File dir = new File("C:\\MyTemp");
		File file = new File(dir,"text.txt");
		FileReader fr = null;
		try {
			char[] cbuf = new char[6];
			 fr = new FileReader(file);
			 int ch = 0;
			 while((ch = fr.read()) != -1) {
				 System.out.print((char)ch);
			 }
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if(fr != null)fr.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}
