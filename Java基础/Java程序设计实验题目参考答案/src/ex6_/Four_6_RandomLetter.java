package ex6_;

import java.util.Arrays;
/**
 * 第四章第六题
 * 生成随机字母并进行排序
 * @author 郭晓燕
 * @since JDK1.6
 * @version 1.0
 * @since 2017.4.23
 *
 */
public class Four_6_RandomLetter {
	char[] charArray;
	
	public Four_6_RandomLetter(int length){
		charArray=new char[length];
		for (int i=0;i<charArray.length;i++){
			charArray[i]='a';			
		}
	}
	/**
	 * 生成互不相同的length个字母并保存在数组中
	 * 调用findNumInArray方法保证字母不相同
	 * @param length 生成随机字母的个数
	 */
	public void Random(int length){
		int random=0;
		int k=0;
		while(k<length){
			random=(int)(Math.random()*26+97);
			//System.out.println(random+"zimu:"+(char)random);
			char c=(char)random;
			//如果生成的随机字母已存在则重新随机生成，否则保存在数组里。
			if (findNumInArray(c))
				continue;
			else {
				charArray[k]=c;
				k++;
			}			
		}		
	}
	
	/**
	 * 查找字符在数组中是否存在	 * 
	 * @param a 被查找的字符
	 * @return 存在返回真，否则返回假
	 */
	public boolean findNumInArray(char a){
		boolean b=false;
		if (charArray!=null){
		for(int i=0;i<charArray.length;i++){
			if (charArray[i]==a)
				b=true;
			}	
		}
		return b;
		}
		
	/**
	 * 打印排序前和排序后的字符数组
	 */
	
	public void printArray(){
		System.out.println("排序前");
		for (char c:charArray){
			System.out.print(c);
		}
		System.out.println("排序后");
		Arrays.sort(charArray);//调用Arrays类的排序方法
		for (char c:charArray){
			System.out.print(c);
		}
	}
}
