package ch05.test;

public class J_testG<T extends Shape> {

	private T obj;

	public void setObj(T obj) {
		this.obj = obj;
	}
	public T getObj(){
		return this.obj;
	}
	public void println(T t){
		t.computerArea();
		t.getArea();
	}


}
