package ex03_socket;

import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.Scanner;

public class ClientMainClass {

	public static void main(String[] args) {
		Socket client = null;
		Scanner sc = null;
		BufferedOutputStream bos= null;
		try {
			client = new Socket();
			client.connect(new InetSocketAddress("localhost", 4720));
			System.out.println("서버 접속 성공");
			
			sc = new Scanner(System.in);
			System.out.print("서버에 보낼 메세지 >> ");
			String msg = sc.nextLine();
			bos =  new BufferedOutputStream(client.getOutputStream());
			bos.write(msg.getBytes("UTF-8"));
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
				try {
					if(bos != null) bos.close();
					if(!client.isClosed())
						client.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
	}

}
