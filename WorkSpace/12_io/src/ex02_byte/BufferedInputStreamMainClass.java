package ex02_byte;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class BufferedInputStreamMainClass {

	public static void main(String[] args) {
		try(BufferedInputStream bis = new BufferedInputStream(new FileInputStream("byte2.txt"))){
			byte[] bytes = new byte[5];
			while(true) {
				int readByte = bis.read(bytes);	// 읽은 데이터는 bytes에 저장 읽은 바이트의 수는 readByte에 저장
				if(readByte == -1)
					break;
				System.out.print(new String(bytes));
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
