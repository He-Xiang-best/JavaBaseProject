package ch11;

public class PrintNumberThread extends Thread {
	String name;
	/* ���췽���������̵߳����� */
 public PrintNumberThread(String name){
	 this.name = name;
 }
/*run��������ӡ�߳�����*/
 public void run(){
      try{
    	  for(int i = 0;i < 10;i++){
    		  System.out.println(name + ":" + i);
    		  }
    	  }catch(Exception e){}
    	  }
}


