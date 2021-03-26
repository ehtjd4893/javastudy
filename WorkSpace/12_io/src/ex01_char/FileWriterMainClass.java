package ex01_char;

import java.io.FileWriter;
import java.io.IOException;

/*
 * FileWriter 클래스
 * 1. "문자 기반 + 출력 스트림" (Writer)
 * 2. 문자를 보낼 때 사용
 * 	1) 통신: 상대방에게 문자를 보낼 때
 * 	2) 파일: 텍스트 파일을 만들 때
 * 3. 출력 메소드
 * 	write()
 * 4. 출력 단위
 * 	char[], String, int
 * 5. 예외 처리 필요
 * */

public class FileWriterMainClass {

	public static void main(String[] args) {
		FileWriter fw = null;
		
		try {
			fw = new FileWriter("text1.txt");
			char[] cbuf = {'H','E','L','L','O'};
			String str = " Java";
			int ch = '!';
			fw.write(cbuf);
			fw.write(str);
			fw.write(ch);
			System.out.println("text1.txt 파일이 생성되었습니다.");
		}catch(IOException e) {
			e.printStackTrace();
		} finally { 
			try {
				if(fw != null)
					fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}	
		}

	}

}
