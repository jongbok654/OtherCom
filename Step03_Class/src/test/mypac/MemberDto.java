package test.mypac;

public class MemberDto {

	private int num;
	private String name;
	private String addr;

	// ★생성자 == 클래스명과 동일하고 return type의 명시 되어있지 않음
	// 객체를 new 하는 시점에 한 번 호출됨
	// 객체를 new 하는 시점에 무언가 초기화 작업을 할게 이으면 여기서 함
	public MemberDto() {
		System.out.println("MemberDto 클래서 생성자 호출됨");
	}

	public MemberDto(int num, String name, String addr) {
		this.num = num;
		this.name = name;
		this.addr = addr;
		System.out.println(num);
		System.out.println(name);
		System.out.println(addr);
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

}
