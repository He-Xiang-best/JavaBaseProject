package ex08;
/**
 * 
 * @content:�κ�ϰ��P177_4:ö�����2008��ÿ���µ���������֪���꣩
 * @author:04191315_����
 * @��һ����ɵ�ʱ�䣺
 * @time:2020��5��27������8:33:14
 * @��һ���޸ĵ�ʱ�䣺
 * @time:2020��5��27������8:33:14
 * @�޸�ԭ�򣺿��ò��飬�޸����ݣ�
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
				System.out.println(m[i]+"������Ϊ31��");
				break;
			case February:
				System.out.println(m[i]+"������Ϊ29��");
			default:
				System.out.println(m[i]+"������Ϊ30��");
				break;
			}
		}
	}

}
enum month{
	January, February, March, April, May, June, July, August, September, October, November, December
};

