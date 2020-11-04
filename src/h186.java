
public class h186 {

	public static void main(String[] args) {
		// 83, 90 , 87로 length 사용해보기

		int[] scores = { 83, 90, 87 };

		int sum = 0;
		for (int i = 0; i < scores.length; i++) {
			sum += scores[i];
		}
		System.out.println("총합: " + sum);

		double avg = (double) sum / scores.length;
		System.out.println("평균: " + avg);
	}

}
