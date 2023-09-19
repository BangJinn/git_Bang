package inheritance.transport;

public class Main {

	public static void main(String[] args) {
		//person객체 생성
		Person sungu = new Person("차순규", 10000);
		Person junch = new Person("이준철", 6500);
		Person jisung = new Person("김지성", 10000);
		//bus객체 생성
		Bus bus100 = new Bus("bus100");
		Texi kakaotexi = new Texi("kakaotexi");
		
		sungu.take(bus100, 1500);
		junch.take(bus100, 1500);
		jisung.take(kakaotexi, 3800);
		
		sungu.showPersonInfo();
		junch.showPersonInfo();
		jisung.showPersonInfo();
		bus100.showInfo();
		kakaotexi.showInfo();
	}

}
