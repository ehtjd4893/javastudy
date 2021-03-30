package quiz02;

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
			url = new URL("https://zum.com/#!/home");
			con = (HttpURLConnection)url.openConnection();
			br = new BufferedReader(new InputStreamReader(con.getInputStream()));
			
			String line = null;
			while((line = br.readLine()) != null) {
				// line : <a href="https://search.zum.com/search.zum?method=uni&amp;option=accu&amp;qm=g_guidetxt.top&amp;query=%EC%A7%80%EC%97%B0%EC%88%98%20%EC%A0%84%ED%99%94%20%EC%9D%B4%ED%98%BC" class="d_guide_query_click">지연수 전화 이혼</a>
				// class="d_guide_query_click">
				// 이와 같이 "link_favorsch"만 포함된 line이 필요
				//System.out.println(line);
				if(line.contains("<span>")) {
					String[] temps = line.split(">");
					for(int i =0; i< temps.length;i++) {
						System.out.println(temps[i]);
					}
					break;
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
