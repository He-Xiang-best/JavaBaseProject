package studyProgram;
/**
 * 
 * @content:不定长度的参数使用方法
 * @author:何翔
 * @time:2020年2月26日上午11:58:10
 */
public class IndefiniteLengthParameter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      parameder("何翔", 1,7,2,8,3,7,8,5,5);
	}
public static void parameder(String name,int...num) {
	System.out.println("第一个参数："+name);
	System.out.println("不定长度的参数的数组长度为："+num.length);
	for (int i = 0; i < num.length; i++) {
		System.out.print(num[i]+", ");
	}
}
	
	
	
	
	
	
	
}
