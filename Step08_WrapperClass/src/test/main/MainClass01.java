package test.main;

public class MainClass01 {
	public static void main(String[] args) {
		System.out.println("메인 메소드가 시작 됩니다.");
		//기본 데이터 type 
		//JAVA는 배열에 기본데이터 type이 들어가지 않기때문에 객체 형식으로 넣는다. 
		byte num1=10;
		//참조 데이터 type , new 생성자를 안만들고 써도 된다. 
		Byte num2=10;
		
		short num3 = 11;
		Short num4 = 11;
		
		int num5 = 999;
		Integer num6 = 1000;
		
		long num7 = 888;
		Long num8 = 777l; //__l; 롱타입이라는 의미.
		
		float num9=10.1f;
		Float num10=10.2f;
		
		double num11=10.3;
		Double num12=10.4;
		
		char ch1='a';
		Character ch2='b';
		
		boolean isWait = true;
		Boolean canRun = false;
		
	}
}
