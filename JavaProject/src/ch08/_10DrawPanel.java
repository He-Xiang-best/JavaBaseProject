package ch08;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

import javax.swing.JPanel;

public class _10DrawPanel extends JPanel{
	//���û�ͼ�������
	protected int pre_x,pre_y,x,y;
	//���û�ͼ���
	JPanel jp=new JPanel();
  public _10DrawPanel()
	{   //�����������������Ϊ��λ���֣���ӻ�ͼ���
		this.setLayout(new BorderLayout());
		this.add(jp,BorderLayout.CENTER);
		//���û�ͼ���������¼�����������һ��
		this.addMouseListener(new myMouseListener());
		//���û�ͼ���������ƶ�����������һ��
		this.addMouseMotionListener(new myMouseMotionListener());
		//���û�ͼ�ռ�
		this.setPreferredSize(new Dimension(300,300));	

}
	//��������¼��������ڲ��࣬�̳������������
	private class myMouseListener extends MouseAdapter
	{
		public void mousePressed(MouseEvent e)
		{//��������������û�����ʼ������
			pre_x=e.getX();
			pre_y=e.getY();
		}
	}
	//��������ƶ��¼��������ڲ��࣬�̳�����ƶ���������
	private class myMouseMotionListener extends MouseMotionAdapter //implements MouseMotionListener
	{
		public void mouseDragged(MouseEvent e)
		{   //���û��ʻ滭ֱ�ߵ��յ�����
			 x=e.getX();
			 y=e.getY();
			//��һ����
			Graphics g=jp.getGraphics();
			g.drawLine(pre_x,pre_y,x,y);
			//����ǰ���ʵ��յ���������Ϊ�µ���ʼ�����꣬���������滭��
			pre_x=x;
			pre_y=y;	
		}	
	}
}

