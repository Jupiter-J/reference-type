
public class h182_ {

	public static void main(String[] args) {
		// 83 , 90 , 87
		
		int [] scores;
		scores = new int[] {83, 90, 87}; //배열변수를 이미 선언한 후에는 다른 실행문에서!
		
		int sum1 = 0;
		for (int i=0; i<3; i++) {
			sum1 += scores[i];
		}
		System.out.println("총합 :" + sum1 );	 //sum1 [i] 붙일 필요 없음 !
		
		int sum2 = add ( new int[] { 83, 90 , 87});
		System.out.println("총합 :" + sum2);
			
	}
	
	public static int add (int[] scores) {  //총합을 계산해서 리턴하는 메소드
		int sum = 0;
		for(int i =0; i<3; i++) {
			sum += scores[i];
		}
		return sum;
	}

}
