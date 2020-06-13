package ch11;

public class _9DeadLock implements Runnable {
    private boolean flag;
    static Object o1 = new Object(), o2 = new Object();
    public void run() {
             System.out.println(flag);
             if (flag) {
                    synchronized (o1) {
                            try {
                                   Thread.sleep(500);
                             } catch (InterruptedException e) {
                                     e.printStackTrace();
                             }
                            synchronized (o2) {
                                     System.out.println("AAA");
                             }
                     }
             } else {
                    synchronized (o2) {
                            try {
                                 Thread.sleep(500);
                             } catch (InterruptedException e) {
                                     e.printStackTrace();
                             }
                            synchronized (o1) {
                                     System.out.println("BBB");
                             }
                     }
             }
     }
    public static void main(String[] args) {
_9DeadLock o1 = new _9DeadLock();
	_9DeadLock o2 = new _9DeadLock();
	o1.flag = true;
	o2.flag = false;
	Thread A = new Thread(o1);
	Thread B = new Thread(o2);
	A.start();
	B.start();
}

}
