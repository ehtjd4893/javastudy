package ex01_char;


import java.io.*;

/*
 * FileReader 클래스
 * 1. 문자 기반 + 입력 스트림
 * 2. 문자를 읽을 때 사용
 * 	1) 통신: 상대방이 보낸 문자 받을 때
 * 	2) 파일: 텍스트 파일 읽을 때
 * 3. 입력 메소드
 * 	 read()
 * 4. 입력단위 char[], int
 * 5. 예외처리 필요
 * */


public class FileReaderMainClass2 {

	public static void main(String[] args) {
		try (FileReader fr = new FileReader("text4.txt")){
			char[] cbuf = new char[6];
			while(true) {
				int readCharCnt = fr.read(cbuf);
				if(readCharCnt != -1) {
					System.out.print(cbuf);
					
				}
				else
					break;
			}
		}catch(IOException e) {
			e.printStackTrace();
		}

	}
}
