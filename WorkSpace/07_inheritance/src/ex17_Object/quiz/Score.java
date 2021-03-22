package ex17_Object.quiz;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class Score {
	private int kor,eng,mat;

	@Override
	public boolean equals(Object obj) {
		Score s = (Score)obj;
		if(obj instanceof Score) {
			if(s.getEng() == eng && s.getKor() == kor && s.getMat() == mat)
				return true;
		}	
		return false;
	}
	
	
	
	
}
