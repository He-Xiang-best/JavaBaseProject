/*
 * Created by JFormDesigner on Thu Nov 12 08:30:24 CST 2020
 */

package view.studentView;

import classType.infoType.ClassInfo;
import classType.infoType.Student;
import sqlContact.ClassContact;
import sqlContact.StudentContact;
import util.StringUtil;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.util.List;

/*
 * @author:何翔
 * @date:2020/11/20 10:00
 * @description:学生信息添加窗口
 /*

 */

public class AddStudentWindow {
    public AddStudentWindow() {
        initComponents();
setClassIDCombox();
    }
    private void setClassIDCombox() {
        /*
         * @author: 何翔
         * @param: []
         * @return: void
         * @date: 2020/11/20 10:01
         * @description：提供可选已存在的班级
         */
        ClassContact classContact = new ClassContact();
        List<ClassInfo> classList = classContact.getClassList(new ClassInfo());
        for (ClassInfo cl : classList) {
            classIDcomboBox.addItem(cl.getId());
        }
        classContact.CloseCon();
    }
    public void showAddStudentStudentWindow(){
        addStudentFrm.setVisible(true);
    }

    private void reset_buttonActionPerformed(ActionEvent e) {
        /*
         * @author: 何翔
         * @param: [e]
         * @return: void
         * @date: 2020/11/20 10:01
         * @description：重置文本栏信息
         */
//      getclass_id_textField.setText("");
        getstu_id_textField.setText("");
        getstu_name_textField.setText("");
    }

    private void no_buttonActionPerformed(ActionEvent e) {
        addStudentFrm.dispose();
    }

    private void yes_buttonActionPerformed(ActionEvent e) {
        /*
         * @author: 何翔
         * @param: [e]
         * @return: void
         * @date: 2020/11/20 10:01
         * @description：添加学生信息
         */
        String studentName = getstu_name_textField.getText().toString();
        String studentID = getstu_id_textField.getText().toString();
//      String classID = getclass_id_textField.getText().toString();
        String classID = String.valueOf(classIDcomboBox.getSelectedItem());
        if(StringUtil.isEmpty(classID)){
            JOptionPane.showMessageDialog(addStudentFrm, "当前无班级！无法添加学生!");
            return;
        }
        if(StringUtil.isEmpty(studentID)){
            JOptionPane.showMessageDialog(addStudentFrm, "请填写学生学号!");
            return;
        }
        if(StringUtil.isEmpty(studentName)){
            JOptionPane.showMessageDialog(addStudentFrm, "请填写学生姓名!");
            return;
        }
        Student student = new Student();
        student.setName(studentName);
        student.setClass_id(Integer.parseInt(classID));
        student.setStu_id(Integer.parseInt(studentID));
        StudentContact studentContact = new StudentContact();
        if(studentContact.addStudent(student)){
            JOptionPane.showMessageDialog(addStudentFrm, "添加成功!");
        }else{
            JOptionPane.showMessageDialog(addStudentFrm, "添加失败!");
        }
        reset_buttonActionPerformed(e);
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        addStudentFrm = new JFrame();
        panel1 = new JPanel();
        label1 = new JLabel();
        label2 = new JLabel();
        label3 = new JLabel();
        getstu_id_textField = new JTextField();
        getstu_name_textField = new JTextField();
        yes_button = new JButton();
        reset_button = new JButton();
        no_button = new JButton();
        classIDcomboBox = new JComboBox();

        //======== addStudentFrm ========
        {
            addStudentFrm.setTitle("\u5b66\u751f\u4fe1\u606f\u6dfb\u52a0");
            var addStudentFrmContentPane = addStudentFrm.getContentPane();

            //======== panel1 ========
            {

                //---- label1 ----
                label1.setText("\u5b66\u751f\u5b66\u53f7\uff1a");
                label1.setFont(label1.getFont().deriveFont(label1.getFont().getSize() + 10f));

                //---- label2 ----
                label2.setText("\u5b66\u751f\u59d3\u540d\uff1a");
                label2.setFont(label2.getFont().deriveFont(label2.getFont().getSize() + 10f));

                //---- label3 ----
                label3.setText("\u73ed\u7ea7\u7f16\u53f7\uff1a");
                label3.setFont(label3.getFont().deriveFont(label3.getFont().getSize() + 10f));

                //---- yes_button ----
                yes_button.setText("\u786e\u8ba4\u6dfb\u52a0");
                yes_button.addActionListener(e -> yes_buttonActionPerformed(e));

                //---- reset_button ----
                reset_button.setText("\u91cd\u7f6e\u4fe1\u606f");
                reset_button.addActionListener(e -> reset_buttonActionPerformed(e));

                //---- no_button ----
                no_button.setText("\u53d6\u6d88\u6dfb\u52a0");
                no_button.addActionListener(e -> no_buttonActionPerformed(e));

                GroupLayout panel1Layout = new GroupLayout(panel1);
                panel1.setLayout(panel1Layout);
                panel1Layout.setHorizontalGroup(
                    panel1Layout.createParallelGroup()
                        .addGroup(panel1Layout.createSequentialGroup()
                            .addGap(41, 41, 41)
                            .addGroup(panel1Layout.createParallelGroup()
                                .addGroup(panel1Layout.createSequentialGroup()
                                    .addComponent(label2, GroupLayout.PREFERRED_SIZE, 119, GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(getstu_name_textField, GroupLayout.PREFERRED_SIZE, 254, GroupLayout.PREFERRED_SIZE))
                                .addGroup(panel1Layout.createSequentialGroup()
                                    .addComponent(label1, GroupLayout.PREFERRED_SIZE, 119, GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(getstu_id_textField, GroupLayout.PREFERRED_SIZE, 254, GroupLayout.PREFERRED_SIZE))
                                .addGroup(panel1Layout.createSequentialGroup()
                                    .addGroup(panel1Layout.createParallelGroup()
                                        .addComponent(label3, GroupLayout.PREFERRED_SIZE, 119, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(yes_button, GroupLayout.PREFERRED_SIZE, 111, GroupLayout.PREFERRED_SIZE))
                                    .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                        .addGroup(panel1Layout.createSequentialGroup()
                                            .addGap(35, 35, 35)
                                            .addComponent(reset_button, GroupLayout.PREFERRED_SIZE, 111, GroupLayout.PREFERRED_SIZE)
                                            .addGap(40, 40, 40)
                                            .addComponent(no_button, GroupLayout.PREFERRED_SIZE, 111, GroupLayout.PREFERRED_SIZE))
                                        .addGroup(panel1Layout.createSequentialGroup()
                                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(classIDcomboBox)
                                            .addGap(37, 37, 37)))))
                            .addContainerGap(70, Short.MAX_VALUE))
                );
                panel1Layout.setVerticalGroup(
                    panel1Layout.createParallelGroup()
                        .addGroup(panel1Layout.createSequentialGroup()
                            .addGap(44, 44, 44)
                            .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(label1, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
                                .addComponent(getstu_id_textField, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE))
                            .addGap(57, 57, 57)
                            .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(label2, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
                                .addComponent(getstu_name_textField, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE))
                            .addGap(61, 61, 61)
                            .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(label3, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
                                .addComponent(classIDcomboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                            .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(yes_button, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
                                .addComponent(no_button, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
                                .addComponent(reset_button, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE))
                            .addGap(19, 19, 19))
                );
            }

            GroupLayout addStudentFrmContentPaneLayout = new GroupLayout(addStudentFrmContentPane);
            addStudentFrmContentPane.setLayout(addStudentFrmContentPaneLayout);
            addStudentFrmContentPaneLayout.setHorizontalGroup(
                addStudentFrmContentPaneLayout.createParallelGroup()
                    .addGroup(addStudentFrmContentPaneLayout.createSequentialGroup()
                        .addComponent(panel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 1, Short.MAX_VALUE))
            );
            addStudentFrmContentPaneLayout.setVerticalGroup(
                addStudentFrmContentPaneLayout.createParallelGroup()
                    .addComponent(panel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            );
            addStudentFrm.pack();
            addStudentFrm.setLocationRelativeTo(addStudentFrm.getOwner());
        }
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    private JFrame addStudentFrm;
    private JPanel panel1;
    private JLabel label1;
    private JLabel label2;
    private JLabel label3;
    private JTextField getstu_id_textField;
    private JTextField getstu_name_textField;
    private JButton yes_button;
    private JButton reset_button;
    private JButton no_button;
    private JComboBox classIDcomboBox;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
