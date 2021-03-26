package quiz01;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class MainClass2 {

	public static void main(String[] args) {

		try (DataInputStream dis = new DataInputStream(new FileInputStream("scores.dat"))){
			String name = dis.readUTF();
			int[] scores = new int[3];
			String[] subject = new String[3];
			for(int i = 0; i < 3; i++) {
				subject[i] = dis.readUTF();
				scores[i] = dis.readInt();
			}
			System.out.println(name);
			
			for(int i = 0; i < 3; i++) {
				System.out.print(subject[i]);
				System.out.println(scores[i]);
			}
			String name_avg = dis.readUTF();
			Double avg = dis.readDouble();
			System.out.print(name_avg);
			System.out.println(avg);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		

	}

}
