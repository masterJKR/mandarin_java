package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import DTO.Board;

public class BoardDao {
	private Connection conn;
	private PreparedStatement pt;
	private ResultSet rs;
	
	public BoardDao() {
		connect();
	}
	
	// 게시판 테이블에 저장 메서드
	public void insert( Board board) {
		
		String sql = "insert into jsp_board(writer, title, "
				+ "content, write_date) values(?,?,?,now())";
		
		try {
			pt = conn.prepareStatement(sql);
			pt.setString(1, board.getWriter());
			pt.setString(2, board.getTitle());
			pt.setString(3, board.getContent());
			pt.executeUpdate();
			
		}catch(SQLException e) {
			e.printStackTrace();
			System.out.println("게시글 저장 실패");
		}
		
		
		//  values(?    ,....  ,   now() )
		// 쿼리문 작성하고 PreparedStatement를  사용하여 저장 되게 만들기
	}
	
	
	
	
	private void connect() {
		try{
			Class.forName("com.mysql.cj.jdbc.Driver");
			String user="jkr";
			String password="12345";
			String url="jdbc:mysql://210.219.170.244:3306/jkr";
			
			conn = DriverManager.getConnection(url,user,password);
		}catch(Exception e){
			System.out.println("드라이버 로드 및 접속 실패");
			e.printStackTrace();
		}
	}
}
