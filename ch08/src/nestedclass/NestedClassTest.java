package nestedclass;

class A{
	
	A(){System.out.println("A객체 생성");}
	class B{
		int field1;
		//static int field2; //
		B(){System.out.println("B객체 생성");}
		void method1() {}
		
	}
		static class C{
			int field1;
			static int field2;
			
			C(){System.out.println("C객체 생성");}
			
			void method1() {}
			static void method2() {}
			
		}
		void method() {
			class D{
				int fidld1;
				D(){System.out.println("D객체 생성");}
				void method1() {};
				
		}
			
			D d = new D();
			d.fidld1 = 10;
			d.method1();
	}
}
	





public class NestedClassTest {

	public static void main(String[] args) {
		A a = new A();
		
		A.B b = a.new B();
		b.field1 = 3;
		b.method1();
		
		A.C c = new A.C();
		c.field1 = 2;
		A.C.field2 = 3;
		A.C.method2();
		
		a.method();
		
		
		
	}

}
