package ex6_;

import java.util.Arrays;
/**
 * �����µ�����
 * ���������ĸ����������
 * @author ������
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
	 * ���ɻ�����ͬ��length����ĸ��������������
	 * ����findNumInArray������֤��ĸ����ͬ
	 * @param length ���������ĸ�ĸ���
	 */
	public void Random(int length){
		int random=0;
		int k=0;
		while(k<length){
			random=(int)(Math.random()*26+97);
			//System.out.println(random+"zimu:"+(char)random);
			char c=(char)random;
			//������ɵ������ĸ�Ѵ���������������ɣ����򱣴��������
			if (findNumInArray(c))
				continue;
			else {
				charArray[k]=c;
				k++;
			}			
		}		
	}
	
	/**
	 * �����ַ����������Ƿ����	 * 
	 * @param a �����ҵ��ַ�
	 * @return ���ڷ����棬���򷵻ؼ�
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
	 * ��ӡ����ǰ���������ַ�����
	 */
	
	public void printArray(){
		System.out.println("����ǰ");
		for (char c:charArray){
			System.out.print(c);
		}
		System.out.println("�����");
		Arrays.sort(charArray);//����Arrays������򷽷�
		for (char c:charArray){
			System.out.print(c);
		}
	}
}
