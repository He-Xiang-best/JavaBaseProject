package ex06;
/**
 * 
 * @content:ͳ���������1000������0~20�������ĸ������
 * @author:04191315_����
 * @��һ����ɵ�ʱ�䣺
 * @time:2020��5��21������5:09:12
 * @��һ���޸ĵ�ʱ�䣺
 * @time:2020��5��21������5:09:12
 * @�޸�ԭ�򣺿��ò��飬�޸����ݣ�
 */
public class P160_5 {
	public static void main(String[] args) {
		System.out.println("ͳ���������1000������0~20������������£�\n");
		generate();
	}
		public static void output(int b[]){
		//��ӡͳ������
		for (int i = 0; i < b.length; i++) {
			System.out.println("��������"+i+"�ĸ����ǣ�"+b[i]);
		}
		System.out.println();
		int count=0;
		//�ж�ͳ�����ݵĸ���֮���Ƿ�������������������ͬ����֤���������Ƿ�����
		for (int i = 0; i < b.length; i++) {
			count+=b[i];
		}
		System.out.println("ͳ�Ƶ���������֮��Ϊ��"+count);
	}

	public static void generate() {
		int a=0;
		//����һ�����������洢0~20�ĸ�����ֵ�����㴢��������������ıȽ���ȵ����ĸ���
		int[] b = new int[21];
		for (int i = 0; i < b.length; i++) {
			b[i]=0;
		}
		//����1000�������
		for(int i=0;i<1000;i++) {
		//д��1��a=((int)(Math.random()*1000))%21;
			a=(int)(Math.random()*20+0.5);
		//���������������0~20����ֵ������һ�Ƚ�	
			for(int j=0;j<b.length;j++) {
				if(a==j) {
					//�����0~20��ĳ����ֵ��ȣ����ż������ֵ��������������һ
					b[j]++;
				}
			}
		}
		output(b);
	}

}
