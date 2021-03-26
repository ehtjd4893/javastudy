package quiz02;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopyProgram {

	public static void main(String[] args) {
		FileInputStream fis = null;
		FileOutputStream fos = null;
		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;
		
		try {
			fis = new FileInputStream("Coffee.mp4");
			fos = new FileOutputStream("Coffee_copy.mp4");
			bis = new BufferedInputStream(fis);
			bos = new BufferedOutputStream(fos);
			byte[] b = new byte[1024]; // 1KB짜리 그릇
			while(true) {
				int readByte = bis.read(b);
				if(readByte == -1)
					break;
				bos.write(b,0,readByte);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {			
				try {
					if(bis!=null) bis.close();
					if(bos!=null) bos.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
			
		}
		
		

	}

}
