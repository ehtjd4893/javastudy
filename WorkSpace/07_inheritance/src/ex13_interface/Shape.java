package ex13_interface;

// 인터페이스
// 1. 모든 메소드가 추상메소드인 추상클래스입니다.
// 2. jdk 1.8 이후에 default 메소드와 static 메소드를 가질 수 있음.

public interface Shape {
	public abstract double getArea();
	public abstract void info();
}
