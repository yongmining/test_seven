package test_seven;

import java.util.Scanner;

public class test3 {

	public static void main(String[] args) {
		/*n이 5일때
		*****
		*   *
		*   *
		*   *
		*****
		입력
		길이 n이 입력된다. (n >= 3)
		출력
		사각형을 출력한다.
		입력 예시 
		3
		출력 예시
		***
		* *
		***
		*/
		Scanner sc = new Scanner(System.in);
		System.out.println("n값:");
		int n = sc.nextInt();
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				if(i==0 || i==n-1)//첫줄,마지막줄
					System.out.print("*");
				else {
					if(j==0 || j==n-1) {
						System.out.print("*");
					}else {
						System.out.print(" ");
					}
				}
			}
			System.out.println();
		}
		 

	}

}
