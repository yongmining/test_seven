package test_seven;

import java.util.Scanner;

public class test1 {

	public static void main(String[] args) {
		/*n이 입력되면 다음과 같은 삼각형을 출력하시오.
		예)
		n 이 5 이면
		*
		**
		***
		****
		*****
		입력
		길이 n이 입력된다.
		출력
		삼각형을 출력한다.
		입력 예시 
		3
		출력 예시
		*
		**
		***
		*/
		Scanner sc = new Scanner(System.in);
		System.out.print("삼각형의 길이를 입력하세요>");
		int size = sc.nextInt();
		
		for(int i = 1; i<=size; i++) {
			for(int j = 1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
