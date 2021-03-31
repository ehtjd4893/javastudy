package ex04_socket_thread;

import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.InputStream;
import java.net.Socket;

public class FileUploadThread extends Thread {

	private FileWriter fw = null;
	private Socket client = null;
	
	public FileUploadThread() {}


	@Override
	public void run() {
		File dir = new File("C:\\MyServer");
		if(!dir.exists()) {
			dir.mkdirs();
		}
		try {
			// client가 파일명, 파일내용을 보내는 중
			DataInputStream dis = new DataInputStream(client.getInputStream());
			String filename = dis.readUTF();
			
			byte[] b = new byte[1024];
			int length;
			File file = new File(dir, filename);
			BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(file));
			while((length = dis.read(b)) != -1) {
				bos.write(b,0,length);
			}
			System.out.println(file.getAbsolutePath() + " 파일이 서버에 저장되었습니다.");
			bos.close();
			dis.close();
		}catch(Exception e) { e.printStackTrace();}
	}

	public Socket getClient() {
		return client;
	}

	public void setClient(Socket client) {
		this.client = client;
	}
	
	
	
	
}
