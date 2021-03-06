package quiz10;

import java.text.DecimalFormat;

public class Lecture {
	Student[] students;
	String title;
	public Lecture(String string, String[] n) {
		this.title = string;
		this.students = new Student[n.length];
		for(int i = 0; i < n.length;i++)
			students[i] = new Student(n[i]);
		
	}

	public void exam(int n) {
		for(int i = 0; i < students.length;i++) {
			students[i].setScores(n);
		}
		
	}
	public double getLecAvg() {
		double total = 0.0;
		for(Student std : students) {
			total+= std.getAverage();
		}
		return total / students.length;
	}
	
	public void info() {
		System.out.println("강좌명: " + title);
		System.out.println("강좌평균: " + new DecimalFormat("0.00").format(getLecAvg()));
		System.out.println("======학생별 성적 현황======");
		for(int i = 0; i < students.length;i++) {
			this.students[i].info();
			System.out.println("----------------------");
		}
	}

}
