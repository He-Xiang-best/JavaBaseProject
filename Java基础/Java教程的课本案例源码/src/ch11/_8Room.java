package ch11;

public class _8Room {
	/*ͬ����������ʾ�̵߳Ľ�����˳�*/
	public synchronized void enter(String name,int flag){
		try {
			System.out.println(name +"��"+flag+"��"+ "�ѽ��룡");	
			if (flag==2)  //�ڶ��ν��뷿��ʱ����wait����
				wait();				
			
System.out.println(name +"��"+flag+"��"+ "�뿪��");
			notifyAll();  //֪ͨ�����ȴ��̻߳�ȡ����
		} catch (Exception e) {
		}
	}

	/*�����̺߳͹�������*/
	public static void main(String[] args) {
		_8Room r = new _8Room(); //�������
		_8Human h1 = new _8Human("1", r);
		_8Human h2 = new _8Human("2", r);
		_8Human h3 = new _8Human("3", r);
	}

}
