package ex01_char;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class PrintWriterMainClass {

	public static void main(String[] args) {
		PrintWriter out = null;
		try {
			out = new PrintWriter("index.html");
			out.println("<script>");
			out.println("alert('Hello Java!')");
			out.println("</script>");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			try {
				if(out != null)
					out.close();
			} catch(Exception e) {
				e.printStackTrace();
			}
		}

	}

}
