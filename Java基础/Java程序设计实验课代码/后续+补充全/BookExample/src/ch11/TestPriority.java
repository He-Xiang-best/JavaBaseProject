package ch11;


/**
* �����߳����ȼ�
*/
public class TestPriority {

	/*���̣߳��½������̣߳����ò�ͬ�����ȼ�*/
	 public static void main(String[] args) {
	           PrintNumberThread p1 = new PrintNumberThread("�����ȼ�");
	           PrintNumberThread p2 = new PrintNumberThread("��ͨ���ȼ�");
	           PrintNumberThread p3 = new PrintNumberThread("�����ȼ�");
	           p1.setPriority(Thread.MAX_PRIORITY);
	           p2.setPriority(Thread.NORM_PRIORITY);
	           p3.setPriority(Thread.MIN_PRIORITY);
	           p1.start();
	           p2.start();
	           p3.start();
	 }
}
