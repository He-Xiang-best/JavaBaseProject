package ch04;
import java.io.*; 
public class _1ArraySort {
	public static void main(String[] args)throws IOException {
		//��ʾ�û��ӿ���̨����һά����ĳ���
		System.out.println("����������ĳ���:");
BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		
	   //������������a���Լ��������ͱ���
		int a[];
		int i,j, arrayLength,temp;
		//�ӿ���̨������������ַ������͵����ݣ�
		String c;
		c=in.readLine();
		//���ַ���ת�������ͣ���Ϊ����ĳ���
		arrayLength=Integer.parseInt(c);
		//�����û���������鳤�ȣ�������������
		a=new int[arrayLength];
		
		
		//��ʾ�û���������Ԫ��
		System.out.println("����������Ԫ��:");
		//ѭ����ȡ�û����������
		for(i=0;i<a.length;i++)
		{
			a[i]=Integer.parseInt(in.readLine());
		}
		
		
		System.out.println("����...");
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
		//�������������Ԫ��
		for(i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		double s=Double.parseDouble("45.12");
	}

}
