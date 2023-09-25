package collection.stack;

import java.util.Stack;

public class StackCoinTest {

	public static void main(String[] args) {

		Stack<Coin> coinBox = new Stack<>();
		
		
		Coin coin500 = new Coin(500);
		Coin coin100 = new Coin(100);
		Coin coin50 = new Coin(50);
		Coin coin10 = new Coin(10);
		
		coinBox.push(coin500);
		coinBox.push(coin100);
		coinBox.push(coin50);
		coinBox.push(coin10);
		
		int coin1 = coinBox.pop().getMoney();
		System.out.println(coin1);
		
		//전체 객체 출력(꺼내기) 밖으로 나오면서 삭제 10 50 100 500
		while(!coinBox.isEmpty()) {
			Coin coin = coinBox.pop();
			System.out.println(coin.getMoney());
			
		}
		
		
	}

}
