package study0121;

public class Java_print {

	public static void main(String[] args) {
		
		System.out.println(" 한줄에 하나씩 출력 !@#@!$!");
		System.out.print(" 한줄에 \n 이어서 출력 ");
		System.out.print(" 그다음 이어서 출력 ");
		
		System.out.printf("그냥 print 처럼 사용 가능 ");
		System.out.printf(" println 처럼 \n 하려면 \n");
		System.out.printf(" 다음줄 \n에 출력  \n");
		System.out.printf(" %d ", 100);
		System.out.printf( " %% ");
		// 형식 지정자를 사용하기 위해 주의 할것
		// 1. 형식지정자와 데이터 위치를 맞춰야 한다.
		System.out.printf(" %d  %f ", 100, 3.14 );
		
		// 2. 형식 지정자와 데이터 갯수 맞추기
		System.out.printf(" %d %d %d ", 10,20,30);
		
		System.out.println(2025+"년" + 1+"월" + 21+"일");
		System.out.printf("%d년 %d월 %d일 \n",2025,1,21);
		
		float fnum = 5.12345f;
		System.out.println("println 출력 : " + fnum );
		System.out.printf("printf 출력  %.1f \n", fnum);  
		
		int num =15;
		System.out.println(num);
		System.out.printf("%-4d\n", num);

	}

}

/*
      형식 지정자 ( 서식문자 )
      %d, %i - 10진수 정수   
      %f - 10진수 실수
      %c - 문자 
      %s - 문자열
      %b - boolean 타입 
      
      
      1조. 권민석  주동건  김미란  정수영
2조. 박건태  이종남  허승원  
3조. 박은희  장은호  신선우  김현진
4조. 곽찬양  김명준  이은진  최예나
5조. 오재원  이정훈  김석진  서경림

마지막 데이터베이스 재시험  조별 대회
1등 조에게 소정의 선물~
2등 : 조원 전체 점수 5점 씩 플러스
5등 : 조원 전체 -10점씩


 */



