package ch04;
import java.io.*; 
public class _1ArraySort {
	public static void main(String[] args)throws IOException {
		//提示用户从控制台输入一维数组的长度
		System.out.println("请输入数组的长度:");
BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		
	   //声明整型数组a，以及其他整型变量
		int a[];
		int i,j, arrayLength,temp;
		//从控制台读入的数据是字符串类型的数据；
		String c;
		c=in.readLine();
		//将字符串转换成整型，作为数组的长度
		arrayLength=Integer.parseInt(c);
		//根据用户输入的数组长度，创建整型数组
		a=new int[arrayLength];
		
		
		//提示用户输入数组元素
		System.out.println("请输入数组元素:");
		//循环获取用户输入的数据
		for(i=0;i<a.length;i++)
		{
			a[i]=Integer.parseInt(in.readLine());
		}
		
		
		System.out.println("排序...");
		for(i=0;i<a.length;i++)
		{
			for(j=i+1;j<a.length;j++)
			{
				if(a[j]<a[i])
				{	temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}			
			}	
		}
		//输出排序后的数组元素
		for(i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		double s=Double.parseDouble("45.12");
	}

}
