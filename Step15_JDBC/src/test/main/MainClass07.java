package test.main;

import java.sql.Connection;
import java.sql.PreparedStatement;

import test.dto.MemberDto;
import test.util.DBConnector;

public class MainClass07 {

	// member 테이블에 회원 한 명의 정보를 추가하는 메소드를 만든다고 생각해보자
	public static boolean insert(MemberDto dto) {
		Connection conn = null;
		PreparedStatement pstmt = null;

		int rowCount = 0;
		try {
			conn = new DBConnector().getConn();
			String sql = """
					INSERT INTO member
						(num,name,addr)
						VALUES(member_seq.NEXTVAL,?,?)
						""";

			pstmt = conn.prepareStatement(sql);

			pstmt.setString(1, dto.getName());
			pstmt.setString(2, dto.getAddr());
			rowCount = pstmt.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				// null인지 아닌지 체크 안하면 오류가남
				if (pstmt != null)
					pstmt.close();
				if (pstmt != null)
					conn.close();
			} catch (Exception e) {

			}
		}
		// 변화된 rowCount 값을 조사해서 작업의 성공 여부를 알아낼 수 있다.
		if (rowCount >= 0) {
			return true;
		} else if (rowCount <= 0) {
			return false;
		}
		return false;

	}

	public static void main(String[] args) {

		// DB에 추가할 회원 정보라고 가정(member table)

		String name = "누구2";
		String addr = "어디2";

		// 회원의 이름과 주소를 MembeerDto 객체에 담는다
		MemberDto dto = new MemberDto();
		dto.setName(name);
		dto.setAddr(addr);
		// 메소드 호출하면서 전달하고 작업의 성공여부를 리턴 받는ㄷ나
		boolean isSuccess = insert(dto);
		if (isSuccess) {
			System.out.println("성공함");
		} else {
			System.out.println("실패니까 다른 동학 해보기");

		}

	}
	
}
