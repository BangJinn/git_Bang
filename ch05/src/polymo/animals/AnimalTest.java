package polymo.animals;

class Animal{
	public void move() {
		System.out.println("동물이 움직입니다.");
		
	}
}

class Human extends Animal{

	@Override
	public void move() {
		System.out.println("사람이 두 발로 걷습니다.");
	}
	/*public void move() {
		System.out.println("사람이 두 발로 걷습니다.");
	
	}*/
}

class Eagle extends Animal{

	@Override
	public void move() {
		System.out.println("독수리가 난다.");
	}
	/*public void move() {
		System.out.println("독수리가 난다.");
	}*/
	
}
	
class tiger extends Animal{

	@Override
	public void move() {
		System.out.println("호랑이가 어흥.");
	}
	/*public void move() {
		System.out.println("호랑이가 어흥.");
	}*/
}

public class AnimalTest {

	//moveAnimal() 정의
	public void moveAnimal(Animal animal) {
		animal.move();
	}
	
	public static void main(String[] args) {
		
		AnimalTest aTest = new AnimalTest();
		
		Animal human = new Human();
		Animal eagle = new Eagle();
		Animal tiger = new tiger();
		
		aTest.moveAnimal(human);
		aTest.moveAnimal(eagle);
		aTest.moveAnimal(tiger);
		
	}
}



