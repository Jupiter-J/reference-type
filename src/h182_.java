
public class h182_ {

	public static void main(String[] args) {
		// 83 , 90 , 87
		
		int [] scores;
		scores = new int[] {83, 90, 87}; //�迭������ �̹� ������ �Ŀ��� �ٸ� ���๮����!
		
		int sum1 = 0;
		for (int i=0; i<3; i++) {
			sum1 += scores[i];
		}
		System.out.println("���� :" + sum1 );	 //sum1 [i] ���� �ʿ� ���� !
		
		int sum2 = add ( new int[] { 83, 90 , 87});
		System.out.println("���� :" + sum2);
			
	}
	
	public static int add (int[] scores) {  //������ ����ؼ� �����ϴ� �޼ҵ�
		int sum = 0;
		for(int i =0; i<3; i++) {
			sum += scores[i];
		}
		return sum;
	}

}
