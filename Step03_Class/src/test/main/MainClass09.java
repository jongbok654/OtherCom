package test.main;

import test.mypac.MemberInfo;

public class MainClass09 {
	public static void main(String[] args) {
		// 1.한 명의 회원정보를 MemberInfo 객체에 담아보세요
		// (번호,이름,주소는 재주껏)
		MemberInfo mem = new MemberInfo();
		mem.num = 1;
		mem.name = "가가가";
		mem.addr = "까까까";
		// 2.위에서 생성한 객체(MemberInfo)의 printData()메소드 호출하기
		mem.printData();
	}

}
