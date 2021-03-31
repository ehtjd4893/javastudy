package ex03_socket;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerMainClass {

	public static void main(String[] args) {
		Socket client = null;
		ServerSocket server = null;
		BufferedInputStream bis = null;
		try {
			server = new ServerSocket();
			server.bind(new InetSocketAddress("localhost",4720));
			while(true) {
				System.out.println("=====서버 실행중=====");
				client = server.accept();
				InetSocketAddress isa = (InetSocketAddress)client.getRemoteSocketAddress();
				System.out.println(isa.getHostName() + " 접속");
				bis = new BufferedInputStream(client.getInputStream());
				byte[] b = new byte[50];
				int r = bis.read(b);
				String msg = new String(b,0,r,"UTF-8");
				System.out.println(msg); 
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
				try {
					if(bis != null) bis.close();
					if(!server.isClosed()) server.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
	}

}
