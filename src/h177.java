
public class h177 {

	public static void main(String[] args) {
		// 83, 90 , 87 �� ����, ����� ���϶�

		int[] num = { 83, 87, 90 };
		System.out.println("Scores[0] : " + num[0]);
		System.out.println("Scores[1] : " + num[1]);
		System.out.println("Scores[2] : " + num[2]);
		// ����Ҷ� �����̸��� [0] , [1] , [2] �� �������

		int sum = 0;
		for (int i = 0; i < 3; i++) {
			sum += num[i];
		// num�� 0,1,2���� �ֱ� ������ 3���Ϸ� ���� 			
		}
		System.out.println("���� : " + sum);
		double avg = (double) sum / 3;
		System.out.println("��� : " + avg);
	}

}
