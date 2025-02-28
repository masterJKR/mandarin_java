package interface5;

public class Mainmt {

	public static void main(String[] args) {
		
		CRUD member = new MemberService();
		CRUD board = new BoardService();
		
		member.save();
		
		DBConnect mem = new MemberService();
		//mem.save();  // 부모클래스인 DBConnect에는 save 메서드가 없다.
	}

}


// 패키지 와 main메서드 있는 클래스 새로만드세요