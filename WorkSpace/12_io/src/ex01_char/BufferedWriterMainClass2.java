package ex01_char;

import java.io.*;

// BuffereWriter 클래스
// 1. 보조스트림
// 2. fileWriter 클래스와 같은 메인 스트림과 함께 사용
// 3. 내부 버퍼를 이용해서 동작 속도를 향상

public class BufferedWriterMainClass2 {

	public static void main(String[] args) {
		try (FileReader fr = new FileReader("text4.txt")){
			char[] cbuf = new char[5];
			while(true) {
				int readCharCnt = fr.read(cbuf);
				if(readCharCnt != -1) {
					System.out.print(cbuf);
					cbuf = null;
				}
				else
					break;
			}
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

}
