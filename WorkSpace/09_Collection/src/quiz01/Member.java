package quiz01;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Member {
	private int mNo;	// 회원번호
	private String mId;	// 회원id
	private Date mDate; // 회원가입일
	
	@Override
	public String toString() {
		return "Member [mNo=" + mNo + ", mId=" + mId + ", mDate=" + mDate + "]\n";
	}
	
	
}
