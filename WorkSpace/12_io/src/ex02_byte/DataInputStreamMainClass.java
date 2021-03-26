package ex02_byte;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;


public class DataInputStreamMainClass {

	public static void main(String[] args) {
		DataInputStream dis = null;
		
		try {
			dis = new DataInputStream(new FileInputStream("byte3.dat"));
			int age = dis.readInt();
			double weight = dis.readDouble();
			String name = dis.readUTF();
			System.out.println(age);
			System.out.println(weight);
			System.out.println(name);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
				try {
					if(dis != null) dis.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
		

	}

}
