package ex09_hash;
/*
 * 몇몇 아이디가 있다.
 * apple
 * africa
 * avatar
 * banana
 * bonus
 * bravo
 * 입력된 아이디를 검색하고자 한다.
 * 검색속도를 높이기 위해서 hash 개념이 사용된다.
 * 
 * 1. 첫 글자에 따라 해시코드를 정한다
 * apple 	: 1
 * africa	: 1
 * avatar	: 1
 * banana	: 2
 * bonus	: 2
 * bravo	: 2
 * 
 * 2. 글자수에 따라 해시코드를 정한다.
 * apple 	: 5
 * africa	: 6
 * avatar	: 6
 * banana	: 6
 * bonus	: 5
 * bravo	: 5

	검색 예시)
	검색 아이디: april
	사용 해시코드: 글자수
	april 해시코드는 5
	-> 해시코드가 5인 apple, april, bonus, bravo 중에 
	april을 찾는다.
 * */
public class HashCodeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer a = 10;
		System.out.println("a의 해시코드: " + a.hashCode());
		Double b = 1.5;
		System.out.println("b의 해시코드: " + b.hashCode());
		String c = "hello";
		System.out.println("c의 해시코드: " + c.hashCode());
	
		Dog dog = new Dog();
		Cat cat = new Cat();
		System.out.println(dog);
		System.out.printf("%x",dog.hashCode());	// Object로부터 상속받음
		System.out.println();
		System.out.println(cat);
		System.out.printf("%x",cat.hashCode());	// Object로부터 상속받음
		// Object의 hashCode는 메모리주소값.
		
		// hashSet과 hashMap의 공통점
		// '중복이 불가능한' 데이터가 있다
		
		// 중복 확인 유무
		// 1. 해시코드 확인 -> 해시코드 같으면 다음 단계
		// 2. 실제로 같은지 equals() 메소드로 비교
		// 3. 그 결과가 같으면 중복 데이터가 있는 것으로 판단.
	}

}

class Dog {}
class Cat {}