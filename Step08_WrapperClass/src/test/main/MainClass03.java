package test.main;

public interface MainClass03 {
	public static void main(String[] args) {
		int num = 999;
		//������ ���ڿ��� �ٲٱ�
		String result = Integer.toString(num);
		
		double num2 = 10.1;
		//�Ǽ��� ���ڿ��� �ٲٱ�
		String result2=Double.toString(num2);
	/*	
		Integer.parseInt() ���ڸ� ������
		Double.parseDouble() ���ڸ� �Ǽ���
		
		Integer.toString() ������ �Ǽ���
		Double.toString() �Ǽ��� ���ڷ�
	*/	
	}
}
