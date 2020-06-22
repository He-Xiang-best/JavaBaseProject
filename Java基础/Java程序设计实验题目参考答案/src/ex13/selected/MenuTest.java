package ex13.selected;

/**
 * 
 * @author 04162130.王俊斌.
 * @时间 2017.05.27.
 * @项目  实验任务3(选做)
 * 利用Swing编程实现一个简易菜单(动作事件例程)
 * (简易菜单)
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
		add(jl);//添加标签
		jl.setPreferredSize(new Dimension(200,100));
		JMenuBar mBar = new JMenuBar();//常规菜单
		setJMenuBar(mBar);

		JMenu  m = new JMenu("格式");//下拉菜单
		//菜单项
		JMenuItem [] mi = {new JMenuItem("复制"),new JMenuItem("剪切"),new JMenuItem("删除")};
		
		mBar.add(m);
		
		for(int i = 0;i < mi.length;i++){
			m.add(mi[i]);
			mi[i].addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e){
					JMenuItem mItem = (JMenuItem)e.getSource();
					jl.setText("菜单名字:" + mItem.getText());
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
