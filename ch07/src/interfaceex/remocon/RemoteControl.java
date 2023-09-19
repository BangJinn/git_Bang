package interfaceex.remocon;

public interface RemoteControl {

	public int MAX_VOLUME = 10;
	public int MIN_VOLUME = 0;
	
	
	//추상 메서드
	public void turnOn();
	public void turnOff();
	public void setVolume(int volme);
	
	//정적 메서드
	static void changeBattery() {
		System.out.println("건전지를 교환합니다.");
	}
	//일반 (구체화) 메서드 - default 키워드를 붙임
	default void setMute(boolean mute) {
		if(mute) { //아무것도 안적어주면 기본적으로 트루다.
			System.out.println("무음 처리합니다.");
			
		}else {
			System.out.println("무음 해제합니다.");
		}
		
	}
	
	
}
