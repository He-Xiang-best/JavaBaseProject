package ch11;

public class PrintNumberThread extends Thread {
	String name;
	/* 构造方法，设置线程的名字 */
 public PrintNumberThread(String name){
	 this.name = name;
 }
/*run方法，打印线程名字*/
 public void run(){
      try{
    	  for(int i = 0;i < 10;i++){
    		  System.out.println(name + ":" + i);
    		  }
    	  }catch(Exception e){}
    	  }
}


