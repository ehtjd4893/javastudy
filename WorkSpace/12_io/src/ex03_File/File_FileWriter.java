package ex03_File;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class File_FileWriter {

	public static void main(String[] args) {
		File dir = new File("C:\\MyTemp");
		
		if(dir.exists())
			dir.mkdirs();
		File file = new File(dir,"text.txt");
		FileWriter fw = null;
		try {
			fw = new FileWriter(file);
			fw.write("안녕하세요.");
			fw.write("\n");
			fw.write("반갑습니다.");
			System.out.println(file.getAbsolutePath() + " 파일이 생성되었습니다.");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
				try {
					if(fw != null)
						fw.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
		}

	}

}
