package ch03;

public class _15DynamicPoly {
	public static void main(String args[]) {
		_15MyShape ts = new _15MyShape();
		ts.draw();//����_15Shape��ĳ�Ա����draw()��ͼ	
		_15MyRect tr = new _15MyRect("mycube");
		tr.draw();//���þ��γ�Ա����draw()��ͼ 	
		_15MyCircle tc = new _15MyCircle();
		tc.draw();//����Բ�ĳ�Ա����draw()��ͼ
		//����_15MyShape����polytsʹ������_15MyCircle�Ĺ��췽����ʼ��
		ts = new _15MyCircle();
		ts.draw();//����Ķ�����������и��ǵķ���draw()��ͼ
	}

}
