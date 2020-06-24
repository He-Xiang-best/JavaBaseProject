package ch11;

public class Human extends Thread {

	Room r;
	String name;
	
	

	public Human(String name, Room r) {
		this.name = name;
		this.r = r;
		start(); //启动线程
	}
	public void run() {
		//进入房间
		for (int i = 1; i < 5; i++) {
			r.enter(name);
		}
	}

}
