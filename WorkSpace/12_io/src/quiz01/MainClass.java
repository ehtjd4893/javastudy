package quiz01;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

// 사용자로부터 국,영,수를 입력받고
// int[] 배열에 저장
// score.dat 파일에 이름, 점수, 평균 저장
public class MainClass {

	public static void main(String[] args) {
		String name = "박도성";
		String[] subject = {"국어", "영어", "수학"};
		int[] scores = new int[subject.length];
		Scanner sc = new Scanner(System.in);
		
		double avg = 0;
		for(int i = 0; i < scores.length; i++) {
			System.out.print(subject[i] + " 점수 입력 >>");
			scores[i] = sc.nextInt();
			avg += scores[i];
		}
		try(DataOutputStream dos = new DataOutputStream(new FileOutputStream("scores.dat"))) {
			dos.writeUTF(name);
			for(int i = 0; i < scores.length;i++) {
				dos.writeUTF(subject[i] + ": ");
				dos.writeInt(scores[i]);
			}
			dos.writeUTF("평균: ");
			dos.writeDouble(avg / scores.length);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
	}

}
