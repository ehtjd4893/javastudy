package ex02_socket;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerMainClass {

	public static void main(String[] args) {
		ServerSocket server = null;
		Socket client = null;
		try {
			client = new Socket();
			System.out.println("클라이언트가 서버에 접속을 시도.");
			//socket.connect(new InetSocketAddress(InetAddress.getByNa
			
			// 서버 생성
			server = new ServerSocket();
			// 접속할 클라이언트
			server.bind(new InetSocketAddress("localhost", 4966));
			// 서버는 항상 켜져있다.(무한루프)
			while(true) {
				System.out.println("====서버가 실행중입니다====");
				// 클라이언트의 접속을 허용
				client = server.accept();
				// 클라이언트의 주소
				InetSocketAddress isa = (InetSocketAddress) client.getRemoteSocketAddress();
				System.out.println(isa.getHostName() + " 클라이언트가 접속되었습니다.");
				String msg = "Welcome to My Server!";
				OutputStream os = client.getOutputStream();
				os.write(msg.getBytes("UTF-8"));			
				os.flush(); // 혹시 스트림에 남아있는 데이터를 강제로 밀어내기.
			}
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			
			try {
				if(!client.isClosed())
					client.close();
				if(!server.isClosed())
					server.close();
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}
