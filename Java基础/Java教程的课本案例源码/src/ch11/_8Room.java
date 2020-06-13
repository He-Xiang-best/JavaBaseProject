package ch11;

public class _8Room {
	/*同步方法，显示线程的进入和退出*/
	public synchronized void enter(String name,int flag){
		try {
			System.out.println(name +"第"+flag+"次"+ "已进入！");	
			if (flag==2)  //第二次进入房间时调用wait方法
				wait();				
			
System.out.println(name +"第"+flag+"次"+ "离开！");
			notifyAll();  //通知其他等待线程获取该锁
		} catch (Exception e) {
		}
	}

	/*启动线程和共享数据*/
	public static void main(String[] args) {
		_8Room r = new _8Room(); //房间对象
		_8Human h1 = new _8Human("1", r);
		_8Human h2 = new _8Human("2", r);
		_8Human h3 = new _8Human("3", r);
	}

}
