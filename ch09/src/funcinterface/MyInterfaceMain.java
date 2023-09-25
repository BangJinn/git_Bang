package funcinterface;

public class MyInterfaceMain {

	public static void main(String[] args) {

		MyFunction1 function;
		
		function = () -> {
			System.out.println("안녕");
			
		};
		
		function.method();
		
	}

}
