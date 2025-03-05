package generic2;

public class MainMt {

	public static void main(String[] args) {
		
//		Bottle<String> b1 = new Bottle<String>();
//		// Bottle클래스의 제네릭 타입으로 String 지정
//		// String item으로 변경 , 
//		// make메서드의 매개변수 String item으로변경
//		b1.make( new String("레몬소주") );
		
		Soju sj = new Soju("참이슬","진로",16);
		Wine wn = new Wine("디안느소비뇽","앙드레뤼통",12);
		Makgeolli mg = new Makgeolli("공주밤막걸리","사곡양조원",6);
		
		sj.aa();
		
		Bottle<Soju> 참이슬 = new Bottle<>();
		참이슬.make( sj );
		Bottle<Alcohol> 술병 = new Bottle<>();
		술병.make(wn);
		Bottle<Makgeolli> 밤막걸리 = new Bottle<>();
		밤막걸리.make( mg );
		
		Service 은호 = new Service();
		은호.drink(참이슬);
		
		Service 수영 = new Service();
		수영.drink( 밤막걸리 );
		
		
		
		//술병 = 참이슬;  
		
		Alcohol ach = sj;
		
		
//		Bottle<Wine> 소비뇽 = new Bottle<>();
//		소비뇽.make( wn);
//		

//		
//		Bottle<Alcohol> 소주병 = new Bottle<>();
//		소주병.make( sj );
		
//		Bottle<Toy> 티니핑 = new Bottle<>();
//		티니핑.make( new Toy() );
		
	}

}

/*
 Bottle<Alcohol> 소주병 = new Bottle<>();
 public class Bottle {  
	Alcohol item;
	
	public void make(Alcohol item) {
		System.out.println("만들기");
		this.item = item;
		System.out.println( item );
	}
}

 
 
 Bottle<String> b1 = new Bottle<String>();
 
 public class Bottle {  
	String item;
	
	public void make(String item) {
		System.out.println("만들기");
		this.item = item;
		System.out.println( item );
	}
}

Bottle<Soju> 참이슬 = new Bottle<>();
public class Bottle {  
	Soju item;
	
	public void make(Soju item) {
		System.out.println("만들기");
		this.item = item;
		System.out.println( item );
	}
}


제네릭 - 클래스 내부에 사용할 타입을 외부에서 지정하는 방법
    Member<Admin> a = new Member<>();
    -> Member 클래스 내부에 Admin이라는 타입을 사용한다.
    ->  Member 클래스는 class Member<T> 로 정의 되어 있어야한다.
    ->  클래스내부의 인스턴스 변수나 인스턴스 메서드의 매개변수 타입또는 반환 타입을
          제네릭 타입으로 표현 가능하다.
 Member<Admin> a = new Member<>() 은  Admin 클래스의 객체 생성이 아니다.
 Member클래스의 객체 생성이다. 
 
   - 제네릭을 사용하는 클래스인경우 해당 클래스의 참조변수들은  Member<Admin>까지를
      타입으로 인지한다.  
   - 제네릭에서는 상하 관계가 없다.  (제네릭 타입으로 부모클래스나 자식클래스를 사용해도
       대입 연산이 이루어 지지않는다.)
   - 제네릭을 사용하므로 타입에 대한 예외 상황을 방지 할수 있다. 
       (컴파일 과정에서 발생할수 있는 오류 최소화 )
   -  제네릭 사용 범위 제한은  extends와 super 이다.
   -  메서드에만 제네릭 사용 되는 경우 와일드카드(?)를 사용하는게 여러 타입처리 가능
   -  와일드 카드의 범위 제한은 extends ,super이다.
 









 */
