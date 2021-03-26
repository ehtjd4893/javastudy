package ex02_byte;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class ObjectOutputStreamMainClass {

	public static void main(String[] args) {
		ObjectOutputStream oos = null;
		
		try {
			oos = new ObjectOutputStream(new FileOutputStream("board.dat"));
			Board board1 = new Board("공지","잘 읽어라","관리자");
			List<Board> boardList = new ArrayList<>();
			boardList.add(new Board("필독","꼭 읽어라", "관리자"));
			boardList.add(new Board("협조","부탁한다", "관리자"));
			oos.writeObject(board1);
			oos.writeObject(boardList);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if(oos != null) oos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		

	}

}
