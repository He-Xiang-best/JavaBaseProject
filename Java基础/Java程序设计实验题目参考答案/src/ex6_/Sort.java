package ex6_;
/**
 * 实验六第一题
 * 按升序顺序输出一维数组中的元素
 * @author 郭晓燕
 * 2018.3.16
 * @since jdk1.6
 *
 */
public class Sort{
	public static void sortUp(int a[]){
		int k,temp;
		int len=a.length;
		for(int i=0;i<len-1;i++){
			k=i;
			for(int j=i+1;j<len;j++){
				if(a[k]>a[j])
					k=j;
			}
			temp=a[k];
			a[k]=a[i];
			a[i]=temp;
		}
	}
	
	public static void printA(int a[]){
		for(int i=0;i<a.length;i++)
			System.out.print(a[i]+" ");
		
	}
	
	public static void main(String args[]){
		int a[]={6,8,1,3,2,5,9,7,0,4};
		Sort.sortUp(a);
		Sort.printA(a);
		
	}
}

