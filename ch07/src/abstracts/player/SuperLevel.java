package abstracts.player;

public class SuperLevel extends PlayerLevel {

	@Override
	public void run() {
		System.out.println("개 빨리 달림");
	}

	@Override
	public void jump() {
		System.out.println("개 높게 점프");
	}

	@Override
	public void turn() {
		System.out.println("턴 할 줄 암");
	}

	@Override
	public void showLevelMessage() {
		System.out.println("==고인물==");
	}

}
