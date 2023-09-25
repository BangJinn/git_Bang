package funcinterface.lambdastring;

public class StringConcatTest2 {

	public static void main(String[] args) {

		StringConcat concat;
		String str1 = "KH";
		String str2 = "정보통신";
		
		concat = (m, n) -> System.out.println(m + " " + n);
		
		concat.makeString(str1, str2);
		
	}

}
