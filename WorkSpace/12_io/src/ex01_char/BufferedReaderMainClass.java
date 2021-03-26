package ex01_char;

import java.io.*;

// BuffereWriter 클래스
// 1. 보조스트림
// 2. fileWriter 클래스와 같은 메인 스트림과 함께 사용
// 3. 내부 버퍼를 이용해서 동작 속도를 향상

public class BufferedReaderMainClass {

	public static void main(String[] args) {
		try(BufferedReader br = new BufferedReader(new FileReader("text4.txt"))){
			StringBuilder sb = new StringBuilder();
			
//			while(true) {
//				char[] cbuf = new char[5];
//				int readCharCnt = br.read(cbuf);
//				if(readCharCnt == -1)
//					break;
//				sb.append(cbuf,0,readCharCnt);
//			}
//			System.out.println(sb.toString());
			char[] cbuf = new char[5];
			int readCharCnt = 0;
			while((readCharCnt = br.read(cbuf)) != -1) {
				sb.append(cbuf,0,readCharCnt);
			}
			System.out.println(sb);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
