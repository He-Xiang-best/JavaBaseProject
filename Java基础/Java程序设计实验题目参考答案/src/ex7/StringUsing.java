package ex7;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/**
 *
 *String 的使用
 *输出字符串“www.google.com”的长度，并分别计算并显示出‘o’ 与‘g’的个数，截取其中“google”进行输出显示。
 *“==”与equals()方法比较
 */
public class StringUsing {
	
	/**
	 * 在字符串str中查找字符ch出现的个数len
	 * @param ch 要查找的字符ch
	 */
	public static int findChar(String str,char ch){
		int len=0,charSum=0;//字符个数
		while(len<str.length()){
			if(str.charAt(len)==ch){
				charSum++;	
			}
			len++;
		}
		return len;
	}
	
	

	/**
	 * 截取String words输出
	 * @param words要截取的字符串
	 */
	public static String cutWords(String str,String words){
		String outStr;
		if(str.indexOf(words)!=-1){
			outStr=str.substring(str.indexOf(words),str.indexOf(words)+words.length());
			//System.out.println("成功截取 \""+outStr+"\"");
			}
		else{
			outStr="";
		}
		return outStr;
	}
	
	
	public static void main(String []args) throws IOException{
		BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
		
		//输入初始的字符串
		System.out.println("输入你的字符串：");
		String str=bf.readLine();
			
		//统计字符
		System.out.println("输入查找的字符：");
		char ch=bf.readLine().charAt(0);
		System.out.println("字符："+ch+"出现的个数"+findChar(str,ch));
		
		//截取输出
		System.out.println("输入你要截取的单词：");
		String cutstr=bf.readLine();
		System.out.println("截取后的字符串"+cutWords(str,cutstr));
		
	}

}
