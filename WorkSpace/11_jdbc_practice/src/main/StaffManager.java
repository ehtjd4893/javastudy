package main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import dao.StaffDao;
import dto.StaffDto;

public class StaffManager {
	private StaffDao dao = StaffDao.getInstance();
	private Scanner sc = new Scanner(System.in);
	
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
	private void selectList() {
		List<StaffDto> list = new ArrayList<>();
		list = dao.selectList();
		for(StaffDto dto : list) {
			System.out.println(dto);
		}
		
	}
	private void selectOne() {
		System.out.print("조회할 사번 입력");
		int no = sc.nextInt();
		StaffDto dto = dao.selectOne(no);
		if(dto == null) {System.out.println("그런 사원 없습니다."); return;}
		System.out.println(dto);
	}
	private void deleteStaff() {
		System.out.print("삭제할 사번 입력");
		int no = sc.nextInt();
		StaffDto dto = dao.selectOne(no);
		if(dto == null) {System.out.println("그런 사원 없습니다."); return;}
		dao.deleteStaff(dto);
		
	}
	private void updateStaff() {
		System.out.print("수정할 사원의 사번을 입력 >>");
		int no = sc.nextInt();
		StaffDto dto = dao.selectOne(no);
		if(dto == null) {System.out.println("그런 사원 없습니다."); return;}
		System.out.print("이름 변경: 1, 부서 변경: 2 입력 >> ");
		int choice = sc.nextInt();
		if(choice == 1) {
			System.out.print("수정 입력할 이름 >>");
			String name = sc.next();
			dto.setName(name);
		}
		if(choice == 2) {
			System.out.print("수정 입력할 부서 >>");
			String dpt = sc.next();
			dto.setDepartment(dpt);
		}
		dao.updateStaff(dto);
	}
	private void insertStaff() {
		System.out.print("신입사원의 이름 입력 >>");
		String name = sc.next();
		System.out.print("신입사원의 부서 입력 >>");
		String dpt = sc.next();
		StaffDto dto = new StaffDto();
		dto.setNo(dao.selectMaxNo()+1);
		dto.setName(name);
		dto.setDepartment(dpt);
		dao.insertStaff(dto);
	}
}
