package ch03;



public class _14TransType {
	public static void main(String[] args) {
		//��1����ʽ����ת��
		_12Student studentLi=new _12Student();
		_12Person Lisi=studentLi;
		System.out.println("���ĵ�������"+Lisi.getAge());
		//ע��ת��
		System.out.println("���ĵ�������"+((_12Person)studentLi).getAge());
		//��2����ʽ����ת��
	_12Student s_Li=new _12Student();
		_12Person Li=s_Li;
		_12Person laoLi=(_12Student)Li;
		System.out.println("����̵�������"+laoLi.getName());
		//ע��ת��
		_12Person liu=new _12Person("����","Ů",30);
	// _12Student xiaoLiu=(_12Student)liu;
	 //System.out.println("������������"+xiaoLiu.getAge());		
		
//��3��instanceof���÷�
		//��ͬ���Ͳ���ֱ��ת��
//		_12Student xiaoLi=new _12Student();
//		System.out.println((_12Student)xiaoLi);
		//����instanceof���ж����ñ��ʽ��ָ���ʵ�������Ƿ���Ŀ��ʵ������
		_12Student wang;
		if(liu instanceof _12Student)
		{
			wang=(_12Student)liu;
		}
		else
			{wang=new _12Student("����","��",50,"2512","c���Գ������");}
			System.out.println("ѧ��������Ϊ"+wang.getName());
			}

}
