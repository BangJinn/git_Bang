package abstracts.player;

public class AdvancedLevel extends PlayerLevel{

	@Override
	public void run() {
		System.out.println("빨리 달림");
	}

	@Override
	public void jump() {
		System.out.println("높게 점프 할 줄 암");
	}

	@Override
	public void turn() {
		System.out.println("턴 할줄 몰루");
	}

	@Override
	public void showLevelMessage() {
		System.out.println("==중급자==");
	}

}
