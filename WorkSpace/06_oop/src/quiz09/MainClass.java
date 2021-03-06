package quiz09;

public class MainClass {

	public static void main(String[] args) {
		Soldier soldier = new Soldier("람보",3);
		
		soldier.addGun(new Gun("콜트",6));
		soldier.addGun(new Gun("베레타",6));
		soldier.addGun(new Gun("스미스웨슨",6));
			
		soldier.shoot();	// 전체 총 1번씩
		soldier.shoot(1);	// 1번총만 한 발 쏜다.
		soldier.shoot("베레타");	// 베레타만 한 발 쏜다.
		
		soldier.info();
		// 람보
		// 콜트 4발
		// 베레타 4발
		// 스미스웨슨 5발
		
		soldier.reload(6);
		soldier.reload(1,6);	// 1번총 6발
		soldier.reload("베레타",6);	// 베레타에 6발 추가
	}

}
