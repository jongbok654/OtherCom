package test.mypac;

//Generic 클래스는 2개 이상일 수도 있다
public class Pair<K, V> {
	// 필드
	private K key;
	private V value;

	// 생성자

	public Pair(K key, V value) {
		this.key = key;
		this.value = value;
	}

	public K getKey() {
		return key;
	}

	public void setKey(K key) {
		this.key = key;
	}

	public V getValue() {
		return value;
	}

	public void setValue(V value) {
		this.value = value;
	}
	
	

}
