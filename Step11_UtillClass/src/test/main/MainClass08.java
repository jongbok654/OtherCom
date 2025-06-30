package test.main;

import java.util.HashMap;
import java.util.Map;

public class MainClass08 {
	public static void main(String[] args) {
		/*
		 * HashMap<key type,value type>
		 * 
		 * key type에는 주로 String type이 주로 쓰임
		 * 
		 * value type은 담고 싶은 데이터 type을 고려해서 지정을 많이함
		 * 
		 * value type에 Object로 지정하면 어떤 data tpye이든 다 담을 수 있다!!!
		 * 
		 * 순서가 없는 데이터를 담을 때 사용하면 됨!
		 * 
		 * dto 클래스 대신에 사용하기도 한다
		 */

		HashMap<String, Object> map = new HashMap();
		map.put("num", 1);
		map.put("name", "김구라");
		map.put("isMan", true);
		// 오브젝트 타입이기 때문에 int,String,boolean 모두 다 들어가는 모습이다.

		// 데이터를 참조할 때는 .get(key) 메소드를 이용한다

		// Object 타입은 아무 데이터나 다 담을 수 있지만 참조할 때는 Casting 해야한다는 번거로움이 있다
		int num = (Integer) map.get("num");

		String name = (String) map.get("name");

		boolean isMan = (boolean) map.get("isMan");

		// 동일한 키값으로 넣으면 수정

		map.put("num", 5);

		// 특정 key 값으로 담긴 내용 삭제
		map.remove("isMan");

		// 모두삭제
		map.clear();

		//Map 인터페이스의 of()라는 static 메소드로 read only Map 객체를 만들어 낼 수 있다.
		
		Map<String,Object> map2=Map.of(
				"num2",2,
				"name","해골",
				"isMan",false);
	}
}
