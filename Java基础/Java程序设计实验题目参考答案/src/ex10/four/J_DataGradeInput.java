package ex10.four;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 
 * @author 郭晓燕
 * 2017.5.9
 */
public class J_DataGradeInput {

	
	public static int[] readFile(String filename,int length){
		int score[]=new int[length];
	    try{
        DataInputStream dfin =new DataInputStream(new BufferedInputStream(new FileInputStream(filename)));
	    for (int i=0;i<length;i++)
	    	score[i]=dfin.readInt();
	    dfin.close();
	    }catch(FileNotFoundException e){
	    	System.err.println("发生文件未找到异常:" + e);
            e.printStackTrace( );
	    }catch(IOException e){
	    	System.err.println("发生IO异常:" + e);
            e.printStackTrace( );
	    }
	    return score;
	}
	
	/**
	 * 计算平均分
	 * @param a 存放成绩的整数数组
	 * @return 成绩的平均分
	 */
	public  int averageGrade(int a[]){
		int sum=0;
		int aver=0;
		for (int num:a)
			sum+=num;
		aver=sum/a.length;
		return aver;
	}
}
