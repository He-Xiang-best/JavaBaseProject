package ch11;

public class Room {
	/*ͬ����������ʾ�̵߳Ľ�����˳�*/
	public synchronized void enter(String name) {		
		System.out.println(name + "�ѽ��룡");
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
		}
		System.out.println(name + "�뿪��");
	}

	/*�����̺߳͹�������*/
	public static void main(String[] args) {
		
		Room r = new Room(); //�������
		Human h1 = new Human("1", r);
		Human h2 = new Human("2", r);
		Human h3 = new Human("3", r);
	}

}
