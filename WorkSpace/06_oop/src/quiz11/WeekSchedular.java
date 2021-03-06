package quiz11;

import java.util.Scanner;

public class WeekSchedular {
	private int nthWeek;
	private Day[] week;
	private String[] weekNames = {"일","월","화","수","목","금","토"};
	private Scanner sc = new Scanner(System.in);
	
	public WeekSchedular(int nthWeek) {
		this.nthWeek = nthWeek;
		this.week = new Day[7];
		for(int i = 0; i < 7; i++) {
			week[i] = new Day();
		}
	}
	public void run() {
		loop : while(true) {
			this.menu();
			System.out.println("작업 선택 >> ");
			int choice = sc.nextInt();
			sc.nextLine();	// choice 입력 뒤에 남아있는 엔터를 제거하기 위한 코드
			switch(choice) {
			case 1:	makeSchedule(); break;
			case 2: deleteSchedule(); break;
			case 3: updateSchedule(); break;
			case 4: searchSchedule(); break;
			case 5: this.printAllSchedule(); break;
			case 0: exit(); break loop;
			default: System.out.println("잘못된 입력입니다.");
			}
		}
		
	}
	
	public void printAllSchedule() {
		System.out.println("====" + nthWeek + "주차 전체 스케쥴====");
		for( int i = 0; i < 7; i++) {
			System.out.print(weekNames[i] + "요일: ");
			week[i].info();
		}
	}
	private void searchSchedule() {
	System.out.println("====스케쥴 조회하기====");
	System.out.print("스케쥴을 조회할 요일(일~토) 입력 >>");
	String weekName = sc.next();
	weekName = weekName.substring(0,1);
	for(int i = 0; i < week.length;i++) {
		if(weekNames[i].equals(weekName)) {
			week[i].info();
			return;
		}
	}
	System.out.println(weekName + "요일은 존재하지 않습니다.");
	}
	private void updateSchedule() {	// 있으면 수정, 없으면 새로 등록
		System.out.println("====스케쥴 수정하기====");
		System.out.println("스케쥴을 수정할 요일 입력(일~토)");
		String weekName = sc.next();	// 만약 "화요일"이라고 입력했다면
		weekName = weekName.substring(0,1);	//
		sc.nextLine();
		for(int i = 0 ;i < week.length; i++) {
			if(weekNames[i].equals(weekName)) {	// index 찾기
				if(week[i].getSchedule() == null || week[i].getSchedule().isEmpty()) {
					System.out.println(weekName + "요일은 스케쥴이 없습니다.");
					System.out.print("스케쥴을 추가하시겠습니까?[Y/N]");
					String yesNo = sc.next();
					sc.nextLine();
					if(yesNo.charAt(0) == 'y' || yesNo.charAt(0) == 'Y') {
						System.out.println(weekName + "요일의 신규 스케쥴 입력 >>>");
						String schedule = sc.nextLine();
						week[i].setSchedule(schedule);
						System.out.println(weekName + "요일에 신규 스케쥴 저장되었습니다.");
						
					}
					else {
						System.out.println("스케쥴 수정을 취소합니다.");
					}
				}
				else {
					System.out.println("[" + week[i].getSchedule() + "]");
					System.out.print("수정할까요?[Y/N]");
					String yesNo = sc.next();
					yesNo = yesNo.substring(0,1);
					sc.nextLine();
					if(yesNo.equalsIgnoreCase("Y")) {
						System.out.println(weekName + "요일에 수정할 스케쥴 입력 >>>");
						String schedule = sc.nextLine();
						week[i].setSchedule(schedule);
						System.out.println(weekName + "요일 스케쥴을 수정했습니다.");	
					}
					else {
						System.out.println("취소되었습니다.");
					}
				}
				break;	// for문 종료
			}
		}
		
	}
	private void deleteSchedule() {
		System.out.println("====스케쥴 삭제하기====");
		System.out.println("스케쥴을 삭제할 요일 입력(일~토)");
		String weekName = sc.next();	// 만약 "화요일"이라고 입력했다면
		weekName = weekName.substring(0,1);	//
		sc.nextLine();
		for(int i = 0 ;i < week.length; i++) {
			if(weekNames[i].equals(weekName)) {	// index 찾기
				if(week[i].getSchedule() == null || week[i].getSchedule().isEmpty()) {
					System.out.println(weekName + "요일은 이미 스케쥴이 비어있는 날입니다.");
				}
				else {
					System.out.println("[" + week[i].getSchedule() + "]");
					System.out.print("삭제할까요?[Y/N]");
					String yesNo = sc.next();
					yesNo = yesNo.substring(0,1);
					
					if(yesNo.equalsIgnoreCase("Y")) {
						week[i].setSchedule(null);
						System.out.println(weekName + "요일의 스케쥴을 삭제했습니다.");
					} else {
						System.out.println("취소되었습니다.");
					}
				}
				break;	// for문 종료
			}
		}
	}
	public void exit() {
		System.out.println("종료합니다.");
		sc.close();
	}
	
	public void makeSchedule() {
		System.out.println("===스케쥴 만들기===");
		System.out.println("스케쥴 등록할 요일(일~토) 입력 >>> ");
		String weekName = sc.next();
		sc.nextLine();	// 요일 입력 뒤에 남아있는 엔터 제거
		for(int i = 0 ;i < week.length; i++) {
			if(weekNames[i].equals(weekName)) {	// index 찾기
				if(week[i].getSchedule() == null || week[i].getSchedule().isEmpty()) {
					System.out.println(weekName + "요일의 신규 스케쥴 입력 >>>");
					String schedule = sc.nextLine();
					week[i].setSchedule(schedule);
					System.out.println(weekName + "요일에 신규 스케쥴 저장되었습니다.");
				}
				else {
					System.out.println(weekName + "요일은 이미 스케쥴이 있습니다.");
				}
				break;	// for문 종료
			}
			
		}
	}
	
	public void menu() {
		System.out.println("=======스케쥴러=======");
		System.out.println("1. 스케쥴 만들기");
		System.out.println("2. 스케쥴 삭제하기");
		System.out.println("3. 스케쥴 수정하기");
		System.out.println("4. 스케쥴 조회하기");
		System.out.println("5. 전체 스케쥴 보기");
		System.out.println("0. 프로그램 종료하기");
		System.out.println("======================");
	}
	
}
