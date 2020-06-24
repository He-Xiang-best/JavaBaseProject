package other;

import java.util.Scanner;
/**
 * @content:实现最小机器重量算法问题
 * @author:04191315_何翔
 * @第一次完成的时间：
 * @time:2020年6月9日下午7:56:15
 * @第一次修改的时间：
 * @time:2020年6月9日下午7:56:15
 * @修改原因：课堂测验，修改内容：
 */
public class MinimumWeight {
	static int[][] w = new int[100][100];//w[i][j]为第i个零件在第j个供应商的重量
	static int c[][] = new int[100][100];;//c[i][j]为第i个零件在第j个供应商的价格
	static int[] bestx = new int[100];//bestx[i]表示一次搜索到底后的最优解，用来存放第i个零件的供应商，
	static int[] x = new int[100];//x[i]临时存放第i个零件的供应商
	static int cw=0,cc=0,bestw=Integer.MAX_VALUE;
	static int cost;//限定价格
	static int n;//部件数
	static int m;//供应商数
	
	public static void main(String[] args) {
		int i,j;
		Scanner input = new Scanner(System.in);
		System.out.print("请输入部件数：");
	    n = input.nextInt();
	    System.out.print("请输入供应商数：");
	    m = input.nextInt();
	    System.out.print("请输入总价值不超过的最大额度：");
	    cost = input.nextInt();
	    System.out.println("请输入各部件的在不同供应商的重量：");
	    for(i=1; i<=n; i++)
	        for(j=1; j<=m; j++)
	            w[i][j] = input.nextInt();
	    System.out.println("请输入各部件的在不同供应商的价格：");
	    for(i=1; i<=n; i++)
	        for(j=1; j<=m; j++)
	            c[i][j] = input.nextInt();
	    Backtrack(1);
	    System.out.println("每个部件对应的供应商：");
	    for(i=1;i<=n;i++)
	        System.out.println(i+"---"+bestx[i]+"  ");
	    System.out.println();
	    System.out.println("所以部件的最小重量之和为："+bestw);
	    input.close();
	}
	
	public static void Backtrack(int t) {
	    int j;
	    if(t>n)//搜索到叶子结点，一个搜索结束，所有零件已经找完
	    {
	        bestw=cw;//当前最小重量
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
