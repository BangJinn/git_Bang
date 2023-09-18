package arraylist;

import java.util.ArrayList;

import arraylist.dog.Dog;

public class DogArrayList {

	public static void main(String[] args) {
		//인스턴스를 저장할 리스트 생성
		ArrayList<Dog> dogList = new ArrayList<>();
		
		//객체 생성
		Dog dog1 = new Dog("백구1", "진돗개");
		Dog dog2 = new Dog("백구2", "진돗개");
		Dog dog3 = new Dog("백구3", "진돗개");
		//객체 저장
		dogList.add(dog1);
		dogList.add(dog2);
		dogList.add(dog3);
		//출력
		System.out.println(dogList.get(1));
		//전체 조회
		for(int i=0; i<dogList.size(); i++) {
			Dog dog = dogList.get(i);
			System.out.println(dog);
			
		}
		
		
		
	}

}
