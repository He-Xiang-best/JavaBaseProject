package ex10.four;
import java.util.Arrays;



/**
 * �����µ����⣨��һ���ļ���J_ByteIO.java��
 * @author guoxiaoyan
 * �������ѧ���ɼ�д���ļ�
 * ���ļ��ж�������ɼ�������ƽ����
 */
import ex2.InputPara;
/**
 * �����µ�����
 * �����ļ��Ķ���д
 * ��һ�ֲ����ֽ���
 * @author ������
 * 2017.5.5
 *
 */

public class J_Byte_Fourth {
	int studentG[];	
	public J_Byte_Fourth(){		
	}
	/**
	 * �ӿ���̨���������ѧ���ɼ�
	 * @return �ɼ����ַ���
	 */
	public String inputGrade(int length){
		String grades="";
		studentG=new int[length];
		System.out.print("�������"+1+"��ѧ���ɼ�:");
		grades=InputPara.inputIntNumber()+"";
		for (int i=1;i<studentG.length;i++){
			System.out.print("�������"+(i+1)+"��ѧ���ɼ�:");
			studentG[i]=InputPara.inputIntNumber();
			if (!idGrade(studentG[i])){
				grades="";
				break;
			}
			else grades=grades+";"+studentG[i];			
		}
		return grades;
	}
	/**
	 * �жϷ����Ƿ��ں���ķ�Χ��
	 * @param grade �������
	 * @return ���ֵ�����Ƿ����
	 */
	public static boolean idGrade(int grade){
		if ((grade>=0) && (grade<=100))
			return true;
		else return false;
	}
	/**
	 * ���ɼ��ַ�������ת�����������������
	 * @param s ���ļ��ж�ȡ�����ĳɼ��ַ���
	 * @param length �ɼ�����ĳ���
	 * 
	 */
	public int[] getScore(String s,int length){
		int score[]=new int[length];
		String sc[]=new String[length];
		sc=s.split(";");
		for (int i=0;i<sc.length;i++){
			//System.out.print("i:::"+sc[i]);
			score[i]=Integer.parseInt(sc[i].trim());
		}
		return score;
	}
	/**
	 * ����ƽ����
	 * @param �������飬���ڴ���ѧ���ĳɼ���
	 * @return ƽ����
	 */
	public  int averageGrade(int a[]){
		int sum=0;
		int aver=0;
		for (int num:a)
			sum+=num;
		aver=sum/a.length;
		return aver;
	}
	/**
	 * ������
	 * @param args
	 */
	public static void main(String[] args) {
		J_Byte_Fourth jf=new J_Byte_Fourth();
		String s=jf.inputGrade(5);
		if (s.equals("")){
			System.out.print("�ɼ���������˳�");
		}else{
		J_ByteIO.writeFile("data.txt", s);
		s=J_ByteIO.readFile("data.txt");
		//System.out.println("1:"+s);
		int a[]=jf.getScore(s, 5);
		System.out.println("ƽ����"+jf.averageGrade(a));
		Arrays.sort(a);
		System.out.println("�ɼ������");
		for(int num:a)
			System.out.println(num);
		}		
	}

}
