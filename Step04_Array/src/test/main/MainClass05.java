package test.main;

import java.util.ArrayList;
import test.mypac.MemberInfo;

public class MainClass05 {
	public static void main(String[] args) {
		MemberInfo m1 = new MemberInfo();
		MemberInfo m2 = new MemberInfo();
		MemberInfo m3 = new MemberInfo();

		m1.num = 1;
		m1.name = "a";
		m1.addr = "aa";

		m2.num = 2;
		m2.name = "b";
		m2.addr = "bb";

		m3.num = 3;
		m3.name = "c";
		m3.addr = "cc";

		// 위에서 생성한 MemberInfo 객체의 참조값 3개를 배열에 담아보세요.
		MemberInfo[] mems = { m1, m2, m3 };

		MemberInfo[] a = mems;
		MemberInfo b = mems[0];
		int c = mems[0].num;
		String d = mems[0].name;
		String e = mems[0].addr;
		// void는 type이 없기 때문에 아래 코드는 오류가 남 ==> void는 호출 전용 타입임
		// void f =mems[0].printData();

	}
}
