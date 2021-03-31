package ex02_socket;

import java.io.IOException;
import java.io.InputStream;
import java.net.InetSocketAddress;
import java.net.Socket;

public class ClientMainClass {

	public static void main(String[] args) {
		Socket socket = null;
		try {
			socket = new Socket();
			socket.connect(new InetSocketAddress("localhost", 4966));	// 클라이언트가 서버에 접속을 시도.
			//socket.connect(new InetSocketAddress(InetAddress.getByName("localhost"), 4966));	// 클라이언트가 서버에 접속을 시도.
			System.out.println("접속 성공");
			InputStream is = socket.getInputStream();
			byte[] bytes = new byte[50];
			int length = is.read(bytes);
			String msg = new String(bytes,0,length, "UTF-8");
			System.out.println(msg);
			
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(!socket.isClosed())
					socket.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
