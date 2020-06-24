package ch11;

public class Room {
	/*同步方法，显示线程的进入和退出*/
	public synchronized void enter(String name) {		
		System.out.println(name + "已进入！");
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
		}
		System.out.println(name + "离开！");
	}

	/*启动线程和共享数据*/
	public static void main(String[] args) {
		
		Room r = new Room(); //房间对象
		Human h1 = new Human("1", r);
		Human h2 = new Human("2", r);
		Human h3 = new Human("3", r);
	}

}
