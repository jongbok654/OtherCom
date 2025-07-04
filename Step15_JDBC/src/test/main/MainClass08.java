package test.main;

import java.util.Scanner;

import test.dao.MemberDao;
import test.dto.MemberDto;

public class MainClass08 {
	public static void main(String[] args) {

		// Scanner 객체를 이용해서 회원의 이름과 주소를 입력 받은 다음
		Scanner scan = new Scanner(System.in);

		System.out.println("이름입력:");
		String name = scan.nextLine();

		System.out.println("주소입력:");
		String addr = scan.nextLine();

		// MemberDao 객체를 이용해서 DB에 저장하려면?
		MemberDao dao = new MemberDao();
		MemberDto dto = new MemberDto();
		dto.setName(name);
		dto.setAddr(addr);
		boolean isSuccess = dao.insert(dto);
		if (isSuccess) {
			System.out.println(name + "님의 정보를 성공적으로 DB에 저장했습니다.");

		} else {
			System.out.println("저장 실패");
		}
	}
}
