package studyProgram;
/**
 * 
 * @content:�������ȵĲ���ʹ�÷���
 * @author:����
 * @time:2020��2��26������11:58:10
 */
public class IndefiniteLengthParameter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      parameder("����", 1,7,2,8,3,7,8,5,5);
	}
public static void parameder(String name,int...num) {
	System.out.println("��һ��������"+name);
	System.out.println("�������ȵĲ��������鳤��Ϊ��"+num.length);
	for (int i = 0; i < num.length; i++) {
		System.out.print(num[i]+", ");
	}
}
	
	
	
	
	
	
	
}
