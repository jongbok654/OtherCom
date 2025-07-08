package practice.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import practice.dto.RouletteDto;
import practice.util.DBConnector;

public class RouletteDao {

	public static boolean insert(RouletteDto dto) {
		
		Connection conn=null;
		PreparedStatement pstmt = null;
	
		try {
			conn = new DBConnector().getConn();
			String sql = """
					INSERT INTO Roulette
					(num,name,addr)
					VALUES(ROulette_seq.NEXTVAL,?,?)
					""";
			
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setInt(1, dto.getNum());
			pstmt.setString(2, dto.getAddr());
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(pstmt !=null)
					pstmt.close();
				if(pstmt !=null)
					conn.close();
			}catch(Exception e) {
				
			}
		}
		return false;
		
	}
}
