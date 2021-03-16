package ex01_Variable;

public class Ex04_reference_type {

	public static void main(String[] args) {
		
		// Reference type:
		// primitive type을 제외한 모든 자료형
		String s1 = "apple";				// "apple" 값을 갖는 오브젝트의 주소값(참조값)을 갖는다.
		String s2 = new String("apple");
		String s3 = s1;
		String s4 = s2;
		
		System.out.println(s1);
		System.out.println(s2);
		
		// s1, s2는 같은 값을 갖는가..? no! s1과 s2의 주소값은 다르다.(주소값에 저장된 문자열의 내용만 같을뿐)
		System.out.print("s1과 s2는");
		if(s1==s2)
			System.out.println("같다");
		else
			System.out.println("같지 않다.");
		
		
		
		System.out.print("s1과 s3는");		// 단순히 주소값을 복사한 s1, s3 는 같은 주소값을 갖는다.
		if(s1==s3)
			System.out.println("같다");
		else
			System.out.println("같지 않다.");			
		
		System.out.print("s2와 s4는");		// 단순히 주소값을 복사한 s2, s4는 같은 주소값을 갖는다.
		if(s4==s2)
			System.out.println("같다");
		else
			System.out.println("같지 않다.");
		
		
	}

}
