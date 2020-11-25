/*
 * Created by JFormDesigner on Tue Nov 03 14:43:55 CST 2020
 */

package view.classView;

import classType.infoType.ClassInfo;
import sqlContact.ClassContact;
import util.StringUtil;

import javax.swing.*;
import java.awt.event.ActionEvent;

/*
 * @author:何翔
 * @date:2020/11/20 9:43
 * @description:班级添加窗口
 /*

 */

public class AddClassWindow {
    public AddClassWindow() {
        initComponents();
    }
    public void showAddClassWindow(){
        addClassFrm.setVisible(true);
    }

    private void button1ActionPerformed(ActionEvent e) {
        /*
         * @author: 何翔
         * @param: [e]
         * @return: void
         * @date: 2020/11/20 9:39
         * @description：添加班级信息
         */
        String className = classNametextField1.getText().toString();
        String classNum = classInfotextArea1.getText().toString();
        String classID = ClassIDtextField1.getText().toString();
        if(StringUtil.isEmpty(className)||StringUtil.isEmpty(classNum)||StringUtil.isEmpty(classID)){
            JOptionPane.showMessageDialog(null, "填写信息不能有空!", "信息错误", JOptionPane.ERROR_MESSAGE);
            return;
        }
        ClassInfo scl = new ClassInfo();
        scl.setId(Integer.parseInt(classID));
        scl.setName(className);
        scl.setInfo(classNum);
        ClassContact classContact = new ClassContact();
        if(classContact.addClass(scl)){
            JOptionPane.showMessageDialog(null, "班级信息添加成功!", "添加成功", JOptionPane.INFORMATION_MESSAGE);
            button2ActionPerformed(null);
        }else{
            JOptionPane.showMessageDialog(null, "班级信息添加失败!", "添加失败", JOptionPane.ERROR_MESSAGE);
        }
        classContact.CloseCon();
    }

    private void button2ActionPerformed(ActionEvent e) {
        /*
         * @author: 重置添加栏目的班级信息
         * @param: [e]
         * @return: void
         * @date: 2020/11/20 9:39
         * @description：
         */
        classNametextField1.setText("");
        classInfotextArea1.setText("");
        ClassIDtextField1.setText("");
    }

    private void button3ActionPerformed(ActionEvent e) {
        /*
         * @author: 何翔
         * @param: [e]
         * @return: void
         * @date: 2020/11/20 9:39
         * @description：取消按钮事件，释放资源并返回
         */
        addClassFrm.dispose();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        addClassFrm = new JFrame();
        panel1 = new JPanel();
        className = new JLabel();
        classInfo = new JLabel();
        classNametextField1 = new JTextField();
        scrollPane1 = new JScrollPane();
        classInfotextArea1 = new JTextArea();
        button1 = new JButton();
        button2 = new JButton();
        button3 = new JButton();
        className2 = new JLabel();
        ClassIDtextField1 = new JTextField();

        //======== addClassFrm ========
        {
            addClassFrm.setTitle("\u73ed\u7ea7\u4fe1\u606f\u6dfb\u52a0");
            var addClassFrmContentPane = addClassFrm.getContentPane();

            //======== panel1 ========
            {

                //---- className ----
                className.setText("\u73ed\u7ea7\u540d\u79f0\uff1a");
                className.setFont(className.getFont().deriveFont(className.getFont().getSize() + 10f));
                className.setIcon(new ImageIcon(getClass().getResource("/image/ClassView/\u73ed\u7ea7\u4fe1\u606f.png")));

                //---- classInfo ----
                classInfo.setText("\u6240\u5c5e\u5b66\u9662\uff1a");
                classInfo.setFont(classInfo.getFont().deriveFont(classInfo.getFont().getSize() + 10f));
                classInfo.setIcon(new ImageIcon(getClass().getResource("/image/ClassView/\u73ed\u7ea7\u7ba1\u7406.png")));

                //======== scrollPane1 ========
                {
                    scrollPane1.setViewportView(classInfotextArea1);
                }

                //---- button1 ----
                button1.setText("\u786e\u8ba4\u6dfb\u52a0");
                button1.setIcon(new ImageIcon(getClass().getResource("/image/MainView/Class_manage/\u589e\u52a0.png")));
                button1.addActionListener(e -> button1ActionPerformed(e));

                //---- button2 ----
                button2.setText("\u91cd\u7f6e\u6570\u636e");
                button2.setIcon(new ImageIcon(getClass().getResource("/image/EditPasswordView/\u91cd\u7f6e.png")));
                button2.addActionListener(e -> button2ActionPerformed(e));

                //---- button3 ----
                button3.setText("\u53d6\u6d88\u6dfb\u52a0");
                button3.setIcon(new ImageIcon(getClass().getResource("/image/EditPasswordView/\u53d6\u6d88.png")));
                button3.addActionListener(e -> button3ActionPerformed(e));

                //---- className2 ----
                className2.setText("\u73ed\u7ea7\u7f16\u53f7\uff1a");
                className2.setFont(className2.getFont().deriveFont(className2.getFont().getSize() + 10f));
                className2.setIcon(new ImageIcon(getClass().getResource("/image/ClassView/\u73ed\u7ea7\u4fe1\u606f.png")));

                GroupLayout panel1Layout = new GroupLayout(panel1);
                panel1.setLayout(panel1Layout);
                panel1Layout.setHorizontalGroup(
                    panel1Layout.createParallelGroup()
                        .addGroup(panel1Layout.createSequentialGroup()
                            .addGroup(panel1Layout.createParallelGroup()
                                .addGroup(panel1Layout.createSequentialGroup()
                                    .addGap(48, 48, 48)
                                    .addGroup(panel1Layout.createParallelGroup()
                                        .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                            .addGroup(panel1Layout.createSequentialGroup()
                                                .addComponent(className2)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(ClassIDtextField1))
                                            .addGroup(panel1Layout.createSequentialGroup()
                                                .addComponent(className)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(classNametextField1))
                                            .addGroup(panel1Layout.createSequentialGroup()
                                                .addComponent(classInfo)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(scrollPane1, GroupLayout.PREFERRED_SIZE, 260, GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(panel1Layout.createSequentialGroup()
                                            .addGap(137, 137, 137)
                                            .addComponent(button2)
                                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                                            .addComponent(button3))))
                                .addGroup(panel1Layout.createSequentialGroup()
                                    .addGap(21, 21, 21)
                                    .addComponent(button1)))
                            .addGap(47, 47, 47))
                );
                panel1Layout.setVerticalGroup(
                    panel1Layout.createParallelGroup()
                        .addGroup(panel1Layout.createSequentialGroup()
                            .addGap(21, 21, 21)
                            .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(className2, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE)
                                .addComponent(ClassIDtextField1, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                            .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                .addComponent(className, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE)
                                .addComponent(classNametextField1, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE))
                            .addGap(44, 44, 44)
                            .addGroup(panel1Layout.createParallelGroup()
                                .addComponent(classInfo, GroupLayout.Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE)
                                .addComponent(scrollPane1, GroupLayout.Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE))
                            .addGap(26, 26, 26)
                            .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(button1, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
                                .addComponent(button2, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
                                .addComponent(button3, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE))
                            .addGap(20, 20, 20))
                );
            }

            GroupLayout addClassFrmContentPaneLayout = new GroupLayout(addClassFrmContentPane);
            addClassFrmContentPane.setLayout(addClassFrmContentPaneLayout);
            addClassFrmContentPaneLayout.setHorizontalGroup(
                addClassFrmContentPaneLayout.createParallelGroup()
                    .addComponent(panel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            );
            addClassFrmContentPaneLayout.setVerticalGroup(
                addClassFrmContentPaneLayout.createParallelGroup()
                    .addComponent(panel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            );
            addClassFrm.pack();
            addClassFrm.setLocationRelativeTo(addClassFrm.getOwner());
        }
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    private JFrame addClassFrm;
    private JPanel panel1;
    private JLabel className;
    private JLabel classInfo;
    private JTextField classNametextField1;
    private JScrollPane scrollPane1;
    private JTextArea classInfotextArea1;
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JLabel className2;
    private JTextField ClassIDtextField1;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
