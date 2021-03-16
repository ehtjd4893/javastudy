package quiz10;

import java.text.DecimalFormat;
import java.util.Arrays;

public class Student {
	private String name;
	private int[] scores;	// 점수들
	private double average;	// 평균
	private char grade;		// A ~ F
	private boolean isPass;	// 평균 60이상 합격
	
	public Student(String name) {
		this.name = name;
//		this.scores = new int[num_scores];
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int[] getScores() {
		return scores;
	}

	public void setScores(int[] scores) {
		this.scores = scores;
	}
	
	public void setScores(int num_score) {
		this.scores = new int[num_score];
		// 30% 확률: 0~49
		// 40% 확률: 50~79
		// 30% 확률: 80~100
		for(int i = 0; i < num_score; i++) {
			if(Math.random() < 0.3) {
				scores[i] = (int)(Math.random()*50);
			}
			else if(Math.random() > 0.7) {
				scores[i] = (int)(Math.random()*21) + 80;
			}
			else {
				scores[i] = (int)(Math.random() * 30) + 50;
			}
		}
		int total = 0;
		for(int score : scores)
			total += score;
		double avg =(double)total / num_score;
		setAverage(avg);
		setPass(true);
		
		if(avg >=90) {setGrade('A');}
		else if(avg >=80) {setGrade('B');}
		else if(avg >=70) {setGrade('C');}
		else if(avg >=60) {setGrade('D');}
		else {setGrade('F'); setPass(false);}
	}

	public double getAverage() {
		return average;
	}

	private void setAverage(double average) {
		this.average = average;
	}

	public char getGrade() {
		return grade;
	}

	private void setGrade(char grade) {
		this.grade = grade;
	}

	public boolean isPass() {
		return isPass;
	}

	private void setPass(boolean isPass) {
		this.isPass = isPass;
	}
	
	public void info() {
		System.out.println("이름: " + this.name);
		System.out.println("점수: " + Arrays.toString(scores));
		
		System.out.println("평균: " + new DecimalFormat("0.00").format(this.average) + "점");
		System.out.println("학점: " + this.grade);
		System.out.println("합격여부:" + (this.isPass ? "합격" : "불합격"));
	}
	
}
