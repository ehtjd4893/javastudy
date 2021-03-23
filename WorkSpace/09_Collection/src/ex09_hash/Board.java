package ex09_hash;

/*
 * HashSet에 board를 저장하고자 한다
 * 동일한 board의 경우 저장이 안 되도록 설정하자
 * 
 * 1. 자바의 기본 동작
 * 	1) 저장할 board의 해시코드 확인 (저장 주소)
 *	2) 같은 해시코드를 갖는 board가 있습니까? 없다
 *  3) 따라서 같은 board는 없다고 판단.
 *  
 * 2. 추가해야 할 작업
 *  1) 같은 baord는 같은 해시코드를 가지도록 hashCode() 오버라이드
 *  2) 같은 board인지 비교할 수 있는 equals() 메소드를 오버라이드한다.
 *  3) 같은 해시코드를 가지고 equals() 결과가 true이면 동일한 board가 있다고 판단하고 저장 x
 * 
 * ===결론===
 * hash 기반의 컬렉션 프레임워크(hashSet,HashMap 등)에 저장할 객체들은
 * 모두 generate hashCode() and equals() 메소드를 추가(오버라이드)
 */

public class Board {
	
	private int bNo;
	private String title;
	private String writer;
	
	public Board(int bNo, String title, String writer) {
		this.bNo = bNo;
		this.title = title;
		this.writer = writer;
	}

	@Override
	public String toString() {
		return "[bNo=" + bNo + ", title=" + title + ", writer=" + writer + "]\n";
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return title.length() + writer.length();
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if(this == obj) {
			return true;
		}
		if( obj instanceof Board) {
			Board board = (Board)obj;
			return this.bNo == board.bNo;
		}
		return false;
	}

	public int getbNo() {
		return bNo;
	}

	public void setbNo(int bNo) {
		this.bNo = bNo;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}
	
	
	


	
	
}
