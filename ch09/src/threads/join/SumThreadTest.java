package threads.join;

public class SumThreadTest {

	public static void main(String[] args) {
		//썸스레드 객체 생성
		SumThread sumThread = new SumThread();
		//메인 스레드가 썸스레드를 호출하고 일시 정지 상태로 돌아감
		sumThread.start();
		
		try {
			sumThread.join();	//참여하면서 run을 실행함
		}catch (InterruptedException e) {
			e.printStackTrace();
	
		}
		
		//메인 스레드가 최종 계산된 결과값을 산출하고 종료하면 다시
		//메인 스레드는 결과값을 받아 출력함
		System.out.println(sumThread.getSum());
		
	}
	

}
