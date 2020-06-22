package ex10.four;

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.FileOutputStream;

import ex2.InputPara;

/**
 * 
 * @author Administrator
 *
 */
public class J_DataGradeOutput {
	
	/**
	 * 从控制台上输入五个学生成绩
	 * 如果输入成绩不正确则返回空值
	 * 否则返回对应的成绩数组
	 * @param length代表输入的N个学生数
	 * @return 成绩的整数数组
	 */
	public int[] inputGrade(int length){
		int[] studentG=new int[length];
		for (int i=0;i<studentG.length;i++){
			System.out.print("请输入第"+(i+1)+"个学生成绩:");
			studentG[i]=InputPara.inputIntNumber();
			if (!J_Byte_Fourth.idGrade(studentG[i])){
				studentG=null;
				break;
			}
			
		}
		return studentG;
	}
	/**
	 * 将数组a的成绩写入文件filename中
	 * @param filename 写入文件的文件名
	 * @param a 要写入的学生成绩数组
	 */
	public static void writeFile(String filename,int a[]){
		try{
		FileOutputStream fout = new FileOutputStream(filename);
        DataOutputStream dfout =new DataOutputStream(new BufferedOutputStream(fout));
        int i;
        for (i=0; i< a.length; i++)
            dfout.writeInt(a[i]);
        dfout.close( );
		}catch(Exception ex){
			System.err.println("发生异常:" + ex);
            ex.printStackTrace( );
		}
	}
}
