package quiz01;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.net.HttpURLConnection;
import java.net.URL;

public class MainClass {
	
	// https://m.naver.com/ 의 소스코드를
	// C:\mnaver.html 파일로 저장하라
	public static void main(String[] args) {
		URL url = null;
		HttpURLConnection con = null;
		BufferedReader br = null;
		StringBuilder sb = new StringBuilder();
		File file = null;
		BufferedWriter bw = null;
		
		try {
			// 네이버 모바일 페이지 소스코드 읽기
			url = new URL("https://m.naver.com/");
			con = (HttpURLConnection)url.openConnection();		
			br = new BufferedReader(new InputStreamReader(con.getInputStream()));
			file = new File("C:\\mnaver.html");
			bw = new BufferedWriter(new FileWriter(file));
			while(true) {
				String str = br.readLine();
				if(str == null)
					break;
				
				bw.write(str + "\n");
			}
			System.out.println(file.getAbsolutePath() + "파일이 생성되었습니다.");
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		try {
			if(bw != null) bw.close();
			if(br != null) br.close();
			if(con != null) con.disconnect();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}

