package study0207;

public class JavaTest2 {

	public static void main(String[] args) {
		/*
		 문제 4
		 	*
		 	**
		 	***     
		 	별을 위 와 같이 출력하세요 
		 	힌트> 첫번째 줄이라서 별한개 두번째 줄이라서 별두개
		 	     세번째 줄이라서 별세개 ( 이중 for문)
		 	 for(int line=1; line<=3; line++){
		 	 	for(int star=1; star<=line; star++){
		 	 		System.out.print("*");
		 	 	}		 	 	
		 	 	System.out.println();
		 	 }
		  문제 5
		  	0 1 2 3
		  	4 5 6 7
		  	8 9 10 11
		  	숫자를 위와 같이 출력하세요  ( 이중 for문)
		  	
		  	for(int i=0; i<=2; i++){
		  		for(int k=i*4; k<=(i*4)+3; k++)
		  			System.out.print(k +"  ");
		  		
		  		System.out.println();
		  	}
		  	
		  문제 6 - 비밀번호찾기
		  	1. 비밀번호는 4자리로 구성 되어있다. 
		  	2. 비밀번호 각각의 숫자는 1~9 중하나이고, 중복없다.
		  	3. 첫번째 숫자는 네번째 숫자보다 2만큼 크다.
		  	4. 두번째 숫자는 세번째 숫자 보다 작다.
		  	5. 비밀번호와 비밀번호 역순의 숫자를 더하기 하면
		  	   16566이다.   예) 1234 + 4321 
		  	6. 위 조건을 모두 충족하는 비밀번호  출력
		  	
		  	
		  	문제 7. - 알파벳 찾기(반드시 반복문 사용해서)
		  		알파벳 (대문자 또는 소문자 모두 가능하게) 입력
		  		입력한 알파벳이 몇번째 알파벳인지  찾기 - 반드시 for문으로
		  	
		  	
		  	오늘의 과제 - 숫자 야구
		  	 1~9 중의 임의의 숫자 3개를 뽑아낸다. (중복없이)
		  	 3개의 숫자를 맞추기 해야한다.
		  	 예) 임의의 숫자 - 7 1 8
		  	 입력 : 1 2 3
		  	 결과 : 0스트라이크 1볼 2아웃
		  	 입력 : 4 7 9
		  	 결과 : 0스트라이크 1볼 2아웃
		  	 입력 : 4 1 8
		  	 결과 : 2스트라이크 0볼 1아웃
		  		
		  	
		 */
		for(int a=1; a<=9; a++) {
			for(int b=1; b<=9; b++) {
				for(int c=1; c<=9; c++) {
					for(int d=1; d<=9; d++) {
						if(a!=b && a!=c && a!=d && b!=c && b!=d && c!=d) {
							if( a == d+2) {
								if( b < c) { // 두번째 숫자가 세번째보다 작다
									int pw = a*1000+b*100+c*10+d;
									int rPw = d*1000+c*100+b*10+a;
									if( (pw+rPw) == 16566) {
										System.out.println( pw );
										break;
									}
								}
							}
						}
					}
				}
			}
		}
	}

}




