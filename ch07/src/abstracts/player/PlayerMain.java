package abstracts.player;

public class PlayerMain {

	public static void main(String[] args) {

		Player player = new Player();
		player.play(1);
		
		//중급자 레벨
		AdvancedLevel aLevel = new AdvancedLevel();
		player.upgradeLevel(aLevel);
		player.play(2);
	}

}