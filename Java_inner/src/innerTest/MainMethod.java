package innerTest;

public class MainMethod {

	public static void main(String[] args) {
		
		Tire tire = new Tire();
		tire.setInch( 18 );
		
		Car car = new Car( tire );
		
		System.out.println( car.getTire().getInch() );
	}

}
/*
 	책     페이지  - 포함
 	책    전자책  - 상속 (신선우)
 	집    방  - 포함( 김명준 )
 	스마트폰   배터리 - 포함 (김현진)
 	식물   나무  -  상속 ( 박은희)
 	의자  다리  - 포함(서 경림)
 	강아지    꼬리  - 포함( 박건태 )
 	사람    학생  - 상속 ( 오재원 ) 
 	비행기  날개  - 포함 ( 김미란 )
 	비행기   전투기  - 상속 ( 주동건 )
 	피아노   건반  - 포함 (허승원 )
 	회사    직원  - 포함 ( 장은호 )
 	음악앨범    곡   - 포함 ( 정수영 ) 
 	영화    다큐멘터리영화   -   상속 ( 이정훈 )
 	컵  손잡이 - 포함( 김석진) 
 	자동차경주    포뮬라경기  -  상속(이종남 )
 	
 
 
 
 */
// 상속 관계와 포함관계
//   직업    프로그램개발자

//   필기도구    볼펜

//  자전거    체인

//  김미란    최예나     메타7회차반

//  과일     오렌지







