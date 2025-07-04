package test.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import test.util.DBConnector;

/*
 * Java Data Base Connectivity(JDBC)
 * 
 * -java에서 DB에 연결해서 INSERT,UPDATE,DELETE,SELECT 등의 작업을 할 수 있다.
 * 
 * -우리는 ORACLE DataBase 에 연결해서 이런 작업을 할 예정이다.
 * 
 * -ORACLE 연결 driver 클래스가 있어야 연결이 가능하다
 */
public class MainClass04 {
	public static void main(String[] args) {

		// DBConnector의 getConn안에 Connection을 선언한 것이기 때문에
		// 따로 Connection을 선언 해줘야함
		Connection conn = null;
		
		try {
			//우리가 설계한 DBConnector 클래스를 이용해서 Connection 객체 얻어내기
			conn=new DBConnector().getConn();
			
		
		}catch (Exception e) {
			e.printStackTrace();
		}
		// SELECT 작업을 위해서 필요한 객체를 담을 지역변수 미리 만들기
		PreparedStatement pstmt = null;

		// preparedStatement는 SQL 작업을 하기위해 객체를 생성할 때 사용됨

		ResultSet rs = null;
		try {
			// 실행할 sql 문 미리 준비하기
			// """ 3개를 이용하면 javascript의 backtic 처럼 여러줄의 글을 편하게 작성할 수 있음
			String sql = """
					SELECT empno,ename,dept.deptno,dname
					FROM emp,dept
					WHERE emp.deptno=dept.deptno
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

				int empno = rs.getInt("empno");
				String ename = rs.getString("ename");
				int deptno = rs.getInt("deptno");

				String dname = rs.getString("dname");

				String info = String.format("사원번호:%d 사원이름:%s 부서번호:%d 부서명:%s", empno, ename, deptno, dname);
				// 전체 cursor 가 위치한 곳의 데이터를 테스트로 출력해보기
				System.out.println(info);
				// System.out.println(empno + " | " + ename + " | " + deptno + " | " + " | " +
				// dname);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
