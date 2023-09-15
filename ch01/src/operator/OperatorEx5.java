package operator;

public class OperatorEx5 {

	public static void main(String[] args) {
		// 1증가, 1감소 연산자 (++, --)
		int num = 10;
		
		//num = num + 1;
		//num += 1; //복합 대입연산자
		num++;
		System.out.println(num);
		
		int num2 = 20;
		//num2 -= 1;
		//num2 = num2 - 1;
		num2--;
		System.out.println(num2);
		
		//복합 대입 연산자 연습
		int va1 = 100;
		System.out.println(va1 += 1); 	//va1 = va1 + 1
		System.out.println(va1 -= 1); 	//va1 = va1 - 1		
		System.out.println(va1 *= 10); 	//va1 = va1 * 1		
		System.out.println(va1 /= 10);	//va1 = va1 / 10
		
	}

}
