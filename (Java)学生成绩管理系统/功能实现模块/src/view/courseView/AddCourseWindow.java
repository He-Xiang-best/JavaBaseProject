/*
 * Created by JFormDesigner on Tue Nov 17 18:46:13 CST 2020
 */

package view.courseView;

import classType.infoType.Course;
import sqlContact.CourseContact;
import util.StringUtil;

import javax.swing.*;
import java.awt.event.ActionEvent;

/*
 * @author:何翔
 * @date:2020/11/20 9:44
 * @description:课程添加窗口
 /*
 
 */

public class AddCourseWindow extends JFrame {
    public AddCourseWindow() {
        initComponents();
    }
    public void showAddCourseWindow(){
        this.setVisible(true);
    }

    private void yesActionPerformed(ActionEvent e) {
        String courseName = CourseNameTextField.getText().toString();
        String courseID = CourseIDTextField.getText().toString();
        if(StringUtil.isEmpty(courseName)||StringUtil.isEmpty(courseID)){
            JOptionPane.showMessageDialog(null, "填写信息不能有空!", "信息错误", JOptionPane.ERROR_MESSAGE);
            return;
        }
        Course co = new Course();
        co.setCourse_id(Integer.parseInt(courseID));
        co.setCourse_name(courseName);
        CourseContact courseContact = new CourseContact();
        if(courseContact.addCourse(co)){
            JOptionPane.showMessageDialog(null, "课程信息添加成功!", "添加成功", JOptionPane.INFORMATION_MESSAGE);
            resetActionPerformed(e);
        }else{
            JOptionPane.showMessageDialog(null, "课程信息添加失败!", "添加失败", JOptionPane.ERROR_MESSAGE);
        }
        courseContact.CloseCon();
    }


    private void resetActionPerformed(ActionEvent e) {
        CourseIDTextField.setText("");
        CourseNameTextField.setText("");
    }

    private void cancelActionPerformed(ActionEvent e) {
        this.dispose();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        panel1 = new JPanel();
        label1 = new JLabel();
        label2 = new JLabel();
        CourseIDTextField = new JTextField();
        CourseNameTextField = new JTextField();
        button1 = new JButton();
        button2 = new JButton();
        button3 = new JButton();

        //======== this ========
        setTitle("\u8bfe\u7a0b\u6dfb\u52a0");
        var contentPane = getContentPane();

        //======== panel1 ========
        {

            //---- label1 ----
            label1.setText("\u8bfe\u7a0b\u540d\u79f0\uff1a");
            label1.setFont(label1.getFont().deriveFont(label1.getFont().getSize() + 5f));

            //---- label2 ----
            label2.setText("\u8bfe\u7a0bID\uff1a");
            label2.setFont(label2.getFont().deriveFont(label2.getFont().getSize() + 5f));

            //---- button1 ----
            button1.setText("\u786e\u8ba4");
            button1.addActionListener(e -> yesActionPerformed(e));

            //---- button2 ----
            button2.setText("\u91cd\u7f6e");
            button2.addActionListener(e -> resetActionPerformed(e));

            //---- button3 ----
            button3.setText("\u53d6\u6d88");
            button3.addActionListener(e -> cancelActionPerformed(e));

            GroupLayout panel1Layout = new GroupLayout(panel1);
            panel1.setLayout(panel1Layout);
            panel1Layout.setHorizontalGroup(
                panel1Layout.createParallelGroup()
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(panel1Layout.createParallelGroup()
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                    .addComponent(label1, GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE)
                                    .addComponent(label2, GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                    .addComponent(CourseIDTextField, GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE)
                                    .addComponent(CourseNameTextField, GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE)))
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addComponent(button1)
                                .addGap(53, 53, 53)
                                .addComponent(button2)
                                .addGap(48, 48, 48)
                                .addComponent(button3)))
                        .addContainerGap(47, Short.MAX_VALUE))
            );
            panel1Layout.setVerticalGroup(
                panel1Layout.createParallelGroup()
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(label2, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
                            .addComponent(CourseIDTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(label1, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
                            .addComponent(CourseNameTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34)
                        .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(button1)
                            .addComponent(button3)
                            .addComponent(button2))
                        .addContainerGap(42, Short.MAX_VALUE))
            );
        }

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .addComponent(panel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addComponent(panel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 4, Short.MAX_VALUE))
        );
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    private JPanel panel1;
    private JLabel label1;
    private JLabel label2;
    private JTextField CourseIDTextField;
    private JTextField CourseNameTextField;
    private JButton button1;
    private JButton button2;
    private JButton button3;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
