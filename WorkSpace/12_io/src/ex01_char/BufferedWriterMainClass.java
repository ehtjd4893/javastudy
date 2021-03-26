package ex01_char;

import java.io.*;

// BuffereWriter 클래스
// 1. 보조스트림
// 2. fileWriter 클래스와 같은 메인 스트림과 함께 사용
// 3. 내부 버퍼를 이용해서 동작 속도를 향상

public class BufferedWriterMainClass {

	public static void main(String[] args) {
		FileWriter fw = null;
		BufferedWriter bw = null;
		try {
			fw = new FileWriter("text3.txt");
			bw = new BufferedWriter(fw);
			bw.write("안녕하세요.\n");
			bw.write("반갑습니다.");
		} catch(IOException e) {
			e.printStackTrace();
		} finally {
				try {
					// 보조 스트림 bw를 사용하는 경우 bw만 닫으면 됨.
					// fw는 닫지 않는다. bw가 자동으로 닫아줌.
					if(bw != null)
						bw.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
		}
		
	}

}
