package ex04_socket_thread;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerMainClass {

	public static void main(String[] args) {
		ServerSocket server = null;
		Socket client = null;
		try {
			server = new ServerSocket();
			server.bind(new InetSocketAddress("localhost",4720));
			while(true) {
				client = server.accept();
				FileUploadThread upload = new FileUploadThread();
				upload.setClient(client);
				upload.start();
				
			}
			
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
				try {
					if(!server.isClosed())
						server.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
		}

	}

}
