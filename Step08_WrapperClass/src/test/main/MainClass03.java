package test.main;

public interface MainClass03 {
	public static void main(String[] args) {
		int num = 999;
		//정수를 문자열로 바꾸기
		String result = Integer.toString(num);
		
		double num2 = 10.1;
		//실수를 문자열로 바꾸기
		String result2=Double.toString(num2);
	/*	
		Integer.parseInt() 문자를 정수로
		Double.parseDouble() 문자를 실수로
		
		Integer.toString() 정수를 실수로
		Double.toString() 실수를 문자로
	*/	
	}
}
