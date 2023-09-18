package polymo.animals2;


class Animal{
	public void move() {
		System.out.println("동물이 움직임.");
	}
}

class Human extends Animal{

	@Override
	public void move() {
		System.out.println("사람이 두발로 걸음.");
	}
	
	public void readBook() {
		System.out.println("사람이 책을 읽습니다.");
	}
	class Tiger extends Animal{

		@Override
		public void move() {
			System.out.println("호랑이가 어흥.");
		}

	}
}


public class AnimalTest {

	public void moveAnimal1(Animal animal) {
		animal.move();
	}
	
	public static void main(String[] args) {
		
		AnimalTest aTest = new AnimalTest();
		
		//Animal 타입으로 객체 생성(다형성) - 자동형 변환
		//Animal animal = new Human();
		
		//move animal 호출
		aTest.moveAnimal1(new Human());
		
		
		Animal[] animals = new Animal[3];
		
		animals[0] = new Human();
		
		//강제 형변환 - instanceof 키워드 사용
		for(int i=0; i<animals.length; i++) {
			if(animals[i] instanceof Human) {
				Human human = (Human)animals[i]; //자식 타입 = 부모타입
				human.readBook();
			}else if(animals[i] instanceof Human) {
				
			}
		}
	}

}
