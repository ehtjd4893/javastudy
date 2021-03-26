package ex02_byte;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * DataOutputStream 클래스
 * 1. 자바의 데이터타입 그대로 출력한다.
 * 2. String은 UTF, Bytes, chars를 통해 입력 가능
 * */
public class DataOutputStreamMainClass {

	public static void main(String[] args) {
		DataOutputStream dos = null;
		
		try {
			dos = new DataOutputStream(new FileOutputStream("byte3.dat"));
			int age = 44;
			double weight = 70.5;
			String name = "Alice";
			dos.write(age);
			dos.writeDouble(weight);
			dos.writeUTF(name);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			
				try {
					if(dos != null) dos.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}

	}

}
