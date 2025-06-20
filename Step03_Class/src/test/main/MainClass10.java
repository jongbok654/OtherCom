package test.main;

import test.mypac.MemberInfo;

public class MainClass10 {
public static void main(String[] args) {
	/*
	 * 1.MemberInfo 객체를 3개 생성해서 그 참조값을 m1,m2,m3라는 변수에 담기
	 * 
	 * 2.m1,m2,m3에 들어 있는 참조값을 이용해서 3명의 회원정보를 각각의 객체에 담아 보세요
	 * 
	 * 3.printdata()출력
	 */
	
	MemberInfo m1 = new MemberInfo();
	MemberInfo m2 = new MemberInfo();
	MemberInfo m3 = new MemberInfo();
	
	m1.num=0;
	m1.name="ㄱ";
	m1.addr="ㄲ";
	
	m2.num=1;
	m2.name="ㄴ";
	m2.addr="ㄴㄴ";
	
	m3.num=2;
	m3.name="ㄷ";
	m3.addr="ㄸ";
	
	m1.printData();
	m2.printData();
	m3.printData();
	
}
}
