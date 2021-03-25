package main;

import java.util.List;
import java.util.Scanner;

import dao.StaffDao;
import dto.StaffDto;

public class StaffManager {
	private StaffDao dao = StaffDao.getInstance();
	private Scanner sc = new Scanner(System.in);

	// method
	public void insertStaff() {
		StaffDto dto = new StaffDto();
		int no = dao.selectMaxNo();
		dto.setNo(no+1);
		System.out.print("사원 이름 >>>");
		String name = sc.next();
		dto.setName(name);
		System.out.print("사원 부서 >>>");
		String dpt = sc.next();
		dto.setDepartment(dpt);
		int result = dao.insertStaff(dto);
		System.out.println(result + "명의 사원 추가");
	}
	public void updateStaff() {
		System.out.print("수정할 사원 번호 입력 >>");
		int no = sc.nextInt();
		StaffDto dto = dao.selectOneByNo(no);
		System.out.print("수정할 내용 선택(1: 이름, 2: 부서) >>>");
		int choice = sc.nextInt();
		if(choice == 1) {
			System.out.print("새로운 사원 이름 입력 >>> ");
			String name = sc.next();
			dto.setName(name);
		}
		else if(choice == 2) {
			System.out.print("새로운 부서 이름 입력 >>> ");
			String dpt = sc.next();
			dto.setDepartment(dpt);
		}
		else {
			System.out.println("잘못된 입력입니다.");
			return;
		}
		int result = dao.updateStaff(dto);
		System.out.println(result + "명의 사원 정보 수정");
	}
	
	public void deleteStaff() {
		StaffDto dto = new StaffDto();
		System.out.print("삭제할 사원 번호 입력 >>>");
		int no = sc.nextInt();
		dto.setNo(no);
		int result = dao.deleteStaff(dto);
		System.out.println(result + "명의 사원 삭제");
	}
	
	public void selectOne() {
		System.out.print("조회할 사원 번호 입력 >>>");
		int no = sc.nextInt();
		StaffDto dto = dao.selectOneByNo(no);
		if(dto != null)
			System.out.println(dto);
		else
			System.out.println(no + "는 없는 사원번호입니다.");
	}
	
	public void menu() {
		System.out.println("====사원관리프로그램====");
		System.out.println("1. 사원 등록");
		System.out.println("2. 정보 수정");
		System.out.println("3. 퇴사 처리");
		System.out.println("4. 사원 조회");
		System.out.println("5. 전체 조회");
		System.out.println("6. 프로그램 종료");
		System.out.println("=======================");
	}
	void execute() {
		while(true) {
			menu();
			System.out.println("메뉴 선택 >>");
			switch(sc.nextInt()) {
			case 1: insertStaff(); break;
			case 2: updateStaff(); break;
			case 3: deleteStaff(); break;
			case 4: selectOne(); break;
			case 5: selectList(); break;
			case 6: System.out.println("프로그램을 종료합니다.");
				return;
			default: System.out.println("다시 선택하세요.");
			}
		}
	}
	
	public void selectList() {
		List<StaffDto> list = dao.selectList();
		System.out.println("총 사원 수: " + list.size() + "명");
		for(StaffDto dto : list) {
			System.out.println(dto);
		}
	}
}
