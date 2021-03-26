package ex02_byte;
/*
 * FileOutputStream
 * 1. 바이트 기반 + 출력 스트림(Stream)
 * 2. 문자를 보낼 때 사용
 * 	1) 통신: 상대방에게 문자 보낼 때
 *  2) 파일: 파일 만들 때
 * 3. 출력 메소드
 *  write()
 * 4. 출력 단위
 *  byte[], int
 * 5. 예외 처리가 필요
 */

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamMainClass {
	public static void main(String[] args) {
		
		FileOutputStream fos = null;
		try {
			fos = new FileOutputStream("byte1.txt");
			String str1 = "Hello Java";
			String str2 = "안녕하세요. 반갑습니다.";
			int ch = '!';
			fos.write(str1.getBytes());
			fos.write(ch);
			fos.write('\n');
			fos.write(str2.getBytes());
			fos.write('\n');
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if(fos != null)
					fos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}	

