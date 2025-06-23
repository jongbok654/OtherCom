package test.main;

import test.mypac.MemberDto;

public class MainClass06 {
	public static void main(String[] args) {
		MemberDto dto1 = new MemberDto();
		dto1.setNum(1);
		dto1.setName("ㅂㅈㅂ");
		dto1.setAddr("ㅇㅅ");

		MemberDto dto2 = new MemberDto(2, "r", "rr");
		MemberDto dto3 = new MemberDto(3, "ㄱ", "ㄲㄲ");

		// 위에서 생성한 MemberDto 객체의 참조값 3개를 순서대로 배열 안에 넣어보시오

		MemberDto[] dtos = { dto1, dto2, dto3 };
		MemberDto[] a = dtos;
		MemberDto b = dtos[1];
		dtos[1].getNum();
		dtos[1].getName();
		dtos[1].getAddr();
	}
}
