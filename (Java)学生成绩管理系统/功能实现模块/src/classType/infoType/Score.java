package classType.infoType;
/*
 * @author:何翔
 * @date:2020/11/20 8:54
 * @description:课程成绩类信息
 /*
 
 */

public class Score {
    private int stu_id;
    private int class_id;
    private String course_name;
    private float grade;
    private String stu_name;
    
    public String getCourse_name() { return course_name; }
    
    public void setCourse_name(String course_name) {
        this.course_name = course_name;
    }

    public String getStu_name() {
        return stu_name;
    }

    public void setStu_name(String stu_name) {
        this.stu_name = stu_name;
    }

    public int getStu_id() {
        return stu_id;
    }

    public void setStu_id(int stu_id) {
        this.stu_id = stu_id;
    }

    public int getClass_id() {
        return class_id;
    }

    public void setClass_id(int class_id) {
        this.class_id = class_id;
    }

    public float getGrade() {
        return grade;
    }

    public void setGrade(float grade) {
        this.grade = grade;
    }
}
