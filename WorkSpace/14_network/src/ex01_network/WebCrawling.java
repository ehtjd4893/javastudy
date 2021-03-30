package ex01_network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class WebCrawling {
	public static void main(String[] args) {
		
		URL url = null;
		HttpURLConnection con = null;
		BufferedReader br = null;
		
		try {
			url = new URL("https://www.daum.net/");
			con = (HttpURLConnection)url.openConnection();
			br = new BufferedReader(new InputStreamReader(con.getInputStream()));
			
			String line = null;
			while((line = br.readLine()) != null) {
				// line : <a href="https://search.daum.net/search?w=tot&amp;q=%EC%9D%B4%EC%A7%80%ED%98%9C+%EC%82%AC%EA%B3%BC&amp;DA=NPI&amp;rtmaxcoll=NNS" class="link_favorsch @7">이지혜 사과</a>
				
				// 이와 같이 "link_favorsch"만 포함된 line이 필요
				//System.out.println(line);
				if(line.contains("link_favorsch @")) {
					String[] temps = line.split(">");
					
					System.out.println(temps[1].substring(0,temps[1].length()-3));
					System.out.println(line.split(">")[1].split("<")[0]);
				}
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if(br != null) br.close();
				if(con != null) con.disconnect();
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
}
