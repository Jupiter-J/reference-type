
public class h177 {

	public static void main(String[] args) {
		// 83, 90 , 87 의 총합, 평균을 구하라

		int[] num = { 83, 87, 90 };
		System.out.println("Scores[0] : " + num[0]);
		System.out.println("Scores[1] : " + num[1]);
		System.out.println("Scores[2] : " + num[2]);
		// 출력할때 변수이름에 [0] , [1] , [2] 도 써줘야함

		int sum = 0;
		for (int i = 0; i < 3; i++) {
			sum += num[i];
		// num이 0,1,2까지 있기 때문에 3이하로 지정 			
		}
		System.out.println("총합 : " + sum);
		double avg = (double) sum / 3;
		System.out.println("평균 : " + avg);
	}

}
