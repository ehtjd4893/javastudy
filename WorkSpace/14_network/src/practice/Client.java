package practice;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.Scanner;

public class Client {
	public static void main(String[] args) {
		Socket client = null;
		Scanner sc = null;
		try {
			client = new Socket();
			client.connect(new InetSocketAddress("localhost",6445));
			InputStream is = client.getInputStream();
			byte[] b = new byte[100];
			int length = is.read(b);
			System.out.println(new String(b,0,length,"UTF-8"));
			System.out.print("서버에 전할 말씀 >> ");
			sc = new Scanner(System.in);
			String msg = sc.nextLine();
			OutputStream os = client.getOutputStream();
			os.write(msg.getBytes("UTF-8"));
			
			if(is != null) is.close();
			if(os != null) os.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
				try {
					if(!client.isClosed())
						client.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
	}
}
