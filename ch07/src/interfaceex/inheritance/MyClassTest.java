package interfaceex.inheritance;

public class MyClassTest {

	public static void main(String[] args) {

		MyClass myClass = new MyClass();
		
		X x = myClass;
		x.x();
		
		Y y = myClass;
		y.y();
		System.out.println("=============");
		
		MyInterface iClass = myClass;
		iClass.x();
		iClass.y();
		iClass.method();
		
		
	}

}
