package ex10.four;

import java.util.Arrays;
/**
 * 第七章第四题
 * 第二种方法采用数据字节输入输出流
 * @author 郭晓燕
 *
 */
public class J_Data_Fourth {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int grade[],result[];
		J_DataGradeOutput jdout=new J_DataGradeOutput();
		grade=jdout.inputGrade(5);
		if (grade==null){
			System.out.print("成绩输入错误，退出");
		}
		else{
			J_DataGradeOutput.writeFile("data1.txt", grade);		
			J_DataGradeInput jdin=new J_DataGradeInput();
			result=J_DataGradeInput.readFile("data1.txt", 5);
			System.out.println("平均分"+jdin.averageGrade(result));
			Arrays.sort(result);
			for(int num:result)
				System.out.println(num);
		}
	}

}
