package ex01_network;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class OpenStreamMainClass {

	public static void main(String[] args) {
		
		URL url = null;
		HttpURLConnection con = null;
		InputStreamReader isr = null;
		BufferedReader br = null;
		StringBuilder sb = new StringBuilder();
		try {
			url = new URL("https://m.naver.com/");
			con = (HttpURLConnection)url.openConnection();
			isr = new InputStreamReader(con.getInputStream());
			br = new BufferedReader(isr);
			String str;
			while(true) {
				str = br.readLine();
				if(str != null)
					sb.append(str).append("\n");
				else
					break;
			}
			System.out.println(sb);
			System.out.println("글자수: " + sb.length());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			
				try {
					if(br!= null) br.close();
					if(con!=null) con.disconnect();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
		}

	}

}
