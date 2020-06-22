package ex10.four;
import java.util.Arrays;



/**
 * 第七章第四题（另一个文件是J_ByteIO.java）
 * @author guoxiaoyan
 * 输入五个学生成绩写入文件
 * 从文件中读出五个成绩并计算平均分
 */
import ex2.InputPara;
/**
 * 第七章第四题
 * 进行文件的读和写
 * 第一种采用字节流
 * @author 郭晓燕
 * 2017.5.5
 *
 */

public class J_Byte_Fourth {
	int studentG[];	
	public J_Byte_Fourth(){		
	}
	/**
	 * 从控制台上输入五个学生成绩
	 * @return 成绩的字符串
	 */
	public String inputGrade(int length){
		String grades="";
		studentG=new int[length];
		System.out.print("请输入第"+1+"个学生成绩:");
		grades=InputPara.inputIntNumber()+"";
		for (int i=1;i<studentG.length;i++){
			System.out.print("请输入第"+(i+1)+"个学生成绩:");
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
	 * 判断分数是否在合理的范围内
	 * @param grade 输入分数
	 * @return 真假值代表是否合理
	 */
	public static boolean idGrade(int grade){
		if ((grade>=0) && (grade<=100))
			return true;
		else return false;
	}
	/**
	 * 将成绩字符串分离转成整数存放在数组中
	 * @param s 从文件中读取出来的成绩字符串
	 * @param length 成绩数组的长度
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
	 * 计算平均分
	 * @param 整数数组，用于传递学生的成绩。
	 * @return 平均分
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
	 * 主方法
	 * @param args
	 */
	public static void main(String[] args) {
		J_Byte_Fourth jf=new J_Byte_Fourth();
		String s=jf.inputGrade(5);
		if (s.equals("")){
			System.out.print("成绩输入错误，退出");
		}else{
		J_ByteIO.writeFile("data.txt", s);
		s=J_ByteIO.readFile("data.txt");
		//System.out.println("1:"+s);
		int a[]=jf.getScore(s, 5);
		System.out.println("平均分"+jf.averageGrade(a));
		Arrays.sort(a);
		System.out.println("成绩排序后");
		for(int num:a)
			System.out.println(num);
		}		
	}

}
