package ch11;

public class _8Human extends Thread {
	_8Room r;
	String name;

	public _8Human(String name, _8Room r) {
		this.name = name;
		this.r = r;
		start(); //�����߳�
	}
	public void run() {
		//���뷿��
		for (int i = 1; i < 5; i++) {
			r.enter(name, i);
		}
	}

}
