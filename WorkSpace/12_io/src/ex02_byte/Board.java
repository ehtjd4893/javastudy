package ex02_byte;

import java.io.Serializable;

// ObjectOutputStream에 의해서 writeObject() 메소드로 호출되는 클래스
// 반드시 직렬화를 해야 한다

// 직렬화 방법 : Serializable 인터페이스를 구현해야 한다.
// serialVersionID를 생성


public class Board implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 8782542118491866388L;
	private String title, content, writer;

	public Board(String title, String content, String writer) {
		this.title = title;
		this.content = content;
		this.writer = writer;
	}

	@Override
	public String toString() {
		return "Board [title=" + title + ", content=" + content + ", writer=" + writer + "]";
	}
	
	
}
