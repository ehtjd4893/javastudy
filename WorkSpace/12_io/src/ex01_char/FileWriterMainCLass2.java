package ex01_char;

import java.io.FileWriter;
import java.io.IOException;

/*
 * try-catch-resources문
 * 1. close() 메소드를 자동으로 호출하는 try문
 * try(스트림 생성){
 * 
 * } catch() {
 * 
 * }
 * 
 * */
public class FileWriterMainCLass2 {

	public static void main(String[] args) {
		try(FileWriter fw = new FileWriter("text2.txt")){
			String str = "abcHello";
			char[] cbuf = {'a','b','c',' ', 'J','a','v','a'};
			fw.write(str,3,str.length()-3); // 인덱스 3부터 나머지 길이
			fw.write(cbuf, 3, cbuf.length-3); // 인덱스 3부터 나머지 길이
			str = "bbbb\nNice to meet u";
			int ch = '!';
			fw.write(str,4,str.length()-4);
			fw.write(ch);
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

}
