package ex02_String;

// 파일명과 확장자명 분리

public class Quiz03 {

	public static void main(String[] args) {
		String full_name = "2021-03-10.jpg";
		
		String fileName = full_name.substring(0, full_name.lastIndexOf("."));
		String extName = full_name.substring(full_name.lastIndexOf(".") + 1);
		
		System.out.println("파일명: " + fileName + "\n확장자명: " + extName);
		
	}

}
