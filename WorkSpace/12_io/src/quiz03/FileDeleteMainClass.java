package quiz03;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class FileDeleteMainClass {

	public static void main(String[] args) {
		File dir = new File("C:\\MyTemp");
		File[] fileList;
		if(dir.exists()) {
			fileList = dir.listFiles();
			for(File f : fileList) {
				System.out.println(f.getName() + " 삭제 완료");
				f.delete();
			}	
			
			if(dir.delete())
				System.out.println(dir.getAbsolutePath() + " 삭제");
		}
	}

}
