package ch04;
import java.io.*; 
import java.util.Scanner;
public class J_ArraySort {
	int a[];
	int arrayLength;
	/*
	 * ���췽����������������г�ʼ��
	 *����n��������ĳ��ȡ�
	 */
	public J_ArraySort(int n){
		if (n>0){
		this.arrayLength=n;
		//�����û���������鳤�ȣ�������������
		this.a=new int[n];		
		}
		else{ arrayLength=1;
		    a=new int[1];
		}
	}
	
	public void ttt(int[] a,Scanner in){
		//��ʾ�û���������Ԫ��
		System.out.println("����������Ԫ��:");
		//ѭ����ȡ�û����������
		for(int i=0;i<a.length;i++)	{
			a[i]=in.nextInt();
		}
	}
	
	//�����������������
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
	//��ӡ�������������	
	public void printArray(int[] a){
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]+" ");
		}
	}
	public static void main(String[] args)throws IOException {
		int length;		
		//��ʾ�û��ӿ���̨����һά����ĳ���
		System.out.println("����������ĳ���:");
		Scanner in=new Scanner(System.in);
		//�ӿ���̨��������
		length=in.nextInt();
		J_ArraySort array=new J_ArraySort(length);
		
		array.ttt(array.a, in);
		System.out.println("����...");
		array.sortArray(array.a);
		array.printArray(array.a);
		
		
		
		
		
	}

}
