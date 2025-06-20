package test.main;

import test.mypac.MemberDto;

public class MainClass13 {

	public static void main(String[] args) {
		MemberDto dto = new MemberDto();

		dto.setNum(1);
		dto.setName("박");
		dto.setAddr("가");

		System.out.println(dto.getNum());
		System.out.println(dto.getName());
		System.out.println(dto.getAddr());

		int num = dto.getNum();
		String name = dto.getName();
		String addr = dto.getAddr();
	}
}
