package ch04;
import java.io.*; 
import java.util.Scanner;
public class J_ArraySort {
	int a[];
	int arrayLength;
	/*
	 * 构造方法，对整形数组进行初始化
	 *参数n代表数组的长度。
	 */
	public J_ArraySort(int n){
		if (n>0){
		this.arrayLength=n;
		//根据用户输入的数组长度，创建整型数组
		this.a=new int[n];		
		}
		else{ arrayLength=1;
		    a=new int[1];
		}
	}
	
	public void ttt(int[] a,Scanner in){
		//提示用户输入数组元素
		System.out.println("请输入数组元素:");
		//循环获取用户输入的数据
		for(int i=0;i<a.length;i++)	{
			a[i]=in.nextInt();
		}
	}
	
	//对整型数组进行排序
	public void sortArray(int[] a){
		int temp;
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[j]<a[i])
				{	temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}			
			}	
		}
	}
	//打印输出排序后的数组	
	public void printArray(int[] a){
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]+" ");
		}
	}
	public static void main(String[] args)throws IOException {
		int length;		
		//提示用户从控制台输入一维数组的长度
		System.out.println("请输入数组的长度:");
		Scanner in=new Scanner(System.in);
		//从控制台读入数据
		length=in.nextInt();
		J_ArraySort array=new J_ArraySort(length);
		
		array.ttt(array.a, in);
		System.out.println("排序...");
		array.sortArray(array.a);
		array.printArray(array.a);
		
		
		
		
		
	}

}
