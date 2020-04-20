package studyProgram;

import java.util.concurrent.TimeUnit;

public class SendMessage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      sendMessage("何翔", "央视新闻频道", "已积极贯彻习近平总书记重要讲话！综合成绩+20分" ,5, 1);
	}

public static void sendMessage(String name,String chanelname,String message,int count,int interval) {
	//if(interval<5)
		//interval = 5;
	String content = String.format("【%s】%s:%s", chanelname,name,message);
	for (int i = 0; i < count; i++) {
		System.out.println(content);
		try {
			TimeUnit.SECONDS.sleep(interval);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		/*
		try {
			Thread.sleep(interval*1000);//sleep默认毫秒
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();		
	   }*/
	}
  }
}