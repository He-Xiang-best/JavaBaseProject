package ex06;
/**
 * 
 * @content:统计随机生成1000个数是0~20的整数的个数结果
 * @author:04191315_何翔
 * @第一次完成的时间：
 * @time:2020年5月21日下午5:09:12
 * @第一次修改的时间：
 * @time:2020年5月21日下午5:09:12
 * @修改原因：课堂测验，修改内容：
 */
public class P160_5 {
	public static void main(String[] args) {
		System.out.println("统计随机生成1000个数是0~20的整数结果如下：\n");
		generate();
	}
		public static void output(int b[]){
		//打印统计数据
		for (int i = 0; i < b.length; i++) {
			System.out.println("生成整数"+i+"的个数是："+b[i]);
		}
		System.out.println();
		int count=0;
		//判断统计数据的个数之和是否与产生的随机数个数相同，验证程序数据是否有误
		for (int i = 0; i < b.length; i++) {
			count+=b[i];
		}
		System.out.println("统计的整数个数之和为："+count);
	}

	public static void generate() {
		int a=0;
		//定义一个数组用来存储0~20的个数数值，方便储存与随机生成数的比较相等的数的个数
		int[] b = new int[21];
		for (int i = 0; i < b.length; i++) {
			b[i]=0;
		}
		//生成1000个随机数
		for(int i=0;i<1000;i++) {
		//写法1：a=((int)(Math.random()*1000))%21;
			a=(int)(Math.random()*20+0.5);
		//将产生的随机数与0~20的数值进行逐一比较	
			for(int j=0;j<b.length;j++) {
				if(a==j) {
					//如果与0~20的某个数值相等，则存放计算此数值个数的数组数加一
					b[j]++;
				}
			}
		}
		output(b);
	}

}
