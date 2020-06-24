package ex07_old;

public class CharacterDemo {

	public static void main(String[] args) {
		String str = "www.google.com";
		int count1=0,count2=0;
		System.out.println("字符串"+str+"的长度为："+str.length());
		for (int i = 0; i < str.length(); i++) {
			if(str.charAt(i)=='o') {
				count1++;
			}
			if(str.charAt(i)=='g') {
				count2++;
			}
		}
		System.out.println("字符‘o’的个数为："+count1);
		System.out.println("字符‘g’的个数为："+count2);
		System.out.println("截取片段输出为："+str.substring(4, 10));

	}

}
