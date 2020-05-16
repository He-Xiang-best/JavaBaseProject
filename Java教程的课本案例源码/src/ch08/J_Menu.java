package ch08;

// ////////////////////////////////////////////////////////
// 
// J_Menu.java
// 
// ////////////////////////////////////////////////////////
// 简介:
//     常规菜单例程。
// ////////////////////////////////////////////////////////

import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class J_Menu extends JFrame
{
	JLabel label;
    public J_Menu( )
    {
        super("常规菜单应用示例");
        Container c=this.getContentPane();
        c.setLayout(new FlowLayout());
        label=new JLabel("我是菜单实验");
        c.add(label);
        label.setPreferredSize(new Dimension(200,100));
        //label.setFont(new Font());
        JMenuBar mBar = new JMenuBar( );
        setJMenuBar(mBar); // 设置菜单栏

        JMenu [ ] m = { new JMenu("文件(F)"), new JMenu("编辑(E)") };
        char  [ ][ ] mC = {{'B', 'E'}, {'O', 'S'}, {'C', 'V'}};
        JMenuItem [ ] [ ] mI =
        {
            {new JMenuItem("打开(O)"), new JMenuItem("保存(S)")},
            {new JMenuItem("拷贝(C)"), new JMenuItem("粘帖(V)")}
        };
        int i, j;
        
        for (i=0; i < m.length; i++)
        {
            mBar.add(m[i]); // 添加下拉式菜单
            m[i].setMnemonic(mC[0][i]); // 设置助记符
            for (j=0; j < mI[i].length; j++)
            {
                m[i].add(mI[i][j]); // 添加命令式菜单项
                mI[i][j].setMnemonic(mC[i+1][j]); // 设置助记符
                mI[i][j].setAccelerator( // 设置快捷键
                    KeyStroke.getKeyStroke("ctrl " + mC[i+1][j]));
                mI[i][j].addActionListener( new ActionListener( )
                    {
                        public void actionPerformed(ActionEvent e)
                        {
                            JMenuItem mItem = (JMenuItem)e.getSource( );
                            System.out.println("运行菜单项: "
                                + mItem.getText( ));
                            label.setText("运行菜单项: "
                                    + mItem.getText( ));
                        } // 方法actionPerformed结束
                    } // 实现接口ActionListener的内部类结束
                ); // 方法addActionListener调用结束
            } // 内部for循环结束
        } // 外部for循环结束
        m[0].insertSeparator(1); 
    } // J_Menu构造方法结束
    
    public static void main(String args[ ])
    {
        JFrame app = new J_Menu( );

        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        app.setSize(400,400);
        app.setVisible(true);
    } // 方法main结束
} // 类J_Menu结束
