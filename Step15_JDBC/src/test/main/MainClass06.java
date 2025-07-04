package test.main;

import java.sql.Connection;
import java.sql.PreparedStatement;

import test.util.DBConnector;

public class MainClass06 {

	public static void main(String[] args) {
		// DB에 추가할 회원 정보라고 가정(member table)

		String name = "누구";
		String addr = "어디";

		Connection conn = null;
		PreparedStatement pstmt = null;
		try {
			conn = new DBConnector().getConn();
			String sql = """
					INSERT INTO member
					(num,name,addr)
					VALUES(member_seq.NEXTVAL,?,?)
					""";

			pstmt = conn.prepareStatement(sql);
			// ?에 순서대로 필요한 값 바인딩
			pstmt.setString(1, name);
			pstmt.setString(2, addr);
			// sql문 실행하고 변화된(추가,수정,삭제) row의 갯수 리턴받기
			int rowCount = pstmt.executeUpdate();
			if (rowCount > 0) {
				System.out.println("작업성공");
			} else {
				System.out.println("작업 실패");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
