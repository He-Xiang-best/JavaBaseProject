package ch08;

// ////////////////////////////////////////////////////////
// 
// J_PopupMenu.java
// 
// ////////////////////////////////////////////////////////
// 简介:
//     弹出式菜单例程。
// ////////////////////////////////////////////////////////

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.*;

public class J_PopupMenu extends JFrame
{
    private JPopupMenu m_popupMenu;

    public J_PopupMenu( )
    {
        super("弹出式菜单应用示例");
        m_popupMenu= new JPopupMenu( );

        JMenu [ ] m = { new JMenu("文件(F)"), new JMenu("编辑(E)") };
        char  [ ][ ] mC = {{'F', 'E'}, {'O', 'S'}, {'C', 'V'}};
        JMenuItem [ ] [ ] mI =
        {
            {new JMenuItem("打开(O)"), new JMenuItem("保存(S)")},
            {new JMenuItem("拷贝(C)"), new JMenuItem("粘帖(V)")}
        };
        int i, j;
        
        for (i=0; i < m.length; i++)
        {
            m_popupMenu.add(m[i]); // 添加下拉式菜单
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
                            JMenuItem mItem= (JMenuItem)e.getSource( );
                            System.out.println("运行菜单项: "
                                + mItem.getText( ));
                        } // 方法actionPerformed结束
                    } // 实现接口ActionListener的内部类结束
                ); // 方法addActionListener调用结束
            } // 内部for循环结束
        } // 外部for循环结束
        m[0].insertSeparator(1);

        addMouseListener( new MouseAdapter( )
            {
                public void mousePressed( MouseEvent e )
                {
                    if ( e.isPopupTrigger( ) ) 
                        m_popupMenu.show(e.getComponent( ),
                            e.getX( ), e.getY( ) );
                } // 方法mousePressed结束

                public void mouseReleased( MouseEvent e )
                {
                    mousePressed(e);
                } // 方法mouseReleased结束
            } // 父类型为类MouseAdapter的匿名内部类结束
        ); // 方法addMouseListener调用结束
    } // J_PopupMenu构造方法结束
    
    public static void main(String args[ ])
    {
        JFrame app = new J_PopupMenu( );

        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        app.setSize(250, 120);
        app.setVisible(true);
    } // 方法main结束
} // 类J_PopupMenu结束
