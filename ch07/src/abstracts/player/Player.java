package abstracts.player;

public class Player {
	//PlayerLevel 참조, 필드
	private PlayerLevel level;

	public Player() {
		level = new Beginner();
		level.showLevelMessage();
		
		
	}
	//레벨을 업그레이드 하는 메서드
	public void upgradeLevel(PlayerLevel level) {
		this.level = level;
		level.showLevelMessage();
		
	}
	//플레이어가 게임하는 메서드
	public void play(int count) {
		level.go(count);
		
	}
	
}
