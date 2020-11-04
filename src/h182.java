
public class h182 {

	public static void main(String[] args) {
		// 83, 90, 87 총합

		int[] num = { 83, 90, 87 }; // 타입[]변수 = {중괄호!!!!} ;
		int sum = 0;
		for (int i = 0; i < 3; i++) { // 선언 잊지 말기!!
			sum += num[i];  

//			System.out.println("총합 :" + sum); // for 안쪽에 있기때문에 일일히 나옴
		}
		System.out.println("총합 :" + sum);
	}

}
