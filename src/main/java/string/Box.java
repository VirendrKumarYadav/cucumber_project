package string;

public class Box<K, V> {

	private V item2;
	private K item1;

	public void setItem(K item1, V item2) {
		this.item1 = item1;
		this.item2 = item2;
	}

	public K getKey() {
		return item1;
	}

	public V getValue() {
		return item2;
	}

}
