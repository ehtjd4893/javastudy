package ex02_byte;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;

public class ObjectInputStreamMainClass {

	public static void main(String[] args) {
		ObjectInputStream ois = null;
		try {
			ois = new ObjectInputStream(new FileInputStream("board.dat"));
			Board board = (Board)ois.readObject();
			List<Board> boardList = new ArrayList<Board>();
			boardList = (ArrayList<Board>)ois.readObject();
			System.out.println(board);
			for(Board b : boardList)
				System.out.println(b);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if(ois != null)
				ois.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		

	}

}
