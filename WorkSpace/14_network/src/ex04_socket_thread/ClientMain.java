package ex04_socket_thread;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.Scanner;

public class ClientMain {

	public static void main(String[] args) {
		Socket client = null;
		Scanner sc = new Scanner(System.in);
		File dir = null;
		File file = null;
		DataOutputStream dos = null;
		BufferedInputStream bis = null;
		try {
			client = new Socket();
			client.connect(new InetSocketAddress("localhost",4720));
			
			System.out.println("전송할 파일명 입력 >> ");
			String filename = sc.nextLine();
			
			dir = new File("C:\\MyTemp");
			file = new File(dir,filename);
			
			dos = new DataOutputStream(client.getOutputStream());
			dos.writeUTF(filename);
			
			// 파일 내용을 읽어서 서버로 보내기
			// 파일 내용 읽기 위해서 FileInputStream 필요
			// 성능 높이기 위해서 BufferedInputStream 사용
			bis = new BufferedInputStream(new FileInputStream(file));
			byte[] b = new byte[1024];
			int length = 0;
			while((length = bis.read(b)) != -1) {
				dos.write(b, 0, length);;
			}
			System.out.println(file.getAbsolutePath());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if (dos != null) dos.close();
				if (bis != null) bis.close();
				if (!client.isClosed()) client.close();
				sc.close();
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
	}

}
