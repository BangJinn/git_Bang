package data;

public class TypeConversiontTest {

	public static void main(String[] args) {
		// 형 변환 - 1. 자동 형 변환 2. 강제 형 변환
		int iNum = 20;
		float fNum = iNum;	//실수형 4byte = 정수형 4byte (자동 형 변환, 왼쪽이 더 크니까)
		
		System.out.println(iNum);	//20
		System.out.println(fNum);	//20.0
		
		double dNum;	//실수형 8byte
		dNum = iNum + fNum;
		System.out.println(dNum);
		
		//2. 강제 형 변환
		double dNum1 = 1.2;
		float fNum2 = 0.9F;
		
		int iNum2 = (int)dNum1 + (int)fNum2;
		System.out.println(iNum2);
		
		
		
		
		
		
		
		
		
	}

}
