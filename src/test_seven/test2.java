package test_seven;

public class test2 {

	public static void main(String[] args) {
		/*어떤 수 n을 입력받으면 다음과 같은 삼각형을 출력한다.
		여기서 입력되는 n은 반드시 홀수이다.
		입력
		3부터 99 까지의 홀수 중 하나가 입력된다.
		출력
		Sample Output 같은 삼각형을 출력한다.
		입력 예시 
		5
		출력 예시
		  *
		 ***
		***** */
		int n = 5;
		int midIndex = (n/2)+1;
		for(int i=1; i<=midIndex; i++) {
			for(int k=i; k<midIndex; k++) {
				System.out.print(" ");
			}
			for(int j=2; j<i*2+1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
