package ch11;

public class Human extends Thread {

	Room r;
	String name;
	
	

	public Human(String name, Room r) {
		this.name = name;
		this.r = r;
		start(); //�����߳�
	}
	public void run() {
		//���뷿��
		for (int i = 1; i < 5; i++) {
			r.enter(name);
		}
	}

}
