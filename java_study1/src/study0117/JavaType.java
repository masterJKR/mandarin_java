package study0117;

public class JavaType {

	public static void main(String[] args) {
		
		int num = 20;
		float pi=3.14f;
		
		pi = num; // 자동 형변환
		num = (int)pi;  //강제 형변환 - 일시적 타입 변환
		char ch = (char)pi;
		
		int a=2;
		
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
