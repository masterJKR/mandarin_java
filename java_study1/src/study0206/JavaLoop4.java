package study0206;

import java.util.Scanner;

public class JavaLoop4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int user=0;
		do {
			System.out.print("1.가위  2.바위  3. 보  : ");
			user = sc.nextInt();
			//if( user>=1 && user <=3 ) break;
		}while(  !(user>=1 && user <=3) );
		
		System.out.println("가위바위보 진행");
		
//		int a=100;
//		do {
//			System.out.println(" do~ while문");
//			a++;
//		}while( a < 15);
		
		
		
		
		// 초기값 -> { 내용 } -> 조건식 비교 -> 참이면 -> { 내용 } 
		
//		int i=1;
//		int k=1;
//		while( i<=3 ) {
//			fsadd
//			d
//			adas
//			d
//			a
//			das
//			d
//			adsa
//			d
//			while( k<=2 ) {
//				System.out.println("i= "+i+"   k="+k);
//				k++;
//			}
//			k=1;
//			i= i+3;
//		}
		
//		for(int i=1; i<=3; i++) {
//			for(int k=1; k<=2; k++) 
//				System.out.println("i= "+i+"   k="+k);
//		}

	}

}
