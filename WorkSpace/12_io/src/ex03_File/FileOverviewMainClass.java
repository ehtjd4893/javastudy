package ex03_File;

import java.io.File;
import java.io.IOException;
import java.sql.Date;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;

/*
 * File 클래스
 * 1. 파일을 조작하는 클래스
 * 2. 파일 생성, 삭제, 파일명, 파일크기, 수정날짜 등 확인 가능
 * 
 * 
 * */
public class FileOverviewMainClass {

	public static void main(String[] args) {
		// 디렉토리 조작
//		File dir = new File("C:\\MyTemp"); // 경로 구분 = \\ = File.separator
		File dir = new File("C:" + File.separator + "MyTemp");	// Linux와 Windows 모두 호환 가능.
		// 위의 16,17번 줄은 동일한 코드
		System.out.println(dir.exists()); // 존재하는 경로이면 true, 아니면 false
		if(!dir.exists()) { // 존재하지 않으면
			dir.mkdirs();	// dir을 만들어라
			System.out.println("MyTemp 디렉토리가 생성되었습니다.");
		}

		/*
		 * if(dir.exists()) { dir.delete(); System.out.println("MyTemp 디렉토리가 삭제되었습니다.");
		 * }
		 */
		
		//File file = new File("C:\\MyTemp\\MyFile.txt");
		//File file = new File("C:\\MyTemp", "MyFile.txt");
		File file = new File(dir, "MyFile.txt");
		// 31,32,33번줄은 같은 코드
		
//		System.out.println(file.isFile());
//		System.out.println(file.isDirectory());
		if(!file.exists()) {
			try {
				file.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if(file.isFile()) 
			System.out.println(file.getName() + "는 파일입니다.");
		else if(file.isDirectory()) 
			System.out.println(file.getName() + "는 디렉토리입니다.");
		System.out.println(file.getAbsolutePath());
		System.out.println(file.getPath());
		System.out.println(file.getParent());
		System.out.println(file.getName());
		Date date = new Date(file.lastModified());
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd a h:mm:ss");
		System.out.println(sdf.format(date));
		System.out.println(file.length());
		file.setLastModified(System.currentTimeMillis());
		date = new Date(file.lastModified());
		System.out.println(sdf.format(date));
		
		// 디렉토리 내의 모든 디렉토리와 파일 목록 출력하기
		File javaDir = new File("C:\\Program Files\\Java\\jdk1.8.0_202");
		File[] files = javaDir.listFiles();
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd a hh:mm:ss");
		for(File f : files) {
			System.out.println(sdf2.format(f.lastModified()));
			if(f.isDirectory()) {
				System.out.print("<DIR>" + "\t");
			} else {
				System.out.print("\t" + new DecimalFormat("#,##0").format(f.length()));
			}
			System.out.println("\t" + f.getName());
		}
	}
	
	
}
