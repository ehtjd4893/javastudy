package ex01_network;

import java.net.MalformedURLException;
import java.net.URL;

public class URLMainClass {

	public static void main(String[] args) {
		URL url1 = null;
		URL url2 = null;
		// URL : Uniform Resource Locator
		// 형식이 정해져 있는
		// 프로토콜://호스트:포트?파라미터
		// 
		try {
			url1 = new URL("https://comic.naver.com/index.nhn?query=java"); 
			System.out.println(url1.getHost());	// www.naver.com
			System.out.println(url1.getDefaultPort()); // 443
			System.out.println(url1.getProtocol());	// https
			System.out.println(url1.getQuery());	// query=java
			
			url2 = new URL("https://www.naver.com/webtoon/webtoon.jsp");
			System.out.println(url2.getFile());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
