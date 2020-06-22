package ex13.selected;

/**
 * 
 * @author 04162130.������.
 * @ʱ�� 2017.05.27.
 * @��Ŀ  ʵ������3(ѡ��)
 * ����Swing���ʵ��һ�����ײ˵�(�����¼�����)
 * (���ײ˵�)
 */

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.*;
//import javax.swing.JMenuBar;

public class MenuTest extends JFrame{
	JLabel jl=new JLabel("555");
	public MenuTest(){		
		super("Menu Demo");
		setLayout(new FlowLayout());
		add(jl);//��ӱ�ǩ
		jl.setPreferredSize(new Dimension(200,100));
		JMenuBar mBar = new JMenuBar();//����˵�
		setJMenuBar(mBar);

		JMenu  m = new JMenu("��ʽ");//�����˵�
		//�˵���
		JMenuItem [] mi = {new JMenuItem("����"),new JMenuItem("����"),new JMenuItem("ɾ��")};
		
		mBar.add(m);
		
		for(int i = 0;i < mi.length;i++){
			m.add(mi[i]);
			mi[i].addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e){
					JMenuItem mItem = (JMenuItem)e.getSource();
					jl.setText("�˵�����:" + mItem.getText());
				}
			});
		}
	}
	
	public static void main(String args[]){
		JFrame a = new MenuTest();
		a.setSize(300,300);
		a.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		a.setVisible(true);
	}
}
