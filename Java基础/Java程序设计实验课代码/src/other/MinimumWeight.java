package other;

import java.util.Scanner;
/**
 * @content:ʵ����С���������㷨����
 * @author:04191315_����
 * @��һ����ɵ�ʱ�䣺
 * @time:2020��6��9������7:56:15
 * @��һ���޸ĵ�ʱ�䣺
 * @time:2020��6��9������7:56:15
 * @�޸�ԭ�򣺿��ò��飬�޸����ݣ�
 */
public class MinimumWeight {
	static int[][] w = new int[100][100];//w[i][j]Ϊ��i������ڵ�j����Ӧ�̵�����
	static int c[][] = new int[100][100];;//c[i][j]Ϊ��i������ڵ�j����Ӧ�̵ļ۸�
	static int[] bestx = new int[100];//bestx[i]��ʾһ���������׺�����Ž⣬������ŵ�i������Ĺ�Ӧ�̣�
	static int[] x = new int[100];//x[i]��ʱ��ŵ�i������Ĺ�Ӧ��
	static int cw=0,cc=0,bestw=Integer.MAX_VALUE;
	static int cost;//�޶��۸�
	static int n;//������
	static int m;//��Ӧ����
	
	public static void main(String[] args) {
		int i,j;
		Scanner input = new Scanner(System.in);
		System.out.print("�����벿������");
	    n = input.nextInt();
	    System.out.print("�����빩Ӧ������");
	    m = input.nextInt();
	    System.out.print("�������ܼ�ֵ������������ȣ�");
	    cost = input.nextInt();
	    System.out.println("��������������ڲ�ͬ��Ӧ�̵�������");
	    for(i=1; i<=n; i++)
	        for(j=1; j<=m; j++)
	            w[i][j] = input.nextInt();
	    System.out.println("��������������ڲ�ͬ��Ӧ�̵ļ۸�");
	    for(i=1; i<=n; i++)
	        for(j=1; j<=m; j++)
	            c[i][j] = input.nextInt();
	    Backtrack(1);
	    System.out.println("ÿ��������Ӧ�Ĺ�Ӧ�̣�");
	    for(i=1;i<=n;i++)
	        System.out.println(i+"---"+bestx[i]+"  ");
	    System.out.println();
	    System.out.println("���Բ�������С����֮��Ϊ��"+bestw);
	    input.close();
	}
	
	public static void Backtrack(int t) {
	    int j;
	    if(t>n)//������Ҷ�ӽ�㣬һ��������������������Ѿ�����
	    {
	        bestw=cw;//��ǰ��С����
	        for(j=1;j<=n;j++)
	            bestx[j]=x[j];
	    }
	    else
	    {
	        for(j=1;j<=m;j++)
	        {
	            if(cc+c[t][j]<=cost && cw+w[t][j]<bestw)
	            {
	                x[t]=j;
	                cc+=c[t][j];
	                cw+=w[t][j];
	                Backtrack(t+1);
	                cc-=c[t][j];
	                cw-=w[t][j];
	            }
	        }
	    }	
	}	
}
