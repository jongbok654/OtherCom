package test.main;
import java.util.ArrayList;
import test.mypac.MemberInfo;

public class MainClass04 {
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

		MemberInfo[] mems2 = { null, null, null };
		mems2[0] = m1;
		mems2[1] = m2;
		mems2[2] = m3;

		MemberInfo[] mems3 = new MemberInfo[3];
		mems3[0] = m1;
		mems3[1] = m2;
		mems3[2] = m3;
		
		//ArrayList 사용한 예시  ==> 이것도 import ArrayList해야함
		ArrayList<MemberInfo> mes = new ArrayList<>();
		mes.add(m1);
		mes.add(m2);
		mes.add(m3);

		for (int i = 0; i < 3; i++) {
			mes.get(i).printData();
		}
	}
}
