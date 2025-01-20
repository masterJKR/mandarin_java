package study0117;

public class JavaType {

	public static void main(String[] args) {
		
//		int num = 20;
//		float pi=3.14f;
//		
//		pi = num; // 자동 형변환
//		num = (int)pi;  //강제 형변환 - 일시적 타입 변환
//		char ch = (char)pi;
//		
//		int a=2;
		
		int 한개피단축 = 2; // 2분 - 분단위
		int 일년 = 365;
		int 흡연기간 = 20;
		int 하루담배 = 5; // 하루에 5개피씩 매일 흡연
		
		int 단축수명 = 하루담배 * 한개피단축 * 일년 * 흡연기간;
		int 단축수명시간 = 단축수명/60;
		int 단축수명일 = 단축수명시간/24;
		
		System.out.println("총 단축수명(분) : " + 단축수명);
		System.out.println("총 단축수명(시간) : " + 단축수명시간);
		System.out.println("총 단축수명(일) : " + 단축수명일);
//		System.out.println("총" + 단축수명);
	}

}

/*
 * 자바 문제

담배 한개피에 수명이 2분 단축된다.
어떤 사람이 담배를 20년동안 피웠다.
이 사람이 하루에 몇개피 피우는지 (변수에 값저장)

이사람의  단축된 수명이 총 몇분인가? 출력
이사람의 단축된 수명이 총 몇 시간인가? 출력
이 사람의 단축된 수명이 총 몇일 인가? 출력

*/
