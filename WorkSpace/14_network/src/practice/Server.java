package practice;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	public static void main(String[] args) {
		Socket client = null;
		ServerSocket server = null;
		
		try {
			server = new ServerSocket();
			server.bind(new InetSocketAddress("localhost",6445));
			while(true) {
				client = server.accept();
				System.out.println("====서버 실행중====");
				System.out.println(((InetSocketAddress)client.getRemoteSocketAddress()).getHostName() + "접속");
				BufferedOutputStream bos = new BufferedOutputStream(client.getOutputStream());
				bos.write((server.getLocalPort() + " 서버 접속을 환영합니다.").getBytes("UTF-8"));
				
				BufferedInputStream bis = new BufferedInputStream(client.getInputStream());
				byte[] b = new byte[100];
				int length = bis.read(b);
				System.out.println(new String(b,0,length,"UTF-8")); 
				
				if(bos != null)
					bos.close();
				if(bis != null)
					bis.close();
				
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
