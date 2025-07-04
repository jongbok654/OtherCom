package test.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/*
 * Java Data Base Connectivity(JDBC)
 * 
 * -java에서 DB에 연결해서 INSERT,UPDATE,DELETE,SELECT 등의 작업을 할 수 있다.
 * 
 * -우리는 ORACLE DataBase 에 연결해서 이런 작업을 할 예정이다.
 * 
 * -ORACLE 연결 driver 클래스가 있어야 연결이 가능하다
 */
public class MainClass01 {
	public static void main(String[] args) {

		// DB에 접속해서 작업을 하려면 Connection 객체가 필요하다
		Connection conn = null;

		try {
			// 오라클 드라이버 로딩
			Class.forName("oracle.jdbc.driver.OracleDriver");
			// 접속할 DB 의 정보 @아이피주소:port번호:db이름
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			// 계정 비밀번호를 이용해서 Connection 객체의 참조값 얻어오기
			conn = DriverManager.getConnection(url, "scott", "TIGER");
			// 예외가 발생하지 않고 여기까지 실행순서가 내려오면 접속 성공이다.
			System.out.println("Oracle DB 접속 성공");
		} catch (Exception e) {
			e.printStackTrace();
		}

		// -------------------------------------------------------------
		// 위에까지가 Oracle DB 접속 절차

		// SELECT 작업을 위해서 필요한 객체를 담을 지역변수 미리 만들기
		PreparedStatement pstmt = null;
		
		//preparedStatement는 SQL 작업을 하기위해 객체를 생성할 때 사용됨
		
		ResultSet rs = null;
		try {
			// 실행할 sql 문 미리 준비하기
			// """ 3개를 이용하면 javascript의 backtic 처럼 여러줄의 글을 편하게 작성할 수 있음
			String sql = """
					SELECT empno,ename,job,sal
					FROM emp
					ORDER BY empno ASC
					""";
			// """안에는 ; 붙이면 안됨
			// sql 문을 전달하면서 PreaparedStatement 객체의 참조값 얻어내기
			pstmt = conn.prepareStatement(sql);
			// SELECT 문 실행하고 결과를 ResultSet 객체로 얻어내기
			rs = pstmt.executeQuery();

			// 반복문 돌면서 cursor가 위치한 곳 모두 출력
			// rs.next()는 rs의 다음 행 ==> 이걸 while로 반복하니까 모든 행 훑기
			while (rs.next()) {
				// empno라는 칼럼의 정수를 받는 변수 생성
				int empno = rs.getInt("empno");

				String ename = rs.getString("ename");
				String job = rs.getString("job");
				double sal = rs.getDouble("sal");
				// 전체 cursor 가 위치한 곳의 데이터를 테스트로 출력해보기
				System.out.println(empno + " | " + ename + "  |  " + job + "  |  " + sal + " |  ");
			}
		

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
