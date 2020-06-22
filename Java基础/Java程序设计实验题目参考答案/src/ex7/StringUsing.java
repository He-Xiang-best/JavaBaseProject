package ex7;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/**
 *
 *String ��ʹ��
 *����ַ�����www.google.com���ĳ��ȣ����ֱ���㲢��ʾ����o�� �롮g���ĸ�������ȡ���С�google�����������ʾ��
 *��==����equals()�����Ƚ�
 */
public class StringUsing {
	
	/**
	 * ���ַ���str�в����ַ�ch���ֵĸ���len
	 * @param ch Ҫ���ҵ��ַ�ch
	 */
	public static int findChar(String str,char ch){
		int len=0,charSum=0;//�ַ�����
		while(len<str.length()){
			if(str.charAt(len)==ch){
				charSum++;	
			}
			len++;
		}
		return len;
	}
	
	

	/**
	 * ��ȡString words���
	 * @param wordsҪ��ȡ���ַ���
	 */
	public static String cutWords(String str,String words){
		String outStr;
		if(str.indexOf(words)!=-1){
			outStr=str.substring(str.indexOf(words),str.indexOf(words)+words.length());
			//System.out.println("�ɹ���ȡ \""+outStr+"\"");
			}
		else{
			outStr="";
		}
		return outStr;
	}
	
	
	public static void main(String []args) throws IOException{
		BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
		
		//�����ʼ���ַ���
		System.out.println("��������ַ�����");
		String str=bf.readLine();
			
		//ͳ���ַ�
		System.out.println("������ҵ��ַ���");
		char ch=bf.readLine().charAt(0);
		System.out.println("�ַ���"+ch+"���ֵĸ���"+findChar(str,ch));
		
		//��ȡ���
		System.out.println("������Ҫ��ȡ�ĵ��ʣ�");
		String cutstr=bf.readLine();
		System.out.println("��ȡ����ַ���"+cutWords(str,cutstr));
		
	}

}
