package Day11;

import java.util.ArrayList;

class container<T>{
	T value;
	
	public T getValue() {
		return value;
	}
	public void setValue(T value) {
		this.value = value;
	}
	public void show() {
		System.out.println(value);
	}
	public void demo(ArrayList<? extends T> obj) {
		
	}
	
}

public class GenericsDemo {
	public static void main(String[] args) {
		container<Integer> obj = new container<>();
		obj.value = 8;
		obj.show();
		obj.demo(new ArrayList<Integer>());
		
	}

}
