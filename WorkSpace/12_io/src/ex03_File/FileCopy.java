package ex03_File;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy {

	public static void main(String[] args) {
		
		// 원본 Coffee.mp4
		// FileInputStream 을 통해 읽는다.
		FileInputStream fis = null;
		FileOutputStream fos = null;
		// 복사본 c:\\MyTemp\\Coffee.mp4
		// 경로 지정을 위해 file 클래스 이용
		// FileOutputStream을 통해서 만든다.
		File cpy = new File("C:\\MyTemp", "Coffee.mp4");
		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;	// 버퍼드를 이용해 성능 높이기 가능.
		try {
			fis = new FileInputStream("Coffee.mp4");
			fos = new FileOutputStream(cpy);
			bis = new BufferedInputStream(fis);
			bos = new BufferedOutputStream(fos);
			long start = System.currentTimeMillis();
			byte[] b = new byte[10];
			int length = 0;
			while((length = bis.read(b)) != -1) {
					bos.write(b,0,length);
			}
			long end = System.currentTimeMillis();
			System.out.println(cpy.getAbsolutePath()+ " 파일이 복사되었습니다.");
			System.out.println("복사 소요시간: " + ((end - start) * 0.001) + "초");
		} catch(Exception e) {
			e.printStackTrace();
		} finally {try {
			if(bos!=null) bos.close();
			if(bis!=null) bis.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}}
	}

}
