package ex07_new;

import java.util.Scanner;
/**
 * 
 * @content:�ж�һ���ַ����Ƿ�Ϊ����
 * @author:04191315_����
 * @��һ����ɵ�ʱ�䣺
 * @time:2020��5��27������4:52:39
 * @��һ���޸ĵ�ʱ�䣺
 * @time:2020��5��27������4:52:39
 * @�޸�ԭ�򣺿��ò��飬�޸����ݣ�
 */
public class Palindromes {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("����һ���ַ�����ϵͳ��Ϊ���ж��Ƿ�Ϊ����");
		String str = input.nextLine();
	if(isPalindromes(str))
		System.out.println("���ַ����ı��ǻ���");
	else
		System.out.println("���ַ����ı����ǻ���");
	input.close();
}
	public static boolean isPalindromes(String str) {
		boolean judge = true;
		char[] charArray = str.toCharArray();
		for (int i = 0; i < charArray.length/2; i++) {
			if(charArray[i]==charArray[charArray.length-1-i]) {
				continue;			
		}
			judge = false;
			break;
	}
		return judge;
	}
}
