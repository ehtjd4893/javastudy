package ex08_static;

public class Korean {

	public String name;	// 인스턴스 필드(인스턴스마다 다르다)
	public static String country = "한국";
	
	// 인스턴스가 10개 있다고 가정하면,
	// 메모리에 name은 10개,
	// country는 static이기 떄문에 1개만 생성됨.
}
