package protectedex.pack1;

//protected - 다른 패키지는 접근 불가, 같은 패키지나 상속 관계는 가능
public class A {
	protected String field;
	
	protected A(){}
	
	protected void method() {}
}