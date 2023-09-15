package calctime;

public class SystemTime {

	public static void main(String[] args) {
		// 성능 테스트 소요 시간 측정 -ms, ns
		// 현제까지의 시간 (밀리초)
		
		long start = System.nanoTime();
		
		long sum = 0;
		for(int i=0; i<10000000; i++) {
			sum += i;
		}
		
		long end = System.nanoTime();
		System.out.println(sum);
		System.out.println((end-start)/1000000 + "ns");
	
	}

}
