package study0204;

import java.util.Scanner;

public class JavaLoop1 {

	public static void main(String[] args) {
		
//		for(int i=1; i<=10; i=i+2) {
//			System.out.println( i );
//		}
		
		Scanner scan = new Scanner(System.in);
		
//		System.out.print("숫자 입력 : ");
//		int num = scan.nextInt();
//		
//		for(int i=num; i>=1 ; i--) {
//			System.out.println("반복 !!!");
//		}
		
//		for(int i=1;  i<=num;  i++) {
//			System.out.println("반복문 ! ");
//		}
		for(int i=1; i<=13; i++) {
			
		}
		// 6번 반복 하는 반복문 만들고 싶다.
		// 1부터 시작해서 6까지  1씩 증가
		// i=1; -> 1부터 시작하겠다.
		//  i<=6; -> 6까지 
		// i++  또는  i=i+1    1씩 증가
		// for( int i=1; i<=6; i++ )
		
		// 정수 5부터  17까지 출력 하는 반복문 만드세요
//		for(int i=5; i<=17; i++) {
//			System.out.println( i );
//		}
		
		// 총합 구하기 
//		int sum=0;
//		
//		for(int num=1; num<=10; num++ ) {
//			sum = sum+ num;
//		}
//		System.out.println("1부터 10까지 합 : "+sum);
		
		// 두개의 정수를 입력하여  두수중 작은숫자부터 큰숫자까지의 합을 구하세요
		// 예) 1번째숫자를 21입력하고 2번째 숫자를 4 입력했다면
		//     4부터 21까지의 합 구하기
//		int num1=0, num2=0;
//		
//		System.out.print("두개 정수 입력 : ");
//		num1 = scan.nextInt();
//		num2 = scan.nextInt();
//		
//		int small, big;
//		if(num1 < num2) {
//			small = num1;
//			big=num2;
//		}else {
//			small=num2;
//			big=num1;
//		}
//		int sum=0;
//		for( ; small<=big; small++) {
//			sum = sum + small;
//		}
//		System.out.println( sum );
		
//		if(num1 > num2) {
//			int temp = num1;
//			num1 = num2;
//			num2= temp;
//		}
		
		// 내가 키보드로 입력한 숫자에 해당하는 구구단 출력하기
		System.out.print("숫자 입력 : ");
		int gugu = scan.nextInt();
		
		for(int i=1; i<=9; i++) {
			System.out.printf("%d * %d = %d \n",gugu, i, gugu*i );
		}
		
//		System.out.println( "2*1="+(2*1) );
//		System.out.println( "2*2="+(2*2) );
//		System.out.println( "2*3="+(2*3) );
//		System.out.println( "2*4="+(2*4) );
		
		
	}

}
// 반복문 - for, while, do~while
// 반복 - 몇번을 반복할꺼냐, 몇번을 반복할것인지 정하지 않고 하는경우와
//      반복횟수를 정하여 반복하는경우
// 주로 반복횟수가 정해진 경우는 for문
// 반복횟수가 정해져 있지 않은경우는 while문









