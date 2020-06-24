package ex08;
/**
 * 
 * @content:课后习题P177_4:枚举输出2008年每个月的天数（已知闰年）
 * @author:04191315_何翔
 * @第一次完成的时间：
 * @time:2020年5月27日下午8:33:14
 * @第一次修改的时间：
 * @time:2020年5月27日下午8:33:14
 * @修改原因：课堂测验，修改内容：
 */
public class P177_4 {

	public static void main(String[] args) {
		month[] m =month.values();
        for (int i = 0; i < m.length; i++) {
			switch (m[i]) {
			case January:
			case March:
			case May:
			case July:
			case August:
			case October:
			case December:			
				System.out.println(m[i]+"的天数为31天");
				break;
			case February:
				System.out.println(m[i]+"的天数为29天");
			default:
				System.out.println(m[i]+"的天数为30天");
				break;
			}
		}
	}

}
enum month{
	January, February, March, April, May, June, July, August, September, October, November, December
};

