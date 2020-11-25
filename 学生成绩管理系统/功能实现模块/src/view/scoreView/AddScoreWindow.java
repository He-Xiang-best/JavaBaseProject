/*
 * Created by JFormDesigner on Wed Nov 18 00:02:12 CST 2020
 */

package view.scoreView;

import classType.infoType.ClassInfo;
import classType.infoType.Course;
import classType.infoType.Score;
import sqlContact.ClassContact;
import sqlContact.CourseContact;
import sqlContact.ScoreContact;
import sqlContact.StudentContact;
import util.StringUtil;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.util.List;

/*
 * @author:何翔
 * @date:2020/11/20 9:54
 * @description:添加成绩窗口
 /*
 
 */

public class AddScoreWindow extends JFrame {
    public AddScoreWindow() {
        initComponents();
        setClassIDCombox();
        setCourseNameCombox();
    }
    public void showAddScoreWindow(){
        this.setVisible(true);
    }

    private void setCourseNameCombox() {
        /*
         * @author: 何翔
         * @param: []
         * @return: void
         * @date: 2020/11/20 9:54
         * @description：提供可选已存在的课程
         */
        CourseContact courseContact = new CourseContact();
        List<Course> courseList = courseContact.getCourseList(new Course());
        for (Course co : courseList) {
            courseNameConboBox.addItem(co.getCourse_name());
        }
        courseContact.CloseCon();
    }


    private void setClassIDCombox() {
        /*
         * @author: 何翔
         * @param: []
         * @return: void
         * @date: 2020/11/20 9:55
         * @description：提供可选已存在的班级
         */
        ClassContact classContact = new ClassContact();
        List<ClassInfo> classList = classContact.getClassList(new ClassInfo());
        for (ClassInfo cl : classList) {
            classIDcomboBox.addItem(cl.getId());
        }
        classContact.CloseCon();
    }

    private void resetActionPerformed(ActionEvent e) {
        /*
         * @author: 何翔
         * @param: [e]
         * @return: void
         * @date: 2020/11/20 9:55
         * @description：重置文本栏信息
         */
        stu_id_textField.setText("");
        stu_name_textField.setText("");
        stu_score_textField.setText("");
    }

    private void cancelActionPerformed(ActionEvent e) {
        this.dispose();
    }

    private void yesActionPerformed(ActionEvent e) {
        /*
         * @author: 何翔
         * @param: [e]
         * @return: void
         * @date: 2020/11/20 9:55
         * @description：确认添加课程
         */
        String stu_name = stu_name_textField.getText().toString();
        String stu_ID = stu_id_textField.getText().toString();
        String stu_grade = stu_score_textField.getText().toString();
        String stu_class =String.valueOf(classIDcomboBox.getSelectedItem());
        String stu_course = String.valueOf(courseNameConboBox.getSelectedItem());
        if(StringUtil.isEmpty(stu_grade)||StringUtil.isEmpty(stu_ID)||StringUtil.isEmpty(stu_name)){
            JOptionPane.showMessageDialog(null, "填写信息不能有空!", "信息错误", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if(StringUtil.isEmpty(stu_class)||StringUtil.isEmpty(stu_course)){
            JOptionPane.showMessageDialog(null, "当前无班级或课程!", "添加失败", JOptionPane.ERROR_MESSAGE);
            return;
        }
        Score sc = new Score();
        sc.setStu_id(Integer.parseInt(stu_ID));
        sc.setCourse_name(stu_course);
        sc.setClass_id(Integer.parseInt(stu_class));
        sc.setStu_name(stu_name);
        if (Float.parseFloat(stu_grade)<0){
            JOptionPane.showMessageDialog(this, "成绩范围录入错误！");
            return;
        }
        if (!new StudentContact().isExistStudent(Integer.parseInt(stu_class),Integer.parseInt(stu_ID),stu_name)) {
            JOptionPane.showMessageDialog(null, "此学生不存在！成绩录入失败!", "添加失败", JOptionPane.ERROR_MESSAGE);
        return;
        }
        sc.setGrade(Float.parseFloat(stu_grade));
        ScoreContact scoreContact = new ScoreContact();
        if(scoreContact.addScore(sc)){
            JOptionPane.showMessageDialog(null, "成绩录入成功!", "添加成功", JOptionPane.INFORMATION_MESSAGE);
            resetActionPerformed(e);
        }else{

            JOptionPane.showMessageDialog(null, "此学生不存在！成绩录入失败!", "添加失败", JOptionPane.ERROR_MESSAGE);
        }
        scoreContact.CloseCon();
    }



    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        panel1 = new JPanel();
        label1 = new JLabel();
        label2 = new JLabel();
        label3 = new JLabel();
        label4 = new JLabel();
        label5 = new JLabel();
        stu_name_textField = new JTextField();
        stu_id_textField = new JTextField();
        stu_score_textField = new JTextField();
        classIDcomboBox = new JComboBox();
        courseNameConboBox = new JComboBox();
        button1 = new JButton();
        button2 = new JButton();
        button3 = new JButton();

        //======== this ========
        setTitle("\u6210\u7ee9\u6dfb\u52a0");
        var contentPane = getContentPane();

        //======== panel1 ========
        {

            //---- label1 ----
            label1.setText("\u5b66\u751f\u59d3\u540d\uff1a");
            label1.setFont(label1.getFont().deriveFont(label1.getFont().getSize() + 5f));

            //---- label2 ----
            label2.setText("\u5b66\u751f\u5b66\u53f7\uff1a");
            label2.setFont(label2.getFont().deriveFont(label2.getFont().getSize() + 5f));

            //---- label3 ----
            label3.setText("\u73ed\u7ea7\u7f16\u53f7\uff1a");
            label3.setFont(label3.getFont().deriveFont(label3.getFont().getSize() + 5f));

            //---- label4 ----
            label4.setText("\u79d1\u76ee\uff1a");
            label4.setFont(label4.getFont().deriveFont(label4.getFont().getSize() + 5f));

            //---- label5 ----
            label5.setText("\u6210\u7ee9\uff1a");
            label5.setFont(label5.getFont().deriveFont(label5.getFont().getSize() + 5f));

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
                        .addGap(72, 72, 72)
                        .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addComponent(label1, GroupLayout.PREFERRED_SIZE, 95, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(stu_name_textField))
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addComponent(label2, GroupLayout.PREFERRED_SIZE, 95, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(stu_id_textField))
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addComponent(label3, GroupLayout.PREFERRED_SIZE, 95, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(classIDcomboBox))
                            .addGroup(GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                                .addComponent(label4, GroupLayout.PREFERRED_SIZE, 95, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(courseNameConboBox))
                            .addGroup(GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                                .addGroup(panel1Layout.createParallelGroup()
                                    .addComponent(label5, GroupLayout.PREFERRED_SIZE, 95, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(button1))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(panel1Layout.createParallelGroup()
                                    .addComponent(stu_score_textField)
                                    .addGroup(panel1Layout.createSequentialGroup()
                                        .addGap(25, 25, 25)
                                        .addComponent(button2)
                                        .addGap(62, 62, 62)
                                        .addComponent(button3)))))
                        .addGap(149, 149, 149))
            );
            panel1Layout.setVerticalGroup(
                panel1Layout.createParallelGroup()
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(label1, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
                            .addComponent(stu_name_textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(label2, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
                            .addComponent(stu_id_textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(label3, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
                            .addComponent(classIDcomboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(label4, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
                            .addComponent(courseNameConboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(label5, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
                            .addComponent(stu_score_textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                        .addGap(40, 40, 40)
                        .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(button1)
                            .addComponent(button2)
                            .addComponent(button3))
                        .addContainerGap(44, Short.MAX_VALUE))
            );
        }

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addComponent(panel1, GroupLayout.PREFERRED_SIZE, 523, GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE))
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addComponent(panel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    private JPanel panel1;
    private JLabel label1;
    private JLabel label2;
    private JLabel label3;
    private JLabel label4;
    private JLabel label5;
    private JTextField stu_name_textField;
    private JTextField stu_id_textField;
    private JTextField stu_score_textField;
    private JComboBox classIDcomboBox;
    private JComboBox courseNameConboBox;
    private JButton button1;
    private JButton button2;
    private JButton button3;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
